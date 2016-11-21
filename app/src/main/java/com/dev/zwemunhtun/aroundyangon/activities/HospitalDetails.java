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
import com.dev.zwemunhtun.aroundyangon.model.RvHospitalModel;
import com.squareup.picasso.Picasso;

public class HospitalDetails extends BaseActivity {

    private CollapsingToolbarLayout hosCollapse;
    private Toolbar hosToolbar;
    private TextView hosName,hosType,hosAff,hosEmd,hosBed,hosFound,hosLoc,hosToolText;
    private ImageView hosImg;
    private RvHospitalModel hospitalModel;
    private FloatingActionButton fabHos;
    private String map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_details);


        Intent intent=getIntent();
        hospitalModel= (RvHospitalModel) intent.getSerializableExtra(DataContract.HospitalTable.TABLE_NAME);

        conFigView();

        hosName.setText(hospitalModel.getHosName());
        hosToolText.setText(hospitalModel.getHosName());
        hosType.setText(hospitalModel.getHosTYPE());
        hosAff.setText(hospitalModel.getHosAFF());
        hosEmd.setText(hospitalModel.getHosEMD());
        hosBed.setText(hospitalModel.getHosBed());
        hosFound.setText(hospitalModel.getHosFound());
        hosLoc.setText(hospitalModel.getHosLoc());
        Picasso.with(AroundYangon.getContext()).load(hospitalModel.getHosIMG()).error(R.drawable.error).into(hosImg);
        map=hospitalModel.getHosMap();

        fabHos= (FloatingActionButton) findViewById(R.id.hos_fab);
        fabHos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMap(map);
            }
        });

    }

    private void conFigView() {
        hosName= (TextView) findViewById(R.id.hos_name);
        hosType= (TextView) findViewById(R.id.hos_type);
        hosAff= (TextView) findViewById(R.id.hos_aff);
        hosEmd= (TextView) findViewById(R.id.hos_emd);
        hosBed= (TextView) findViewById(R.id.hos_bed);
        hosFound= (TextView) findViewById(R.id.hos_found);
        hosLoc= (TextView) findViewById(R.id.hos_loc);
        hosImg= (ImageView) findViewById(R.id.hos_col_img);
        hosCollapse= (CollapsingToolbarLayout) findViewById(R.id.hos_collap);
        hosCollapse.setTitleEnabled(false);
        toolBarAndTitle();
    }

    private void toolBarAndTitle() {
        hosToolbar= (Toolbar) findViewById(R.id.hos_col_bar);
        hosToolText= (TextView) findViewById(R.id.hos_toolbar_title);
        setSupportActionBar(hosToolbar);

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
