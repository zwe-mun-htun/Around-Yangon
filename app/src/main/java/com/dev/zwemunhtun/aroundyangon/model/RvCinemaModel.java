package com.dev.zwemunhtun.aroundyangon.model;

import java.io.Serializable;
import java.lang.ref.SoftReference;

/**
 * Created by ZweMunHtun on 7/6/2016.
 */
public class RvCinemaModel implements Serializable {
    private String cinemaName;
    private String cinemaImageUrl;
    private String cinemaDesc;
    private String cinemaLoc;
    private String cinemaPh;
    private String cinemaTime;

    public RvCinemaModel(){

    }

    public RvCinemaModel(String cinemaName, String cinemaImageUrl,String cinemaDesc,String cinemaLoc,String cinemaPh,String cinemaTime){
        this.cinemaName=cinemaName;
        this.cinemaImageUrl=cinemaImageUrl;
        this.cinemaDesc=cinemaDesc;
        this.cinemaLoc=cinemaLoc;
        this.cinemaPh=cinemaPh;
        this.cinemaTime=cinemaTime;

    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public void setCinemaImageUrl(String cinemaImageUrl) {
        this.cinemaImageUrl = cinemaImageUrl;
    }

    public void setCinemaDesc(String cinemaDesc) {
        this.cinemaDesc = cinemaDesc;
    }

    public void setCinemaLoc(String cinemaLoc) {
        this.cinemaLoc = cinemaLoc;
    }

    public void setCinemaTime(String cinemaTime) {
        this.cinemaTime = cinemaTime;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public String getCinemaImageUrl() {
        return cinemaImageUrl;
    }

    public String getCinemaDesc() {
        return cinemaDesc;
    }

    public String getCinemaLoc() {
        return cinemaLoc;
    }

    public String getCinemaTime() {
        return cinemaTime;
    }

    public String getCinemaPh() {
        return cinemaPh;
    }

    public void setCinemaPh(String cinemaPh) {
        this.cinemaPh = cinemaPh;
    }
}
