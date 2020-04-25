package com.lab8;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestAlbums {
    public void testAlbums(){
        try{
            Database db = Database.getInstance();

            Connection con = db.getConnection();

            Statement stmt = con.createStatement();

            AlbumController albumController = new AlbumController(stmt);
            ArtistController artistController = new ArtistController(stmt);

            Artist artist = artistController.findByName("Fuego");

            albumController.create("Never back down", artist.getId(), 2010);

            Album album = albumController.findByArtist(artist.getId());

            assert album != null : "Find by artist id method doesn't find the album";

            assert album.getArtistId() == artist.getId() : "The album doesn't have the right artist id";

            assert album.getName().equals("Never back down") : "The album doesn't have the right name";

            assert album.getReleaseYear() == 2010 : "The album doesn't have the right release year";

            System.out.println("Toate testele pentru AlbumController au trecut cu succes");
        }
        catch(SQLException e) {
            System.out.println("Next error appeared: " + e);
        }
    }
}
