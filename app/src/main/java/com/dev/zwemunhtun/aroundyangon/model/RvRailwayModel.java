package com.dev.zwemunhtun.aroundyangon.model;

/**
 * Created by ZweMunHtun on 7/6/2016.
 */
public class RvRailwayModel {
    public int image;
    public String title;

    public RvRailwayModel(){

    }

    public RvRailwayModel(String title){
        this.title=title;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
