package com.dev.zwemunhtun.aroundyangon.model;

import java.io.Serializable;

/**
 * Created by ZweMunHtun on 7/6/2016.
 */
public class RvHospitalModel implements Serializable{

    private String hosName,hosIMG,hosTYPE,hosAFF,hosEMD,hosBed,hosFound,hosLoc,hosMap;

    public RvHospitalModel(){

    }

    public RvHospitalModel(String hosName,String hosIMG,String hosTYPE,String hosAFF,String hosEMD,String hosBed,String hosFound,String hosLoc,String hosMap){
        this.hosName=hosName;
        this.hosIMG=hosIMG;
        this.hosTYPE=hosTYPE;
        this.hosAFF=hosAFF;
        this.hosEMD=hosEMD;
        this.hosBed=hosBed;
        this.hosFound=hosFound;
        this.hosLoc=hosLoc;
        this.hosMap=hosMap;

    }

    public String getHosMap() {
        return hosMap;
    }

    public void setHosMap(String hosMap) {
        this.hosMap = hosMap;
    }

    public String getHosName() {
        return hosName;
    }

    public void setHosName(String hosName) {
        this.hosName = hosName;
    }

    public String getHosIMG() {
        return hosIMG;
    }

    public void setHosIMG(String hosIMG) {
        this.hosIMG = hosIMG;
    }

    public String getHosTYPE() {
        return hosTYPE;
    }

    public void setHosTYPE(String hosTYPE) {
        this.hosTYPE = hosTYPE;
    }

    public String getHosAFF() {
        return hosAFF;
    }

    public void setHosAFF(String hosAFF) {
        this.hosAFF = hosAFF;
    }

    public String getHosEMD() {
        return hosEMD;
    }

    public void setHosEMD(String hosEMD) {
        this.hosEMD = hosEMD;
    }

    public String getHosBed() {
        return hosBed;
    }

    public void setHosBed(String hosBed) {
        this.hosBed = hosBed;
    }

    public String getHosFound() {
        return hosFound;
    }

    public void setHosFound(String hosFound) {
        this.hosFound = hosFound;
    }

    public String getHosLoc() {
        return hosLoc;
    }

    public void setHosLoc(String hosLoc) {
        this.hosLoc = hosLoc;
    }
}
