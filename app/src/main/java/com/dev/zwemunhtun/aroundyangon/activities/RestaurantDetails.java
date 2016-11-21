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

import com.dev.zwemunhtun.aroundyangon.AroundYangon;
import com.dev.zwemunhtun.aroundyangon.R;
import com.dev.zwemunhtun.aroundyangon.db.DataContract;
import com.dev.zwemunhtun.aroundyangon.model.RvRestaurantModel;
import com.squareup.picasso.Picasso;

public class RestaurantDetails extends BaseActivity {

    private Toolbar resDetailToolbar;
    private CollapsingToolbarLayout resCollapsingToolbarLayout;
    private TextView resToolText,resName,resPrice,resCuisine,resMeals,resFea,resCond,resHour,resAddress;
    private ImageView resImg;
    private RvRestaurantModel restaurantModel;
    private String resPh;
    private FloatingActionButton resFab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_details);

        Intent intent=getIntent();
        restaurantModel= (RvRestaurantModel) intent.getSerializableExtra(DataContract.RestaurantTable.TABLE_NAME);

        conFigsView();

        resName.setText(restaurantModel.getResName());
        Picasso.with(AroundYangon.getContext()).load(restaurantModel.getResImage()).error(R.drawable.error).into(resImg);
        resToolText.setText(restaurantModel.getResName());
        resPrice.setText(restaurantModel.getResPrice());
        resCuisine.setText(restaurantModel.getResCuisine());
        resMeals.setText(restaurantModel.getResMeal());
        resFea.setText(restaurantModel.getResFea());
        resCond.setText(restaurantModel.getResCond());
        resHour.setText(restaurantModel.getResHour());
        resAddress.setText(restaurantModel.getResAdd());
        resPh=restaurantModel.getResPh();

        resFab= (FloatingActionButton) findViewById(R.id.res_fab);
        resFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeCall(resPh);
            }
        });
    }

    private void conFigsView() {

        resName= (TextView) findViewById(R.id.res_name);
        resImg= (ImageView) findViewById(R.id.res_col_img);
        resPrice= (TextView) findViewById(R.id.res_price);
        resCuisine= (TextView) findViewById(R.id.res_cuisine);
        resMeals= (TextView) findViewById(R.id.res_meal);
        resFea= (TextView) findViewById(R.id.res_fea);
        resCond= (TextView) findViewById(R.id.res_cond);
        resHour= (TextView) findViewById(R.id.res_hour);
        resAddress= (TextView) findViewById(R.id.res_address);


        resCollapsingToolbarLayout= (CollapsingToolbarLayout) findViewById(R.id.res_collapsing_toolbar);
        resCollapsingToolbarLayout.setTitleEnabled(false);
        toolbarAndTitle();
    }

    private void toolbarAndTitle() {

        resDetailToolbar= (Toolbar) findViewById(R.id.res_detail_toolbar);
        resToolText= (TextView) findViewById(R.id.res_detail_text);
        setSupportActionBar(resDetailToolbar);
        final ActionBar resActionBar=getSupportActionBar();
        resActionBar.setDisplayHomeAsUpEnabled(true);
        resActionBar.setDisplayShowTitleEnabled(false);
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
