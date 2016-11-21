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
import com.dev.zwemunhtun.aroundyangon.model.RvHotelModel;
import com.squareup.picasso.Picasso;

public class HotelDetails extends BaseActivity {

    private Toolbar hotToolbar;
    private CollapsingToolbarLayout hotCollapsingToolbarLayout;
    private TextView hotName,hotLoc,hotEmail,hotContact,hotToolText;
    private ImageView hotImg;
    private String hotPh;
    private RvHotelModel rvHotelModel;
    private FloatingActionButton hotFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_details);

        Intent intent=getIntent();
        rvHotelModel= (RvHotelModel) intent.getSerializableExtra(DataContract.HotelTable.TABLE_NAME);

        conFigView();
        hotName.setText(rvHotelModel.getHotName());
        hotToolText.setText(rvHotelModel.getHotName());
        hotLoc.setText(rvHotelModel.getHotLoc());
        hotEmail.setText(rvHotelModel.getHotEmail());
        hotContact.setText(rvHotelModel.getHotContact());
        Picasso.with(AroundYangon.getContext()).load(rvHotelModel.getHotImg()).error(R.drawable.error).into(hotImg);
        hotPh=rvHotelModel.getHotPh();
        hotFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeCall(hotPh);
            }
        });
    }

    private void conFigView() {
        hotName= (TextView) findViewById(R.id.hot_name);
        hotLoc= (TextView) findViewById(R.id.hot_loc);
        hotEmail= (TextView) findViewById(R.id.hot_email);
        hotContact= (TextView) findViewById(R.id.hot_contact);
        hotImg= (ImageView) findViewById(R.id.hot_col_img);
        hotFab= (FloatingActionButton) findViewById(R.id.hot_fab);
        hotCollapsingToolbarLayout= (CollapsingToolbarLayout) findViewById(R.id.hot_collapse);
        hotCollapsingToolbarLayout.setTitleEnabled(false);
        toolBarAndTitle();

    }

    private void toolBarAndTitle() {
        hotToolbar= (Toolbar) findViewById(R.id.hot_col_toolbar);
        hotToolText= (TextView) findViewById(R.id.hot_toolbar_title);

        setSupportActionBar(hotToolbar);
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
