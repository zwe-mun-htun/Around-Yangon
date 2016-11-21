package com.dev.zwemunhtun.aroundyangon.activities;

import android.content.Intent;
import android.support.v4.database.DatabaseUtilsCompat;
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
import com.dev.zwemunhtun.aroundyangon.adapters.RvHospitalAdapter;
import com.dev.zwemunhtun.aroundyangon.db.DataContract;
import com.dev.zwemunhtun.aroundyangon.db.DataProvider;
import com.dev.zwemunhtun.aroundyangon.model.HospitalData;
import com.dev.zwemunhtun.aroundyangon.model.RvHospitalModel;

import java.util.ArrayList;
import java.util.List;

public class Hospital extends AppCompatActivity {

    private RecyclerView rv_hospital;
    private List<RvHospitalModel> hospitalList;
    private RvHospitalAdapter rvHospitalAdapter;
    private DataProvider db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);

        Toolbar busTool= (Toolbar) findViewById(R.id.hos_toolbar);
        setSupportActionBar(busTool);
        TextView busToolText= (TextView) findViewById(R.id.hos_toolbar_title);
        busToolText.setText("Hospital");

        final ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        conFigView();
    }

    private void conFigView() {
        db=new DataProvider(AroundYangon.getContext());

        rv_hospital= (RecyclerView) findViewById(R.id.rv_hospital);
        rv_hospital.setHasFixedSize(true);

        RecyclerView.LayoutManager manager=new LinearLayoutManager(AroundYangon.getContext());
        rv_hospital.setLayoutManager(manager);

        hospitalList=new ArrayList<>();
        hospitalList=db.getAllHospital();

        if (hospitalList.size() <= 0){
            HospitalData.HospitalInfo(AroundYangon.getContext());
            hospitalList=db.getAllHospital();
        }
        rvHospitalAdapter=new RvHospitalAdapter(AroundYangon.getContext(),hospitalList);

        RvHospitalAdapter.OnItemCLickListener itemCLickListener=new RvHospitalAdapter.OnItemCLickListener() {
            @Override
            public void onClick(View view, int position) {
                RvHospitalModel hospitalModel=rvHospitalAdapter.selectHospital(position);
                Intent intent=new Intent(AroundYangon.getContext(),HospitalDetails.class);
                intent.putExtra(DataContract.HospitalTable.TABLE_NAME,hospitalModel);
                startActivity(intent);
            }
        };
        rvHospitalAdapter.setOnItemClickListener(itemCLickListener);
        rv_hospital.setAdapter(rvHospitalAdapter);

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
