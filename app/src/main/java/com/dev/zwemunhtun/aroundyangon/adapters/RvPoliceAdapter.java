package com.dev.zwemunhtun.aroundyangon.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dev.zwemunhtun.aroundyangon.AroundYangon;
import com.dev.zwemunhtun.aroundyangon.R;
import com.dev.zwemunhtun.aroundyangon.model.RvPoliceModel;

import java.util.List;

/**
 * Created by ZweMunHtun on 7/6/2016.
 */
public class RvPoliceAdapter extends RecyclerView.Adapter<RvPoliceAdapter.MyViewHolder> {

    private List<RvPoliceModel> rvPoliceList;
    OnItemClickListener itemClickListener;

    public RvPoliceAdapter(List<RvPoliceModel> rvPoliceList){
        this.rvPoliceList=rvPoliceList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View row= LayoutInflater.from(AroundYangon.getContext()).inflate(R.layout.card_phone_item,parent,false);
        return  new MyViewHolder(row);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        RvPoliceModel rvPoliceModel=rvPoliceList.get(position);
        holder.title.setText(rvPoliceModel.getTitle());
    }


    @Override
    public int getItemCount() {
        return rvPoliceList.size();
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    public void setOnItemClickListener(final OnItemClickListener mItemClickListener){
        this.itemClickListener=mItemClickListener;
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

            if (itemClickListener != null){

                itemClickListener.onItemClick(v,getAdapterPosition());
            }
        }
    }
}
