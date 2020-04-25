package com.lab8;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Main {

    public static void run(){
        try {
            Database db = Database.getInstance();

            Connection con = db.getConnection();

            Statement stmt = con.createStatement();

            AlbumController albumController = new AlbumController(stmt);
            ArtistController artistController = new ArtistController(stmt);

            // artistController.createTable();
            // albumController.createTable();

            albumController.deleteFromDB();
            artistController.deleteFromDB();

            Generator generator = new Generator(stmt);

            generator.generateArtists(100, false);
            generator.generateAlbums(100, false);

            List<Album> albums = albumController.getAll();
            List<Artist> artists = artistController.getAll();

            System.out.println("List of artists: ");
            for (Artist artist : artists )
                System.out.println(artist);

            System.out.println("List of albums: ");
            for (Album album : albums )
                System.out.println(album);

            db.closeConnection();

        }
        catch (SQLException e) {
            System.out.println("Next error appeared: " + e);
        }
    }

    public static void main(String[] args) {
        run();

//        TestArtists testArtists = new TestArtists();
//        TestAlbums testAlbums = new TestAlbums();
//
//        testArtists.testArtists();
//        testAlbums.testAlbums();
    }
}
