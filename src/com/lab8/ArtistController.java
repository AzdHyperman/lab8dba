package com.lab8;

import java.io.ObjectInputStream;

public class ArtistController {
    private String name;
    private String country;

    public void create(String name, String country)
    {
        name= getName();
        country=getCountry();
    }
    public void findByName(String name)
    {
        if ((this.name).equals(name))
            (this.name)=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
