package com.dev.zwemunhtun.aroundyangon.model;

import java.io.Serializable;

/**
 * Created by ZweMunHtun on 7/6/2016.
 */
public class RvShoppingModel implements Serializable{
    private String shopName;
    private String shopImg;
    private String shopAbout;
    private String shopLoc;
    private String shopMap;

    public RvShoppingModel(){

    }

    public RvShoppingModel(String shopName, String shopImg , String shopAbout , String shopLoc,String shopMap){
        this.shopName=shopName;
        this.shopImg=shopImg;
        this.shopAbout=shopAbout;
        this.shopLoc=shopLoc;
        this.shopMap=shopMap;
    }

    public String getShopMap() {
        return shopMap;
    }

    public void setShopMap(String shopMap) {
        this.shopMap = shopMap;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopImg() {
        return shopImg;
    }

    public void setShopImg(String shopImg) {
        this.shopImg = shopImg;
    }

    public String getShopAbout() {
        return shopAbout;
    }

    public void setShopAbout(String shopAbout) {
        this.shopAbout = shopAbout;
    }

    public String getShopLoc() {
        return shopLoc;
    }

    public void setShopLoc(String shopLoc) {
        this.shopLoc = shopLoc;
    }
}
