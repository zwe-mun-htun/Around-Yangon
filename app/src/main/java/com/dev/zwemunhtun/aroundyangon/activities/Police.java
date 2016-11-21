package com.dev.zwemunhtun.aroundyangon.activities;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
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
import com.dev.zwemunhtun.aroundyangon.adapters.RvPoliceAdapter;
import com.dev.zwemunhtun.aroundyangon.model.RvPoliceModel;

import java.util.ArrayList;
import java.util.List;

import san.zgyi.uni.SanZtoU;

public class Police extends BaseActivity {

    private RecyclerView rv_police;
    private List<RvPoliceModel> policeList=new ArrayList<>();
    private RvPoliceAdapter rvPoliceAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police);

        Toolbar busTool= (Toolbar) findViewById(R.id.polic_toolbar);
        setSupportActionBar(busTool);
        TextView busToolText= (TextView) findViewById(R.id.polic_toolbar_title);
        busToolText.setText("Police");

        final ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);

        rv_police= (RecyclerView) findViewById(R.id.rv_police);
        rvPoliceAdapter=new RvPoliceAdapter(policeList);

        RecyclerView.LayoutManager manager=new LinearLayoutManager(getApplicationContext());
        rv_police.setLayoutManager(manager);
        rv_police.setItemAnimator(new DefaultItemAnimator());
        RvPoliceAdapter.OnItemClickListener itemClickListener=new RvPoliceAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Resources res=getResources();
                String[] num=res.getStringArray(R.array.police_ph_no);
                 switch (position){
                     case 0:makeCall(num[0]);
                         break;
                     case 1:makeCall(num[1]);
                         break;
                     case 2:makeCall(num[2]);
                         break;
                     case 3:makeCall(num[3]);
                         break;
                     case 4:makeCall(num[4]);
                         break;
                     case 5:makeCall(num[5]);
                         break;
                     case 6:makeCall(num[6]);
                         break;
                     case 7:makeCall(num[7]);
                         break;
                     case 8:makeCall(num[8]);
                         break;
                     case 9:makeCall(num[9]);
                         break;
                     case 10:makeCall(num[10]);
                         break;
                     case 11:makeCall(num[11]);
                         break;
                     case 12:makeCall(num[12]);
                         break;
                     case 13:makeCall(num[13]);
                         break;
                     case 14:makeCall(num[14]);
                         break;
                     case 15:makeCall(num[15]);
                         break;
                     case 16:makeCall(num[16]);
                         break;
                     case 17:makeCall(num[17]);
                         break;
                     case 18:makeCall(num[18]);
                         break;
                     case 19:makeCall(num[19]);
                         break;
                     case 20:makeCall(num[20]);
                         break;
                     case 21:makeCall(num[21]);
                         break;
                     case 22:makeCall(num[22]);
                         break;
                     case 23:makeCall(num[23]);
                         break;
                     case 24:makeCall(num[24]);
                         break;
                     case 25:makeCall(num[25]);
                         break;
                     case 26:makeCall(num[26]);
                         break;
                     case 27:makeCall(num[27]);
                         break;
                     case 28:makeCall(num[28]);
                         break;
                     case 29:makeCall(num[29]);
                         break;
                     case 30:makeCall(num[30]);
                         break;
                     case 31:makeCall(num[31]);
                         break;
                     case 32:makeCall(num[32]);
                         break;
                     case 33:makeCall(num[33]);
                         break;
                     case 34:makeCall(num[34]);
                         break;
                     case 35:makeCall(num[35]);
                         break;
                     case 36:makeCall(num[36]);
                         break;
                     case 37:makeCall(num[37]);
                         break;
                     case 38:makeCall(num[38]);
                         break;
                     case 39:makeCall(num[39]);
                         break;
                     case 40:makeCall(num[40]);
                         break;
                     case 41:makeCall(num[41]);
                         break;
                     case 42:makeCall(num[42]);
                         break;
                     case 43:makeCall(num[43]);
                         break;
                 }
            }
        };
        rvPoliceAdapter.setOnItemClickListener(itemClickListener);
        rv_police.setAdapter(rvPoliceAdapter);

        prepare();
        new SanZtoU(this,this).ForceToZawGyi("zg.ttf", null);
    }

    private void prepare() {
        RvPoliceModel police=new RvPoliceModel("ေတာင္ဒဂုံ ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("ေျမာက္ဒဂုံ ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("ဒဂုံအေရွ႕ပိုင္း ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("ဒဂုံဆပ္ကမ္း ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("ဗိုလ္တေထာင္ ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("မဂၤလာေတာင္ညႊန္႔ ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("သာေကတ ၁ ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("သာေကတ ၂ ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("ေတာင္ဥကၠလာပ ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("ေျမာက္ဥကၠလာပ  ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("ေရႊေပါက္ကံ ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("ေဝဘာလီ ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("တာေမြ ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("သဃၤန္းကြ်န္း ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("သုဝဏၰ ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("ပုဇြန္ေတာင္ ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("ေဒါပုံ ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("ရန္ကင္း ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("မရမ္းကုန္း ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("ဘုရင့္ေနာင္ ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("လွိဳင္ ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("ပိေတာက္ေခ်ာင္း ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("ကမာရြတ္ ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("ဗဟန္း ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("စမ္းေခ်ာင္း ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("ျကည့္ျမင့္တိုင္ ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("စက္ဆမ္း ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("အလုံ ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("လမ္းမေတာ္ ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("လသာ ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("ပန္းပဲတန္း ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("ေက်ာက္တံတား ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("ဆိပ္ကမ္း ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("ဒလ ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("သန္လ်င္ ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("ေက်ာက္တန္း ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("အင္းစိန္ ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("မဂၤလာဒုံ ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("ေထာက္ျကံ႔ ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("လွိဳင္သာယာ ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("ေမွာ္ဘီ ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("လွည္းကူး ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("တိုက္ျကီး ရဲစခန္း");
        policeList.add(police);

        police=new RvPoliceModel("ေလွာ္ကား ရဲစခန္း");
        policeList.add(police);


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
