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
import com.dev.zwemunhtun.aroundyangon.adapters.RvHotelAdapter;
import com.dev.zwemunhtun.aroundyangon.db.DataContract;
import com.dev.zwemunhtun.aroundyangon.db.DataProvider;
import com.dev.zwemunhtun.aroundyangon.model.HotelData;
import com.dev.zwemunhtun.aroundyangon.model.RvHotelModel;

import java.util.ArrayList;
import java.util.List;

public class Hotel extends AppCompatActivity {

    private RecyclerView rv_hotel;
    private List<RvHotelModel> hotelList;
    private RvHotelAdapter rvHotelAdapter;
    private DataProvider db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
        Toolbar busTool= (Toolbar) findViewById(R.id.hot_toolbar);
        setSupportActionBar(busTool);
        TextView busToolText= (TextView) findViewById(R.id.hot_toolbar_title);
        busToolText.setText("Hotel");

        final ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);

        conFigView();
    }

    private void conFigView(){

        db=new DataProvider(AroundYangon.getContext());

        rv_hotel= (RecyclerView) findViewById(R.id.rv_hotel);
        rv_hotel.setHasFixedSize(true);

        RecyclerView.LayoutManager manager=new LinearLayoutManager(getApplicationContext());
        rv_hotel.setLayoutManager(manager);

        hotelList=new ArrayList<>();
        hotelList=db.getAllHotel();

        if (hotelList.size() <= 0){
            HotelData.HotelInfo(AroundYangon.getContext());
            hotelList=db.getAllHotel();
        }
        rvHotelAdapter=new RvHotelAdapter(AroundYangon.getContext(),hotelList);
        RvHotelAdapter.OnItemClickListener itemClickListener=new RvHotelAdapter.OnItemClickListener() {
            @Override
            public void OnItemClick(View view, int position) {
                RvHotelModel hotelModel=rvHotelAdapter.selectHotel(position);
                Intent intent=new Intent(AroundYangon.getContext(),HotelDetails.class);
                intent.putExtra(DataContract.HotelTable.TABLE_NAME,hotelModel);
                startActivity(intent);
            }
        };
        rvHotelAdapter.setOnItemClickListener(itemClickListener);

        rv_hotel.setAdapter(rvHotelAdapter);


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
