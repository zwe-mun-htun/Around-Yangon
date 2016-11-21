package com.dev.zwemunhtun.aroundyangon.activities;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.dev.zwemunhtun.aroundyangon.AroundYangon;
import com.dev.zwemunhtun.aroundyangon.R;
import com.dev.zwemunhtun.aroundyangon.adapters.RvShoppingAdapter;
import com.dev.zwemunhtun.aroundyangon.db.DataContract;
import com.dev.zwemunhtun.aroundyangon.db.DataProvider;
import com.dev.zwemunhtun.aroundyangon.model.RvShoppingModel;
import com.dev.zwemunhtun.aroundyangon.model.ShoppingData;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCenter extends AppCompatActivity {

    private RecyclerView rv_shopping;
    private List<RvShoppingModel> shoppingList;
    private RvShoppingAdapter rvShoppingAdapter;
    private DataProvider db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_center);

        Toolbar busTool= (Toolbar) findViewById(R.id.shop_toolbar);
        setSupportActionBar(busTool);
        TextView busToolText= (TextView) findViewById(R.id.shop_toolbar_title);
        busToolText.setText("Shopping Center");

        final ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);

        conFigView();

    }

    private void conFigView(){
        db=new DataProvider(AroundYangon.getContext());

        rv_shopping= (RecyclerView) findViewById(R.id.rv_shopping);
        rv_shopping.setHasFixedSize(true);

        RecyclerView.LayoutManager manager=new LinearLayoutManager(AroundYangon.getContext());
        rv_shopping.setLayoutManager(manager);

        shoppingList=new ArrayList<>();
        shoppingList=db.getAllShopping();
        if (shoppingList.size() <= 0){
            ShoppingData.ShoppingInfo(AroundYangon.getContext());
            shoppingList=db.getAllShopping();
        }

        rvShoppingAdapter=new RvShoppingAdapter(AroundYangon.getContext(),shoppingList);
        RvShoppingAdapter.OnItemClickListener itemClickListener=new RvShoppingAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                RvShoppingModel shoppingModel=rvShoppingAdapter.selectShopping(position);
                Intent intent=new Intent(AroundYangon.getContext(),ShoppingDetails.class);
                intent.putExtra(DataContract.ShoppingTable.TABLE_NAME,shoppingModel);
                startActivity(intent);
            }
        };
        rvShoppingAdapter.setOnItemClickListener(itemClickListener);
        rv_shopping.setAdapter(rvShoppingAdapter);

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
