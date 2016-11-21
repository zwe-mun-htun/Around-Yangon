package com.dev.zwemunhtun.aroundyangon.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.dev.zwemunhtun.aroundyangon.AroundYangon;
import com.dev.zwemunhtun.aroundyangon.R;
import com.dev.zwemunhtun.aroundyangon.adapters.MenuGVAdapter;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private TextView tool_text;
    private GridView gridView;
    Intent intent=null;
    private ImageView slideImage;
    public int currentimageindex = 0;

    private int[] imgs={R.drawable.aywallpaper,R.drawable.wallpaper2,
            R.drawable.wallpaper3,R.drawable.wallpaper4,R.drawable.wallpaper5,R.drawable.wallpaper6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(false);

        tool_text= (TextView) findViewById(R.id.tool_text);
        tool_text.setText("Around Yangon");

        gridView= (GridView)findViewById(R.id.gridview);
        gridView.setAdapter(new MenuGVAdapter(this));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        intent = new Intent(MainActivity.this, BusStop.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(MainActivity.this, Cinema.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(MainActivity.this, FireStation.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(MainActivity.this, Hospital.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(MainActivity.this, Hotel.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(MainActivity.this, Pagodas.class);
                        startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(MainActivity.this, Park.class);
                        startActivity(intent);
                        break;
                    case 7:
                        intent = new Intent(MainActivity.this, Police.class);
                        startActivity(intent);
                        break;
                    case 8:
                        intent = new Intent(MainActivity.this, RailwayStation.class);
                        startActivity(intent);
                        break;
                    case 9:
                        intent = new Intent(MainActivity.this, Restaurant.class);
                        startActivity(intent);
                        break;
                    case 10:
                        intent = new Intent(MainActivity.this, ShoppingCenter.class);
                        startActivity(intent);
                        break;
                    case 11:
                        intent = new Intent(MainActivity.this, University.class);
                        startActivity(intent);
                        break;
                }
            }
        });

        slideshow();

        }

    private void slideshow() {
        final Handler mHandler = new Handler();
        final Runnable mUpdateResults = new Runnable() {
            public void run() {
                AnimateandSlideShow();
            }
        };
        int delay = 1000;
        int period = 8000;
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                mHandler.post(mUpdateResults);
            }
        }, delay, period);
    }

    private void AnimateandSlideShow() {
        slideImage = (ImageView) findViewById(R.id.slide_img);
        slideImage.setImageResource(imgs[currentimageindex % imgs.length]);
        currentimageindex++;
        Animation rotateimage = AnimationUtils.loadAnimation(this, R.anim.custom_anim);
        slideImage.startAnimation(rotateimage);
    }


    

}

