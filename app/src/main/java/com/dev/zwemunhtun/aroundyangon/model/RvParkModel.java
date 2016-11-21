package com.dev.zwemunhtun.aroundyangon.model;

import java.io.Serializable;

/**
 * Created by ZweMunHtun on 7/6/2016.
 */
public class RvParkModel implements Serializable {

    private String pakName;
    private String pakImg;
    private String pakHistory;
    private String pakLoc;
    private String pakMap;

    public RvParkModel(){

    }

    public RvParkModel(String pakName,String pakImg, String pakHistory, String pakLoc,String pakMap){
        this.pakName=pakName;
        this.pakImg=pakImg;
        this.pakHistory=pakHistory;
        this.pakLoc=pakLoc;
        this.pakMap=pakMap;

    }

    public String getPakMap() {
        return pakMap;
    }

    public void setPakMap(String pakMap) {
        this.pakMap = pakMap;
    }

    public String getPakName() {
        return pakName;
    }

    public void setPakName(String pakName) {
        this.pakName = pakName;
    }

    public String getPakHistory() {
        return pakHistory;
    }

    public void setPakHistory(String pakHistory) {
        this.pakHistory = pakHistory;
    }

    public String getPakLoc() {
        return pakLoc;
    }

    public void setPakLoc(String pakLoc) {
        this.pakLoc = pakLoc;
    }

    public String getPakImg() {
        return pakImg;
    }

    public void setPakImg(String pakImg) {
        this.pakImg = pakImg;
    }
}
