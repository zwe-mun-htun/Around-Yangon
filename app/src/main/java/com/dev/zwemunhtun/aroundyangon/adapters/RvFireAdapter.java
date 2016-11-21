package com.dev.zwemunhtun.aroundyangon.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dev.zwemunhtun.aroundyangon.AroundYangon;
import com.dev.zwemunhtun.aroundyangon.R;
import com.dev.zwemunhtun.aroundyangon.model.RvFireModel;

import java.util.List;

/**
 * Created by ZweMunHtun on 7/6/2016.
 */
public class RvFireAdapter extends RecyclerView.Adapter<RvFireAdapter.MyViewHolder> {

    private List<RvFireModel> rvFireList;
    OnItemClickListener onItemClickListener;

    public RvFireAdapter(List<RvFireModel> rvFireList){
        this.rvFireList=rvFireList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View row= LayoutInflater.from(AroundYangon.getContext()).inflate(R.layout.fire_station_item,parent,false);
        return  new MyViewHolder(row);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        RvFireModel rvFireModel=rvFireList.get(position);
        holder.title.setText(rvFireModel.getTitle());
    }

    @Override
    public int getItemCount() {
        return rvFireList.size();
    }

    public interface OnItemClickListener{
        void onItemClick(View v,int position);
    }

    public void setOnItemClickListener(final OnItemClickListener itemClickListener){
        this.onItemClickListener=itemClickListener;

    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView title;
        public MyViewHolder(View view) {
            super(view);
            title= (TextView) view.findViewById(R.id.text_with_ph);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (onItemClickListener!=null){
                onItemClickListener.onItemClick(v,getAdapterPosition());
            }
        }
    }
}
