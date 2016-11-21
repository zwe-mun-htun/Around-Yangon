package com.dev.zwemunhtun.aroundyangon.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.dev.zwemunhtun.aroundyangon.R;

import java.util.ArrayList;

/**
 * Created by ZweMunHtun on 6/29/2016.
 */
public class MenuGVAdapter extends BaseAdapter {

    ArrayList<MyItem> list;

    Context context;
    public MenuGVAdapter(Context context){
        this.context=context;
        list=new ArrayList<MyItem>();
        Resources res=context.getResources();
        String[] tempTitles=res.getStringArray(R.array.title);
        int[] tempImages={R.drawable.ic_busstop,R.drawable.ic_cinema,R.drawable.ic_fire,
                R.drawable.ic_hospital,R.drawable.ic_hotel,R.drawable.ic_pagodas,
                R.drawable.ic_park,R.drawable.ic_police,R.drawable.ic_railwaystation,
                R.drawable.ic_restruant,R.drawable.ic_shoppingcenter,R.drawable.ic_university};
        for (int i=0;i<12;i++){
            MyItem tempMyItem=new MyItem(tempImages[i],tempTitles[i]);
            list.add(tempMyItem);
        }
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    class ViewHolder{
        ImageView img;
        TextView txt;

        ViewHolder(View v){
            img= (ImageView) v.findViewById(R.id.grid_image);
            txt= (TextView) v.findViewById(R.id.grid_title);
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row=convertView;
        ViewHolder holder=null;
        if (row==null){
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row=inflater.inflate(R.layout.grid_item,parent,false);
            holder=new ViewHolder(row);
            row.setTag(holder);
        }else
        {
            holder= (ViewHolder) row.getTag();
        }
        MyItem temp=list.get(position);
        holder.img.setImageResource(temp.imageId);
        holder.txt.setText(temp.title);

        return row;
    }
}
class MyItem{
    int imageId;
    String title;
    MyItem(int imageId,String title){
        this.imageId=imageId;
        this.title=title;
    }
}
