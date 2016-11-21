package com.dev.zwemunhtun.aroundyangon.model;

import java.io.Serializable;

/**
 * Created by ZweMunHtun on 7/6/2016.
 */
public class RvHotelModel implements Serializable {
    private String hotName;
    private String hotImg;
    private String hotLoc;
    private String hotEmail;
    private String hotContact;
    private String hotPh;

    public RvHotelModel(){

    }

    public RvHotelModel(String hotName, String hotImg, String hotLoc, String hotEmail ,String hotContact, String hotPh){
        this.hotName=hotName;
        this.hotImg=hotImg;
        this.hotLoc=hotLoc;
        this.hotEmail=hotEmail;
        this.hotContact=hotContact;
        this.hotPh=hotPh;
    }

    public String getHotName() {
        return hotName;
    }

    public void setHotName(String hotName) {
        this.hotName = hotName;
    }

    public String getHotImg() {
        return hotImg;
    }

    public void setHotImg(String hotImg) {
        this.hotImg = hotImg;
    }

    public String getHotLoc() {
        return hotLoc;
    }

    public void setHotLoc(String hotLoc) {
        this.hotLoc = hotLoc;
    }

    public String getHotEmail() {
        return hotEmail;
    }

    public void setHotEmail(String hotEmail) {
        this.hotEmail = hotEmail;
    }

    public String getHotContact() {
        return hotContact;
    }

    public void setHotContact(String hotContact) {
        this.hotContact = hotContact;
    }

    public String getHotPh() {
        return hotPh;
    }

    public void setHotPh(String hotPh) {
        this.hotPh = hotPh;
    }
}
