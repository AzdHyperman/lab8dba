package com.lab8;

public class Chart {
    private int albumId;
    private int rank;

    Chart(int albumId, int rank){
        this.albumId = albumId;
        this.rank = rank;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
