package com.lab8;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
       Database.getInstance();
       ArtistController artist=new ArtistController();
       AlbumController album =new AlbumController();

       album.create("Mike",1,2000);
       album.findByArtist(1);

        artist.create("Mike","America");
        artist.findByName("Mike");



    }
}
