package com.dev.zwemunhtun.aroundyangon.activities;

import android.content.Intent;
import android.content.res.Resources;
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
import com.dev.zwemunhtun.aroundyangon.adapters.RvRailwayAdapter;
import com.dev.zwemunhtun.aroundyangon.model.RvRailwayModel;

import java.util.ArrayList;
import java.util.List;

public class RailwayStation extends AppCompatActivity {

    private RecyclerView rv_railway;
    private List<RvRailwayModel> railwayList=new ArrayList<>();
    private RvRailwayAdapter rvRailwayAdapter;
    private String[] train;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_railway_station);

        Toolbar busTool= (Toolbar) findViewById(R.id.rs_toolbar);
        setSupportActionBar(busTool);
        TextView busToolText= (TextView) findViewById(R.id.rs_toolbar_title);
        busToolText.setText("Railway Station");

        final ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);

        rv_railway= (RecyclerView) findViewById(R.id.rv_railway);
        rvRailwayAdapter=new RvRailwayAdapter(railwayList);

        RecyclerView.LayoutManager manager=new LinearLayoutManager(getApplicationContext());
        rv_railway.setLayoutManager(manager);
        rv_railway.setItemAnimator(new DefaultItemAnimator());
        RvRailwayAdapter.OnItemClickListener itemClickListener=new RvRailwayAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Resources res=getResources();
                train=res.getStringArray(R.array.train);
                  switch (position){
                      case 0:
                          intent=new Intent(AroundYangon.getContext(),RailwayDetail.class);
                          intent.putExtra("Train",train);
                          startActivity(intent);
                          break;
                      case 1:

                          intent=new Intent(AroundYangon.getContext(),RailwayDetail.class);
                          intent.putExtra("Train",train);
                          startActivity(intent);
                          break;
                      case 2:
                          intent=new Intent(AroundYangon.getContext(),RailwayDetail.class);
                          intent.putExtra("Train",train);
                          startActivity(intent);
                          break;
                      case 3:

                          intent=new Intent(AroundYangon.getContext(),RailwayDetail.class);
                          intent.putExtra("Train",train);
                          startActivity(intent);
                          break;
                      case 4:
                          intent=new Intent(AroundYangon.getContext(),RailwayDetail.class);
                          intent.putExtra("Train",train);
                          startActivity(intent);
                          break;
                      case 5:
                          intent=new Intent(AroundYangon.getContext(),RailwayDetail.class);
                          intent.putExtra("Train",train);
                          startActivity(intent);
                          break;
                      case 6:

                          intent=new Intent(AroundYangon.getContext(),RailwayDetail.class);
                          intent.putExtra("Train",train);
                          startActivity(intent);
                          break;
                      case 7:

                          intent=new Intent(AroundYangon.getContext(),RailwayDetail.class);
                          intent.putExtra("Train",train);
                          startActivity(intent);
                          break;
                      case 8:

                          intent=new Intent(AroundYangon.getContext(),RailwayDetail.class);
                          intent.putExtra("Train",train);
                          startActivity(intent);
                          break;
                      case 9:
                          Intent intent=new Intent(AroundYangon.getContext(),RailwayDetail.class);
                          intent.putExtra("Train",train);
                          startActivity(intent);
                          break;

                  }
            }
        };
        rvRailwayAdapter.setOnItemClickListener(itemClickListener);
        rv_railway.setAdapter(rvRailwayAdapter);

        prepare();

    }

    private void prepare() {
        RvRailwayModel railway=new RvRailwayModel("ရန္ကုန္ဘူတာျကီး ");
        railwayList.add(railway);
        railway=new RvRailwayModel("ဘုရားလမ္းဘူတာ");
        railwayList.add(railway);
        railway=new RvRailwayModel("လမ္းမေတာ္ဘူတာ");
        railwayList.add(railway);
        railway=new RvRailwayModel("ျပည္လမ္းဘူတာ ");
        railwayList.add(railway);
        railway=new RvRailwayModel("ရွမ္းလမ္းဘူတာ ");
        railwayList.add(railway);
        railway=new RvRailwayModel("အလုံလမ္းဘူတာ");
        railwayList.add(railway);
        railway=new RvRailwayModel("ပန္းလွုိင္လမ္းဘူတာ ");
        railwayList.add(railway);
        railway=new RvRailwayModel("ျကည့္ျမင့္တိုင္ဘူတာ");
        railwayList.add(railway);
        railway=new RvRailwayModel("ဟံသာ၀တီဘူတာ");
        railwayList.add(railway);
        railway=new RvRailwayModel("လွည္းတန္းဘူတာ");
        railwayList.add(railway);



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
