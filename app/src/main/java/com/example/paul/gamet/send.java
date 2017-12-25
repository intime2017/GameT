package com.example.paul.gamet;

import java.io.Serializable;

/**
 * Created by Paul on 12/16/2017.
 */

public class send implements Serializable {
    private String Tlatitude, Tlongitude;

    public send(String lat, String lon) {
        this.Tlatitude = lat;
        this.Tlongitude = lon;
    }

    public String getTlatitude() {
        return Tlatitude;
    }

    public String getTlongitude() {
        return Tlongitude;
    }
}