package com.dev.zwemunhtun.aroundyangon.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.dev.zwemunhtun.aroundyangon.R;

public class RailwayDetail extends AppCompatActivity {

    ListView trainList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_railway_detail);
        Intent intent=getIntent();
        String[] train=intent.getStringArrayExtra("Train");
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,train);
        trainList=(ListView)findViewById(R.id.railway_list);
        trainList.setAdapter(adapter);
    }
}
