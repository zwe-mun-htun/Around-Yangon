package com.dev.zwemunhtun.aroundyangon.activities;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.dev.zwemunhtun.aroundyangon.AroundYangon;
import com.dev.zwemunhtun.aroundyangon.R;
import com.dev.zwemunhtun.aroundyangon.adapters.RvPagodasAdapter;
import com.dev.zwemunhtun.aroundyangon.db.DataContract;
import com.dev.zwemunhtun.aroundyangon.db.DataProvider;
import com.dev.zwemunhtun.aroundyangon.model.PagodasData;
import com.dev.zwemunhtun.aroundyangon.model.RvPagodasModel;

import java.util.ArrayList;
import java.util.List;

public class Pagodas extends AppCompatActivity {

    private RecyclerView rv_pagodas;
    private List<RvPagodasModel> pagodasList=new ArrayList<>();
    private RvPagodasAdapter rvPagodasAdapter;
    private  RecyclerView.LayoutManager manager;
    private DataProvider db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagodas);

        Toolbar busTool= (Toolbar) findViewById(R.id.pag_toolbar);
        setSupportActionBar(busTool);
        TextView busToolText= (TextView) findViewById(R.id.pag_toolbar_title);
        busToolText.setText("Pagodas");

        final ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);

        conFigView();
    }

    private void conFigView() {
        db=new DataProvider(AroundYangon.getContext());

        rv_pagodas= (RecyclerView) findViewById(R.id.rv_pagodas);
        rv_pagodas.setHasFixedSize(true);

        manager=new LinearLayoutManager(AroundYangon.getContext());
        rv_pagodas.setLayoutManager(manager);

        pagodasList=new ArrayList<>();
        pagodasList=db.getAllPagoda();

        if (pagodasList.size() <=0){
            PagodasData.PagodaInfo(AroundYangon.getContext());
            pagodasList=db.getAllPagoda();
        }

        rvPagodasAdapter=new RvPagodasAdapter(AroundYangon.getContext(),pagodasList);
        RvPagodasAdapter.OnItemClickListener itemClickListener=new RvPagodasAdapter.OnItemClickListener() {
            @Override
            public void OnItemClick(View view, int position) {
                RvPagodasModel pagodasModel=rvPagodasAdapter.selectPagoda(position);
                Intent intent=new Intent(AroundYangon.getContext(),PagodasDetails.class);
                intent.putExtra(DataContract.PagodaTable.TABLE_NAME,pagodasModel);
                startActivity(intent);
            }
        };
        rvPagodasAdapter.setOnItemClickListener(itemClickListener);
        rv_pagodas.setAdapter(rvPagodasAdapter);

    }

    @Override
    protected void onStop() {
        db.close();
        super.onStop();
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
