package com.dev.zwemunhtun.aroundyangon.activities;

import android.content.Intent;
import android.os.Parcelable;
import android.support.design.widget.AppBarLayout;
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
import android.widget.Toast;

import com.dev.zwemunhtun.aroundyangon.AroundYangon;
import com.dev.zwemunhtun.aroundyangon.R;
import com.dev.zwemunhtun.aroundyangon.adapters.RvCinemaAdapter;
import com.dev.zwemunhtun.aroundyangon.adapters.RvPoliceAdapter;
import com.dev.zwemunhtun.aroundyangon.db.DataContract;
import com.dev.zwemunhtun.aroundyangon.db.DataProvider;
import com.dev.zwemunhtun.aroundyangon.model.CinemaData;
import com.dev.zwemunhtun.aroundyangon.model.RvCinemaModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Cinema extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView c_toolbar_title;
    private RecyclerView.LayoutManager clayoutmanager;
    private DataProvider db;
    private RecyclerView rv_cinema;
    private List<RvCinemaModel> cinemaList;
    private RvCinemaAdapter rvCinemaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinema);

        toolbar= (Toolbar) findViewById(R.id.c_toolbar);
        c_toolbar_title= (TextView) findViewById(R.id.cinema_toolbar_title);
        c_toolbar_title.setText("Cinema");
        setSupportActionBar(toolbar);
        final ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);

        configView();


    }

    public void configView() {

        db=new DataProvider(AroundYangon.getContext());
        //rvCinemaAdapter=new RvCinemaAdapter(cinemaList);

        rv_cinema= (RecyclerView) findViewById(R.id.rv_cinema);
        rv_cinema.setHasFixedSize(true);

        clayoutmanager=new LinearLayoutManager(AroundYangon.getContext());
        rv_cinema.setLayoutManager(clayoutmanager);

        cinemaList=new ArrayList<>();
        cinemaList = db.getAllCinema();

        if (cinemaList.size() <= 0){
            CinemaData.CinemaInfo(AroundYangon.getContext());
            cinemaList=db.getAllCinema();
        }

        rvCinemaAdapter = new RvCinemaAdapter(AroundYangon.getContext(),cinemaList);
        RvCinemaAdapter.OnItemClickListener itemClickListener=new RvCinemaAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {

                RvCinemaModel cinemaModel=rvCinemaAdapter.selectCinema(position);
                Intent intent=new Intent(AroundYangon.getContext(), CinemaDetails.class);
                intent.putExtra(DataContract.CinemaTable.TABLE_NAME ,cinemaModel);
                startActivity(intent);
            }
        };

        rvCinemaAdapter.setOnItemClickListener(itemClickListener);
        rv_cinema.setAdapter(rvCinemaAdapter);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == android.R.id.home){
            onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStop() {
        db.close();
        super.onStop();
    }
}
