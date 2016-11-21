package com.dev.zwemunhtun.aroundyangon.model;

import java.io.Serializable;

/**
 * Created by ZweMunHtun on 7/6/2016.
 */
public class RvRestaurantModel implements Serializable {

    private String resName;
    private String resImage;
    private String resPrice;
    private String resCuisine;
    private String resMeal;
    private String resFea;
    private String resCond;
    private String resHour;
    private String resAdd;
    private String resPh;

    public RvRestaurantModel(){

    }

    public RvRestaurantModel(String resName, String resImage , String resPrice , String resCuisine ,
                             String resMeal , String resFea , String resCond , String resHour ,
                             String resAdd , String resPh){

        this.resName=resName;
        this.resImage=resImage;
        this.resPrice=resPrice;
        this.resCuisine=resCuisine;
        this.resMeal=resMeal;
        this.resFea=resFea;
        this.resCond=resCond;
        this.resHour=resHour;
        this.resAdd=resAdd;
        this.resPh=resPh;

    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public String getResImage() {
        return resImage;
    }

    public void setResImage(String resImage) {
        this.resImage = resImage;
    }

    public String getResPrice() {
        return resPrice;
    }

    public void setResPrice(String resPrice) {
        this.resPrice = resPrice;
    }

    public String getResCuisine() {
        return resCuisine;
    }

    public void setResCuisine(String resCuisine) {
        this.resCuisine = resCuisine;
    }

    public String getResMeal() {
        return resMeal;
    }

    public void setResMeal(String resMeal) {
        this.resMeal = resMeal;
    }

    public String getResFea() {
        return resFea;
    }

    public void setResFea(String resFea) {
        this.resFea = resFea;
    }

    public String getResCond() {
        return resCond;
    }

    public void setResCond(String resCond) {
        this.resCond = resCond;
    }

    public String getResHour() {
        return resHour;
    }

    public void setResHour(String resHour) {
        this.resHour = resHour;
    }

    public String getResAdd() {
        return resAdd;
    }

    public void setResAdd(String resAdd) {
        this.resAdd = resAdd;
    }

    public String getResPh() {
        return resPh;
    }

    public void setResPh(String resPh) {
        this.resPh = resPh;
    }
}
