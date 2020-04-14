package com.lab8;

public class AlbumController {
    private String name;
    private int artistId;
    private int releaseYear;

public void create(String name, int artistId, int releaseYear)
{
if(getName()==name) this.name=name;
if(getArtistId()==artistId) this.artistId=artistId;
if(getReleaseYear()==releaseYear) this.releaseYear=releaseYear;
}
public void findByArtist(int artistId)
{
    if(getArtistId()==artistId)
        this.artistId=artistId;
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
