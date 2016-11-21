package com.dev.zwemunhtun.aroundyangon;

import android.Manifest;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;

/**
 * Created by ZweMunHtun on 7/6/2016.
 */
public class AroundYangon extends Application {
    private static Context context;


    @Override
    public void onCreate() {
        super.onCreate();

        context = getApplicationContext();

    }

    @Override
    public void onTerminate() {
        super.onTerminate();

        context = null;

    }

    public static Context getContext() {
        return context;
    }

}
