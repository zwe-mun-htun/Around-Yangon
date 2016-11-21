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
import com.dev.zwemunhtun.aroundyangon.adapters.RvParkAdapter;
import com.dev.zwemunhtun.aroundyangon.db.DataContract;
import com.dev.zwemunhtun.aroundyangon.db.DataProvider;
import com.dev.zwemunhtun.aroundyangon.model.ParkData;
import com.dev.zwemunhtun.aroundyangon.model.RvParkModel;

import java.util.ArrayList;
import java.util.List;

public class Park extends AppCompatActivity {

    private RecyclerView rv_park;
    private List<RvParkModel> parkList;
    private RvParkAdapter rvParkAdapter;
    private DataProvider db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_park);

        Toolbar busTool= (Toolbar) findViewById(R.id.park_toolbar);
        setSupportActionBar(busTool);
        TextView busToolText= (TextView) findViewById(R.id.park_toolbar_title);
        busToolText.setText("Park");

        final ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);

        conFigView();
    }

    private void conFigView() {

        db=new DataProvider(AroundYangon.getContext());

        rv_park= (RecyclerView) findViewById(R.id.rv_park);
        rv_park.setHasFixedSize(true);

        RecyclerView.LayoutManager manager=new LinearLayoutManager(AroundYangon.getContext());
        rv_park.setLayoutManager(manager);

        parkList=new ArrayList<>();
        parkList=db.getAllPark();

        if (parkList.size() <=0){
            ParkData.ParkInfo(AroundYangon.getContext());
            parkList=db.getAllPark();
        }
        rvParkAdapter=new RvParkAdapter(AroundYangon.getContext(),parkList);

        RvParkAdapter.OnItemCLickListener itemCLickListener=new RvParkAdapter.OnItemCLickListener() {
            @Override
            public void OnItemClick(View view, int position) {
                RvParkModel parkModel=rvParkAdapter.selectPark(position);
                Intent intent=new Intent(AroundYangon.getContext(),ParkDetails.class);
                intent.putExtra(DataContract.ParkTable.TABLE_NAME,parkModel);
                startActivity(intent);
            }
        };
        rvParkAdapter.setOnItemClickListener(itemCLickListener);
        rv_park.setAdapter(rvParkAdapter);

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
