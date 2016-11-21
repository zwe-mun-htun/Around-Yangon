package com.dev.zwemunhtun.aroundyangon.model;

import java.io.Serializable;

/**
 * Created by ZweMunHtun on 7/6/2016.
 */
public class RvUniversityModel implements Serializable{

    private String uniName;
    private String uniImg;
    private String uniDetails;
    private String uniAbout;
    private String uniLoc;
    private String uniPh;
    private String callPhone;


    public RvUniversityModel(){

    }

    public RvUniversityModel(String uniName, String uniImg , String uniDetails , String uniAbout , String uniLoc , String uniPh , String callPhone){
        this.uniName=uniName;
        this.uniImg=uniImg;
        this.uniDetails=uniDetails;
        this.uniAbout=uniAbout;
        this.uniLoc=uniLoc;
        this.uniPh=uniPh;
        this.callPhone=callPhone;

    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public String getUniImg() {
        return uniImg;
    }

    public void setUniImg(String uniImg) {
        this.uniImg = uniImg;
    }

    public String getUniDetails() {
        return uniDetails;
    }

    public void setUniDetails(String uniDetails) {
        this.uniDetails = uniDetails;
    }

    public String getUniAbout() {
        return uniAbout;
    }

    public void setUniAbout(String uniAbout) {
        this.uniAbout = uniAbout;
    }

    public String getUniLoc() {
        return uniLoc;
    }

    public void setUniLoc(String uniLoc) {
        this.uniLoc = uniLoc;
    }

    public String getUniPh() {
        return uniPh;
    }

    public void setUniPh(String uniPh) {
        this.uniPh = uniPh;
    }

    public String getCallPhone() {
        return callPhone;
    }

    public void setCallPhone(String callPhone) {
        this.callPhone = callPhone;
    }
}
