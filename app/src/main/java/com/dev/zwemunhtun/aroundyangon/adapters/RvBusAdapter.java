package com.dev.zwemunhtun.aroundyangon.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dev.zwemunhtun.aroundyangon.AroundYangon;
import com.dev.zwemunhtun.aroundyangon.R;

import com.dev.zwemunhtun.aroundyangon.model.RvBusModel;
import java.util.List;

/**
 * Created by ZweMunHtun on 6/30/2016.
 */
public class RvBusAdapter extends RecyclerView.Adapter<RvBusAdapter.MyViewHolder> {

    private List<RvBusModel> rvList;
   OnItemClickListener itemClickListener;

    public RvBusAdapter(List<RvBusModel> rvList){
        this.rvList=rvList;
    }

    @Override
    public RvBusAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,int viewType) {
        View row=LayoutInflater.from(AroundYangon.getContext()).inflate(R.layout.text_item,parent,false);
        return  new MyViewHolder(row);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        RvBusModel rvBusModel=rvList.get(position);
        holder.title.setText(rvBusModel.getTitle());
    }

    @Override
    public int getItemCount() {
        return rvList.size();
    }

    public RvBusModel selectposition(int position){
        return rvList.get(position);

    }
    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }


    public void setOnItemClickListener(final OnItemClickListener mItemClickListener){
        this.itemClickListener=mItemClickListener;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView title;
        public MyViewHolder(View view) {
            super(view);
            title= (TextView) view.findViewById(R.id.card_text);
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
