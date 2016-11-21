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
import android.widget.Toast;

import com.dev.zwemunhtun.aroundyangon.AroundYangon;
import com.dev.zwemunhtun.aroundyangon.R;
import com.dev.zwemunhtun.aroundyangon.adapters.RvBusAdapter;
import com.dev.zwemunhtun.aroundyangon.adapters.RvPoliceAdapter;
import com.dev.zwemunhtun.aroundyangon.model.RvBusModel;

import java.util.ArrayList;
import java.util.List;

public class BusStop extends AppCompatActivity {

    private RecyclerView rv_busstop;
    private List<RvBusModel> busStopList=new ArrayList<>();
    private RvBusAdapter busStopAdapter;
    private Resources res;
    String bus[]=null;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_stop);

        Toolbar busTool= (Toolbar) findViewById(R.id.bus_toolbar);
        setSupportActionBar(busTool);
        TextView busToolText= (TextView) findViewById(R.id.bus_toolbar_title);
         busToolText.setText("Bus");

        final ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);


        rv_busstop= (RecyclerView) findViewById(R.id.rv_busstop);

        busStopAdapter= new RvBusAdapter(busStopList);
        RecyclerView.LayoutManager manager=new LinearLayoutManager(getApplicationContext());
        rv_busstop.setLayoutManager(manager);
        rv_busstop.setItemAnimator(new DefaultItemAnimator());

        busStopAdapter.setOnItemClickListener(new RvBusAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
               switch (position){
                   case 0:
                       res=getResources();
                       bus=res.getStringArray(R.array.thakhinmya);
                       intent=new Intent(AroundYangon.getContext(),BusDetails.class);
                       intent.putExtra("Bus",bus);
                       startActivity(intent);
                       break;
                   case 1:
                       res=getResources();
                       bus=res.getStringArray(R.array.zoo);
                       intent=new Intent(AroundYangon.getContext(),BusDetails.class);
                       intent.putExtra("Bus",bus);
                       startActivity(intent);
                       break;
                   case 2:
                       res=getResources();
                       bus=res.getStringArray(R.array.thuwana);
                       intent=new Intent(AroundYangon.getContext(),BusDetails.class);
                       intent.putExtra("Bus",bus);
                       startActivity(intent);
                       break;
                   case 3:
                       res=getResources();
                       bus=res.getStringArray(R.array.tarmwe);
                       intent=new Intent(AroundYangon.getContext(),BusDetails.class);
                       intent.putExtra("Bus",bus);
                       startActivity(intent);
                       break;
                   case 4:
                       res=getResources();
                       bus=res.getStringArray(R.array.theinphyu);
                       intent=new Intent(AroundYangon.getContext(),BusDetails.class);
                       intent.putExtra("Bus",bus);
                       startActivity(intent);
                       break;
                   case 5:
                       res=getResources();
                       bus=res.getStringArray(R.array.northdagon);
                       intent=new Intent(AroundYangon.getContext(),BusDetails.class);
                       intent.putExtra("Bus",bus);
                       startActivity(intent);
                       break;
                   case 6:
                       res=getResources();
                       bus=res.getStringArray(R.array.gatalit);
                       intent=new Intent(AroundYangon.getContext(),BusDetails.class);
                       intent.putExtra("Bus",bus);
                       startActivity(intent);
                       break;
                   case 7:
                       res=getResources();
                       bus=res.getStringArray(R.array.bahan3lan);
                       intent=new Intent(AroundYangon.getContext(),BusDetails.class);
                       intent.putExtra("Bus",bus);
                       startActivity(intent);
                       break;
                   case 8:
                       res=getResources();
                       bus=res.getStringArray(R.array.theingyizay);
                       intent=new Intent(AroundYangon.getContext(),BusDetails.class);
                       intent.putExtra("Bus",bus);
                       startActivity(intent);
                       break;
                   case 9:
                       res=getResources();
                       bus=res.getStringArray(R.array.onethreethree);
                       intent=new Intent(AroundYangon.getContext(),BusDetails.class);
                       intent.putExtra("Bus",bus);
                       startActivity(intent);
                       break;
                   case 10:
                       res=getResources();
                       bus=res.getStringArray(R.array.htan2pin);
                       intent=new Intent(AroundYangon.getContext(),BusDetails.class);
                       intent.putExtra("Bus",bus);
                       startActivity(intent);
                       break;
                   case 11:
                       res=getResources();
                       bus=res.getStringArray(R.array.oone);
                       intent=new Intent(AroundYangon.getContext(),BusDetails.class);
                       intent.putExtra("Bus",bus);
                       startActivity(intent);
                       break;
                   case 12:
                       res=getResources();
                       bus=res.getStringArray(R.array.du);
                       intent=new Intent(AroundYangon.getContext(),BusDetails.class);
                       intent.putExtra("Bus",bus);
                       startActivity(intent);
                       break;
                   case 13:
                       res=getResources();
                       bus=res.getStringArray(R.array.kyitewine);
                       intent=new Intent(AroundYangon.getContext(),BusDetails.class);
                       intent.putExtra("Bus",bus);
                       startActivity(intent);
                       break;
                   case 14:
                       res=getResources();
                       bus=res.getStringArray(R.array.aung);
                       intent=new Intent(AroundYangon.getContext(),BusDetails.class);
                       intent.putExtra("Bus",bus);
                       startActivity(intent);
                       break;
                   case 15:
                       res=getResources();
                       bus=res.getStringArray(R.array.zawana);
                       intent=new Intent(AroundYangon.getContext(),BusDetails.class);
                       intent.putExtra("Bus",bus);
                       startActivity(intent);
                       break;
                   case 16:
                       res=getResources();
                       bus=res.getStringArray(R.array.thakhinmya);
                       intent=new Intent(AroundYangon.getContext(),BusDetails.class);
                       intent.putExtra("Bus",bus);
                       startActivity(intent);
                       break;
                   case 17:
                       res=getResources();
                       bus=res.getStringArray(R.array.zawana);
                       intent=new Intent(AroundYangon.getContext(),BusDetails.class);
                       intent.putExtra("Bus",bus);
                       startActivity(intent);
                       break;
                   case 18:
                       res=getResources();
                       bus=res.getStringArray(R.array.nodagon);
                       intent=new Intent(AroundYangon.getContext(),BusDetails.class);
                       intent.putExtra("Bus",bus);
                       startActivity(intent);
                       break;

               }

            }
        });

        rv_busstop.setAdapter(busStopAdapter);



        prepareBusStopData();

    }

    private void prepareBusStopData() {

        RvBusModel bus=new RvBusModel("သခင္ျမပန္းျခံ");
        busStopList.add(bus);
        bus=new RvBusModel("တိရိစၧန္ရုံ");
        busStopList.add(bus);
        bus=new RvBusModel("သုဝဏၰလမ္းဆုံ");
        busStopList.add(bus);
        bus=new RvBusModel("အေသာက");
        busStopList.add(bus);
        bus=new RvBusModel("တာေမြ");
        busStopList.add(bus);
        bus=new RvBusModel("သိမ္ျဖဴ");
        busStopList.add(bus);
        bus=new RvBusModel("ေျမာက္ဒဂုံ ၅၀ေကြ႕");
        busStopList.add(bus);
        bus=new RvBusModel("ဂြတ္တလစ္ေစ်းေကြ႕");
        busStopList.add(bus);
        bus=new RvBusModel("ဗဟန္း၃လမ္း");
        busStopList.add(bus);
        bus=new RvBusModel("သိမ္ျကီးေစ်း");
        busStopList.add(bus);
        bus=new RvBusModel("၁၃၃");
        busStopList.add(bus);
        bus=new RvBusModel("ထန္းနွစ္ပင္");
        busStopList.add(bus);
        bus=new RvBusModel("အိုဝမ္း");
        busStopList.add(bus);
        bus=new RvBusModel("ဒဂုံတကၠသိုလ္မုဒ္ဝ");
        busStopList.add(bus);
        bus=new RvBusModel("၈မိုင္လမ္းဆုံ");
        busStopList.add(bus);
        bus=new RvBusModel("က်ိဳက္ဝိုင္းဘုရား");
        busStopList.add(bus);
        bus=new RvBusModel("ေအာင္ရတနာ");
        busStopList.add(bus);
        bus=new RvBusModel("ဇဝန");
        busStopList.add(bus);
        bus=new RvBusModel("ေျမာက္ဒဂုံ ၄၈ ရပ္ကြက္");
        busStopList.add(bus);

        busStopAdapter.notifyDataSetChanged();
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
