package com.dev.zwemunhtun.aroundyangon.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.dev.zwemunhtun.aroundyangon.R;

public class BusDetails extends AppCompatActivity {

    private ListView busList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_details);

        Intent intent=getIntent();
        String bus[]=intent.getStringArrayExtra("Bus");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,bus);
        busList=(ListView)findViewById(R.id.buslist);
        busList.setAdapter(adapter);
    }
}
