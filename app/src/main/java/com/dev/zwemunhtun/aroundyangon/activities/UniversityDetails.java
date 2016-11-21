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
import com.dev.zwemunhtun.aroundyangon.model.RvUniversityModel;
import com.squareup.picasso.Picasso;

public class UniversityDetails extends BaseActivity {

    private Toolbar uniToolbar;
    private CollapsingToolbarLayout uniCollapsingToolbar;
    private TextView uniName,uniDetails,uniAbout,uniLoc,uniContact,uniToolText;
    private ImageView uniImg;
    private RvUniversityModel universityModel;
    private String callPh;
    private FloatingActionButton uniFaB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university_details);

        Intent intent=getIntent();
        universityModel= (RvUniversityModel) intent.getSerializableExtra(DataContract.UniversityTable.TABLE_NAME);

        configsView();

        uniName.setText(universityModel.getUniName());
        uniToolText.setText(universityModel.getUniName());
        Picasso.with(AroundYangon.getContext()).load(universityModel.getUniImg()).error(R.drawable.error).into(uniImg);
        uniDetails.setText(universityModel.getUniDetails());
        uniAbout.setText(universityModel.getUniAbout());
        uniLoc.setText(universityModel.getUniLoc());
        uniContact.setText(universityModel.getUniPh());
        callPh=universityModel.getCallPhone();

        uniFaB= (FloatingActionButton) findViewById(R.id.uni_fab);
        uniFaB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeCall(callPh);
            }
        });

    }

    private void configsView() {

        uniName= (TextView) findViewById(R.id.uni_name);
        uniDetails= (TextView) findViewById(R.id.uni_details);
        uniAbout= (TextView) findViewById(R.id.uni_about);
        uniLoc= (TextView) findViewById(R.id.uni_loc);
        uniContact= (TextView) findViewById(R.id.uni_contact);
        uniImg= (ImageView) findViewById(R.id.uni_col_img);
        uniCollapsingToolbar= (CollapsingToolbarLayout) findViewById(R.id.uni_collapsing_toolbar);
        uniCollapsingToolbar.setTitleEnabled(false);

        toolbarAndTitle();
    }

    private void toolbarAndTitle() {
        uniToolbar= (Toolbar) findViewById(R.id.uni_col_toolbar);
        uniToolText= (TextView) findViewById(R.id.uni_toolbar_title);
        setSupportActionBar(uniToolbar);
        final ActionBar uniActionBar=getSupportActionBar();
        uniActionBar.setDisplayHomeAsUpEnabled(true);
        uniActionBar.setDisplayShowTitleEnabled(false);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if (id==android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }


}
