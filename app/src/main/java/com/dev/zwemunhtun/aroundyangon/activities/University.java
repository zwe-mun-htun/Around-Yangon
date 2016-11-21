package com.dev.zwemunhtun.aroundyangon.activities;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.dev.zwemunhtun.aroundyangon.AroundYangon;
import com.dev.zwemunhtun.aroundyangon.R;
import com.dev.zwemunhtun.aroundyangon.adapters.RvUniversityAdapter;
import com.dev.zwemunhtun.aroundyangon.db.DataContract;
import com.dev.zwemunhtun.aroundyangon.db.DataProvider;
import com.dev.zwemunhtun.aroundyangon.model.RvUniversityModel;
import com.dev.zwemunhtun.aroundyangon.model.UniversityData;

import java.util.ArrayList;
import java.util.List;

public class University extends AppCompatActivity {

    private RecyclerView rv_university;
    private DataProvider db;
    private List<RvUniversityModel> universityList;
    private RvUniversityAdapter rvUniversityAdapter;
    private RecyclerView.LayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university);

        Toolbar busTool= (Toolbar) findViewById(R.id.uni_toolbar);
        setSupportActionBar(busTool);
        TextView busToolText= (TextView) findViewById(R.id.uni_toolbar_title);
        busToolText.setText("University");

        final ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);

        conFigView();

    }
    private void conFigView() {

        db=new DataProvider(AroundYangon.getContext());

        rv_university= (RecyclerView) findViewById(R.id.rv_university);
        rv_university.setHasFixedSize(true);

        manager=new LinearLayoutManager(AroundYangon.getContext());
        rv_university.setLayoutManager(manager);

        universityList=new ArrayList<>();
        universityList=db.getAllUniversity();

        if (universityList.size()<=0){
            UniversityData.UniversityInfo(AroundYangon.getContext());
            universityList=db.getAllUniversity();
        }

        rvUniversityAdapter=new RvUniversityAdapter(AroundYangon.getContext(),universityList);
        RvUniversityAdapter.OnItemClickListener itemClickListener=new RvUniversityAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {

                RvUniversityModel universityModel=rvUniversityAdapter.selectUniversity(position);
                Intent intent=new Intent(AroundYangon.getContext(),UniversityDetails.class);
                intent.putExtra(DataContract.UniversityTable.TABLE_NAME,universityModel);
                startActivity(intent);
            }
        };
        rvUniversityAdapter.setOnItemClickListener(itemClickListener);
        rv_university.setAdapter(rvUniversityAdapter);


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
