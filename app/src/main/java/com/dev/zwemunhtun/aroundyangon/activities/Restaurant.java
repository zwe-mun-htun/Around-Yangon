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
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.dev.zwemunhtun.aroundyangon.AroundYangon;
import com.dev.zwemunhtun.aroundyangon.R;
import com.dev.zwemunhtun.aroundyangon.adapters.RvRestaurantAdapter;
import com.dev.zwemunhtun.aroundyangon.db.DataContract;
import com.dev.zwemunhtun.aroundyangon.db.DataProvider;
import com.dev.zwemunhtun.aroundyangon.model.RestruantData;
import com.dev.zwemunhtun.aroundyangon.model.RvRestaurantModel;

import java.util.ArrayList;
import java.util.List;

public class Restaurant extends AppCompatActivity {

    private Toolbar res_toolbar;
    private TextView res_tool_text;
    private DataProvider db;
    private RecyclerView rv_restruant;
    private List<RvRestaurantModel> restaurantList;
    private RvRestaurantAdapter rvRestaurantAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        res_toolbar= (Toolbar) findViewById(R.id.res_toolbar);
        res_tool_text= (TextView) findViewById(R.id.res_toolbar_title);
        res_tool_text.setText("Restaurant");
        setSupportActionBar(res_toolbar);
        final ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);

        conFigView();

    }

    private void conFigView() {

        db=new DataProvider(AroundYangon.getContext());

        rv_restruant= (RecyclerView) findViewById(R.id.rv_restruant);
        rv_restruant.setHasFixedSize(true);

        RecyclerView.LayoutManager manager=new GridLayoutManager(AroundYangon.getContext(),2);
        rv_restruant.setLayoutManager(manager);

        restaurantList=new ArrayList<>();
        restaurantList=db.getAllRestruant();
        if (restaurantList.size() <= 0){

            RestruantData.RestruantInfo(AroundYangon.getContext());
            restaurantList=db.getAllRestruant();

        }

        rvRestaurantAdapter= new RvRestaurantAdapter(AroundYangon.getContext(), restaurantList);

        RvRestaurantAdapter.OnItemClickListener itemClickListener=new RvRestaurantAdapter.OnItemClickListener() {
            @Override
            public void OnItemClick(View view, int position) {
                RvRestaurantModel rvRestaurantModel=rvRestaurantAdapter.selectRestaurant(position);
                Intent intent=new Intent(AroundYangon.getContext(),RestaurantDetails.class);
                intent.putExtra(DataContract.RestaurantTable.TABLE_NAME,rvRestaurantModel);
                startActivity(intent);
            }
        };

        rvRestaurantAdapter.setOnItemClickListener(itemClickListener);

        rv_restruant.setAdapter(rvRestaurantAdapter);
    }

    @Override
    protected void onStop() {
        db.close();
        super.onStop();
    }
}
