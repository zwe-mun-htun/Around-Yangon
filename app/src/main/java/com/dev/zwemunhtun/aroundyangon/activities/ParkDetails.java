package com.dev.zwemunhtun.aroundyangon.activities;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dev.zwemunhtun.aroundyangon.AroundYangon;
import com.dev.zwemunhtun.aroundyangon.R;
import com.dev.zwemunhtun.aroundyangon.db.DataContract;
import com.dev.zwemunhtun.aroundyangon.model.RvParkModel;
import com.squareup.picasso.Picasso;

public class ParkDetails extends BaseActivity{

    private Toolbar pakToolBar;
    private CollapsingToolbarLayout pakCollapsingToolbarLayout;
    private ImageView pakImg;
    private TextView pakName,pakHistory,pakLoc,pakToolTitle;
    private RvParkModel parkModel;
    private FloatingActionButton fabPark;
    private String map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_park_details);
        Intent intent=getIntent();
        parkModel= (RvParkModel) intent.getSerializableExtra(DataContract.ParkTable.TABLE_NAME);

        configView();

        pakName.setText(parkModel.getPakName());
        pakToolTitle.setText(parkModel.getPakName());
        pakHistory.setText(parkModel.getPakHistory());
        pakLoc.setText(parkModel.getPakLoc());
        Picasso.with(AroundYangon.getContext()).load(parkModel.getPakImg()).error(R.drawable.error).into(pakImg);
        map=parkModel.getPakMap();
        fabPark= (FloatingActionButton) findViewById(R.id.park_fab);
        fabPark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMap(map);
            }
        });
    }

    private void configView() {
        pakName= (TextView) findViewById(R.id.pak_name);
        pakHistory= (TextView) findViewById(R.id.pak_his);
        pakLoc= (TextView) findViewById(R.id.pak_loc);
        pakImg= (ImageView) findViewById(R.id.pak_col_img);
        pakCollapsingToolbarLayout= (CollapsingToolbarLayout) findViewById(R.id.pak_collapse);
        pakCollapsingToolbarLayout.setTitleEnabled(false);
        toolBarAndTitle();
    }

    private void toolBarAndTitle() {
        pakToolBar=(Toolbar) findViewById(R.id.pak_col_toolbar);
        pakToolTitle= (TextView) findViewById(R.id.pak_toolbar_title);

        setSupportActionBar(pakToolBar);
        final ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
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
