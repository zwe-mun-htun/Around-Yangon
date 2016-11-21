package com.dev.zwemunhtun.aroundyangon.activities;

import android.content.res.Resources;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dev.zwemunhtun.aroundyangon.AroundYangon;
import com.dev.zwemunhtun.aroundyangon.R;
import com.dev.zwemunhtun.aroundyangon.adapters.RvFireAdapter;
import com.dev.zwemunhtun.aroundyangon.model.RvFireModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import san.zgyi.uni.SanZtoU;

public class FireStation extends BaseActivity{

    private Toolbar fire_toolbar;
    private CollapsingToolbarLayout fire_col;
    private TextView fire_text;
    private RecyclerView rv_fire;
    private List<RvFireModel> fireList=new ArrayList<>();
    private RvFireAdapter rvFireAdapter;
    private ImageView fire_img;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire_station);

        conFigView();
        Picasso.with(AroundYangon.getContext()).load("https://s-media-cache-ak0.pinimg.com/originals/f7/40/47/f740479486b60e7db13ea2de3f2ca64a.jpg").error(R.mipmap.ic_launcher).into(fire_img);


        rv_fire= (RecyclerView) findViewById(R.id.rv_fire);
        rvFireAdapter=new RvFireAdapter(fireList);

        RecyclerView.LayoutManager manager=new LinearLayoutManager(getApplicationContext());
        rv_fire.setLayoutManager(manager);
        rv_fire.setItemAnimator(new DefaultItemAnimator());

        RvFireAdapter.OnItemClickListener itemClickListener=new RvFireAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {

                Resources res=getResources();
                String[] fire_ph=res.getStringArray(R.array.fire_ph_no);

                switch (position){
                    case 0:makeCall(fire_ph[0]);
                        break;
                    case 1:makeCall(fire_ph[1]);
                        break;
                    case 2:makeCall(fire_ph[2]);
                        break;
                    case 3:makeCall(fire_ph[3]);
                        break;
                    case 4:makeCall(fire_ph[4]);
                        break;
                    case 5:makeCall(fire_ph[5]);
                        break;
                    case 6:makeCall(fire_ph[6]);
                        break;
                    case 7:makeCall(fire_ph[7]);
                        break;
                    case 8:makeCall(fire_ph[8]);
                        break;
                    case 9:makeCall(fire_ph[9]);
                        break;
                    case 10:makeCall(fire_ph[10]);
                        break;
                    case 11:makeCall(fire_ph[11]);
                        break;
                    case 12:makeCall(fire_ph[12]);
                        break;
                    case 13:makeCall(fire_ph[13]);
                        break;
                    case 14:makeCall(fire_ph[14]);
                        break;
                    case 15:makeCall(fire_ph[15]);
                        break;
                    case 16:makeCall(fire_ph[16]);
                        break;
                    case 17:makeCall(fire_ph[17]);
                        break;
                    case 18:makeCall(fire_ph[18]);
                        break;
                    case 19:makeCall(fire_ph[19]);
                        break;
                    case 20:makeCall(fire_ph[20]);
                        break;
                    case 21:makeCall(fire_ph[21]);
                        break;
                    case 22:makeCall(fire_ph[22]);
                        break;
                }
            }
        };

        rvFireAdapter.setOnItemClickListener(itemClickListener);
        rv_fire.setAdapter(rvFireAdapter);

        prepare();
    }

    private void conFigView(){

        fire_img= (ImageView) findViewById(R.id.col_img_fire);

        fire_col= (CollapsingToolbarLayout) findViewById(R.id.col_fire);
        fire_col.setTitleEnabled(false);

        toolbarAndTitle();

    }

    private void toolbarAndTitle() {

        fire_toolbar= (Toolbar) findViewById(R.id.fire_toolbar);
        fire_text= (TextView) findViewById(R.id.fire_tooltext);
        setSupportActionBar(fire_toolbar);
        final ActionBar fire_actionBar=getSupportActionBar();
        fire_actionBar.setDisplayHomeAsUpEnabled(true);
        fire_actionBar.setDisplayShowTitleEnabled(false);
        fire_text.setText("Fire Station");

    }

    private void prepare() {
        Resources res=getResources();
        String[] fireName=res.getStringArray(R.array.fire_name);
        for (int i=0;i<fireName.length;i++)
        {
            RvFireModel fire=new RvFireModel(fireName[i]);
            fireList.add(fire);
        }

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
