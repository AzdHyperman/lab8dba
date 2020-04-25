package com.lab8;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestArtists {
    public void testArtists(){
        try{
            Database db = Database.getInstance();

            Connection con = db.getConnection();

            Statement stmt = con.createStatement();

            ArtistController artistController = new ArtistController(stmt);

            artistController.create("Fuego", "Romania");

            Artist artist = artistController.findByName("Fuego");

            assert artist != null : "Find by name method doesn't find the artist";

            assert artist.getName().equals("Fuego") : "The artist doesn't have the right name";

            assert artist.getCountry().equals("Romania") : "The artist doesn't have the right country";

            System.out.println("Toate testele pentru ArtistController au trecut cu succes");

        }
        catch(SQLException e) {
            System.out.println("Next error appeared: " + e);
        }
    }
}
