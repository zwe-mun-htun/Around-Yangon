package com.dev.zwemunhtun.aroundyangon.model;

import java.io.Serializable;

/**
 * Created by ZweMunHtun on 7/6/2016.
 */
public class RvPagodasModel implements Serializable{

    private String pagName;
    private String pagImg;
    private String pagHistory;
    private String pagMap;

    public RvPagodasModel(){

    }

    public RvPagodasModel(String pagName, String pagImg , String pagHistory,String pagMap){
        this.pagName=pagName;
        this.pagImg=pagImg;
        this.pagHistory=pagHistory;
        this.pagMap=pagMap;
    }

    public String getPagMap() {
        return pagMap;
    }

    public void setPagMap(String pagMap) {
        this.pagMap = pagMap;
    }

    public String getPagName() {
        return pagName;
    }

    public void setPagName(String pagName) {
        this.pagName = pagName;
    }

    public String getPagImg() {
        return pagImg;
    }

    public void setPagImg(String pagImg) {
        this.pagImg = pagImg;
    }

    public String getPagHistory() {
        return pagHistory;
    }

    public void setPagHistory(String pagHistory) {
        this.pagHistory = pagHistory;
    }
}
