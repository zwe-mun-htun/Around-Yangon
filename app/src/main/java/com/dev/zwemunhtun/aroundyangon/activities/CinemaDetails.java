package com.dev.zwemunhtun.aroundyangon.activities;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.dev.zwemunhtun.aroundyangon.AroundYangon;
import com.dev.zwemunhtun.aroundyangon.R;
import com.dev.zwemunhtun.aroundyangon.db.DataContract;
import com.dev.zwemunhtun.aroundyangon.model.RvCinemaModel;
import com.squareup.picasso.Picasso;

public class CinemaDetails extends AppCompatActivity {

    private Toolbar cinema_toolbar;
    private CollapsingToolbarLayout collapsingToolbarLayout;
    private TextView tvName,tvDec,tvLoc,tvTime,tvToolbarTitle;
    private ImageView img_cinema;
    private RvCinemaModel cinemaModel;
    private FloatingActionButton fab;
    private String ph_no=null;
    private static final int MY_PERMISSIONS_REQUEST_CALL_PHONE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinema_details);

        Intent intent=getIntent();
        cinemaModel= (RvCinemaModel) intent.getSerializableExtra(DataContract.CinemaTable.TABLE_NAME);

        configsView();

        tvName.setText(cinemaModel.getCinemaName());
        tvDec.setText(cinemaModel.getCinemaDesc());
        tvLoc.setText(cinemaModel.getCinemaLoc());
        tvToolbarTitle.setText(cinemaModel.getCinemaName());
        Picasso.with(AroundYangon.getContext()).load(cinemaModel.getCinemaImageUrl()).error(R.drawable.error).into(img_cinema);
        ph_no=cinemaModel.getCinemaPh();
        tvTime.setText(cinemaModel.getCinemaTime());

        fab= (FloatingActionButton) findViewById(R.id.cinema_fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeCall(ph_no);
            }
        });


    }

    private void configsView() {
        tvName= (TextView) findViewById(R.id.cinema_name);
        tvDec= (TextView) findViewById(R.id.cinema_dec);
        tvLoc= (TextView) findViewById(R.id.cinema_loc);
        tvTime= (TextView) findViewById(R.id.cinema_time);
        img_cinema=(ImageView)findViewById(R.id.col_cinema);
        collapsingToolbarLayout= (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitleEnabled(false);
        toolbarAndTitle();
    }

    private void toolbarAndTitle() {
        cinema_toolbar=(Toolbar)findViewById(R.id.cinema_toolbar);
        tvToolbarTitle= (TextView) findViewById(R.id.toolbar_title);

        setSupportActionBar(cinema_toolbar);
        final ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
    }

    protected void makeCall(String number) {
        number.replaceAll(" ", "");
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + number));

        if (ActivityCompat.checkSelfPermission(AroundYangon.getContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            this.ph_no = number;
            
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.CALL_PHONE},
                    MY_PERMISSIONS_REQUEST_CALL_PHONE);

            return;
        }
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == android.R.id.home){
            onBackPressed();
        }
        
        return super.onOptionsItemSelected(item);
    }
}
