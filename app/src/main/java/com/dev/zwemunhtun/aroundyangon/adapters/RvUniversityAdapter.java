package com.dev.zwemunhtun.aroundyangon.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dev.zwemunhtun.aroundyangon.R;
import com.dev.zwemunhtun.aroundyangon.model.RvUniversityModel;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by ZweMunHtun on 7/6/2016.
 */
public class RvUniversityAdapter extends RecyclerView.Adapter<RvUniversityAdapter.MyViewHolder> {

    private List<RvUniversityModel> rvUniversityList;
    private Context context;
    OnItemClickListener itemClickListener;

    public RvUniversityAdapter(Context context,List<RvUniversityModel> rvUniversityList){
        this.context=context;
        this.rvUniversityList=rvUniversityList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View row= LayoutInflater.from(context).inflate(R.layout.card_item,parent,false);
        return  new MyViewHolder(row);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.unititle.setText(rvUniversityList.get(position).getUniName());
        Picasso.with(context).load(rvUniversityList.get(position).getUniImg()).error(R.drawable.error).into(holder.uniImage);
    }

    @Override
    public int getItemCount() {
        return rvUniversityList.size();
    }

    public interface OnItemClickListener{
        void onItemClick(View view,int position);
    }

    public void setOnItemClickListener(final OnItemClickListener itemClickListener){
        this.itemClickListener=itemClickListener;
    }

    public RvUniversityModel selectUniversity(int position){
        return rvUniversityList.get(position);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView unititle;
        public ImageView uniImage;
        public MyViewHolder(View view) {
            super(view);
            unititle= (TextView) view.findViewById(R.id.rv_text);
            uniImage= (ImageView) view.findViewById(R.id.rv_image);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (itemClickListener!=null){
                itemClickListener.onItemClick(v,getAdapterPosition());
            }
        }
    }
}
