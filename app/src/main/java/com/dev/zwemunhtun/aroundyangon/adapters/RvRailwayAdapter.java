package com.dev.zwemunhtun.aroundyangon.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dev.zwemunhtun.aroundyangon.R;
import com.dev.zwemunhtun.aroundyangon.model.RvRailwayModel;

import java.util.List;

/**
 * Created by ZweMunHtun on 7/6/2016.
 */
public class RvRailwayAdapter extends RecyclerView.Adapter<RvRailwayAdapter.MyViewHolder> {

    private List<RvRailwayModel> rvRailwayList;
    OnItemClickListener itemClickListener;

    public RvRailwayAdapter(List<RvRailwayModel> rvRailwayList){
        this.rvRailwayList=rvRailwayList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View row= LayoutInflater.from(parent.getContext()).inflate(R.layout.text_item,parent,false);
        return  new MyViewHolder(row);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        RvRailwayModel rvRailwayModel=rvRailwayList.get(position);
        holder.title.setText(rvRailwayModel.getTitle());
    }

    @Override
    public int getItemCount() {
        return rvRailwayList.size();
    }

    public interface OnItemClickListener{
        void onItemClick(View view,int position);
    }

    public void setOnItemClickListener(final OnItemClickListener itemClickListener){
        this.itemClickListener=itemClickListener;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView title;
        public ImageView image;
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
