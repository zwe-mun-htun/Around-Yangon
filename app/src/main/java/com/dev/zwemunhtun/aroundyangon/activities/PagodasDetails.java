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
import com.dev.zwemunhtun.aroundyangon.model.RvPagodasModel;
import com.squareup.picasso.Picasso;

public class PagodasDetails extends BaseActivity {

    private Toolbar pagToolbar;
    private CollapsingToolbarLayout pagCollapsingToolbarLayout;
    private ImageView pagImg;
    private TextView pagName,pagHistory,pagToolText;
    private RvPagodasModel pagodasModel;
    private FloatingActionButton fabPag;
    private String map;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagodas_details);

        Intent intent=getIntent();
        pagodasModel= (RvPagodasModel) intent.getSerializableExtra(DataContract.PagodaTable.TABLE_NAME);
        conFigViews();
        pagName.setText(pagodasModel.getPagName());
        pagHistory.setText(pagodasModel.getPagHistory());
        pagToolText.setText(pagodasModel.getPagName());
        Picasso.with(AroundYangon.getContext()).load(pagodasModel.getPagImg()).error(R.drawable.error).into(pagImg);
        map=pagodasModel.getPagMap();
        fabPag= (FloatingActionButton) findViewById(R.id.pag_fab);
        fabPag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMap(map);
            }
        });
    }

    private void conFigViews() {
        pagName= (TextView) findViewById(R.id.pagoda_name);
        pagHistory= (TextView) findViewById(R.id.pagoda_history);
        pagImg= (ImageView) findViewById(R.id.pag_col_img);
        pagToolText= (TextView) findViewById(R.id.pag_toolbar_title);
        pagCollapsingToolbarLayout= (CollapsingToolbarLayout) findViewById(R.id.pag_col_toolbar);
        pagCollapsingToolbarLayout.setTitleEnabled(false);
        toolBarAndTitle();
    }

    private void toolBarAndTitle() {
        pagToolbar= (Toolbar) findViewById(R.id.pag_toolbar);
        pagToolText= (TextView) findViewById(R.id.pag_toolbar_title);
        setSupportActionBar(pagToolbar);
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
