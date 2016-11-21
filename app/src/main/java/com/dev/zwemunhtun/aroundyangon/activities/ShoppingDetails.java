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
import android.widget.Toast;

import com.dev.zwemunhtun.aroundyangon.AroundYangon;
import com.dev.zwemunhtun.aroundyangon.R;
import com.dev.zwemunhtun.aroundyangon.db.DataContract;
import com.dev.zwemunhtun.aroundyangon.model.RvShoppingModel;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

public class ShoppingDetails extends BaseActivity {

    private Toolbar shopToolbar;
    private CollapsingToolbarLayout shopCollapsingToolbarLayout;
    private TextView shopName,shopAbout,shopLoc,shopTooltext;
    private ImageView shopImg;
    private RvShoppingModel shoppingModel;
    private FloatingActionButton fabShopping;
    private String map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_details);

        Intent intent=getIntent();
        shoppingModel= (RvShoppingModel) intent.getSerializableExtra(DataContract.ShoppingTable.TABLE_NAME);

        configsView();

        shopName.setText(shoppingModel.getShopName());
        shopTooltext.setText(shoppingModel.getShopName());
        shopAbout.setText(shoppingModel.getShopAbout());
        shopLoc.setText(shoppingModel.getShopLoc());
        Picasso.with(AroundYangon.getContext()).load(shoppingModel.getShopImg()).error(R.drawable.error).into(shopImg);
        map=shoppingModel.getShopMap();
        fabShopping= (FloatingActionButton) findViewById(R.id.shop_fab);
        fabShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMap(map);
            }
        });
    }

    private void configsView() {
        shopName= (TextView) findViewById(R.id.shop_name);
        shopAbout= (TextView) findViewById(R.id.shop_about);
        shopLoc= (TextView) findViewById(R.id.shop_loc);
        shopImg=(ImageView)findViewById(R.id.shop_col_img);
        shopCollapsingToolbarLayout= (CollapsingToolbarLayout) findViewById(R.id.shop_collapse);
        shopCollapsingToolbarLayout.setTitleEnabled(false);
        toolbarAndTitle();
    }

    private void toolbarAndTitle() {
        shopToolbar=(Toolbar)findViewById(R.id.shop_col_toolbar);
        shopTooltext= (TextView) findViewById(R.id.shop_toolbar_title);

        setSupportActionBar(shopToolbar);
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
