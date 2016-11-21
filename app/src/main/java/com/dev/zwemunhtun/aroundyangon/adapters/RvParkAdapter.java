package com.dev.zwemunhtun.aroundyangon.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dev.zwemunhtun.aroundyangon.AroundYangon;
import com.dev.zwemunhtun.aroundyangon.R;
import com.dev.zwemunhtun.aroundyangon.model.RvParkModel;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by ZweMunHtun on 7/6/2016.
 */
public class RvParkAdapter extends RecyclerView.Adapter<RvParkAdapter.MyViewHolder> {

    private List<RvParkModel> rvParkList;
    OnItemCLickListener itemCLickListener;
    private Context context;

    public RvParkAdapter(Context context,List<RvParkModel> rvParkList){
        this.context=context;
        this.rvParkList=rvParkList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View row= LayoutInflater.from(AroundYangon.getContext()).inflate(R.layout.card_item,parent,false);
        return  new MyViewHolder(row);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        RvParkModel rvParkModel=rvParkList.get(position);
        holder.title.setText(rvParkModel.getPakName());
        Picasso.with(context).load(rvParkModel.getPakImg()).error(R.drawable.error).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return rvParkList.size();
    }

    public interface OnItemCLickListener{
        void OnItemClick(View view,int position);
    }

    public void setOnItemClickListener(final OnItemCLickListener itemClickListener){
        this.itemCLickListener=itemClickListener;
    }

    public RvParkModel selectPark(int position){
        return rvParkList.get(position);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView title;
        public ImageView image;
        public MyViewHolder(View view) {
            super(view);
            title= (TextView) view.findViewById(R.id.rv_text);
            image= (ImageView) view.findViewById(R.id.rv_image);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (itemCLickListener!=null){
                itemCLickListener.OnItemClick(v,getAdapterPosition());
            }
        }
    }
}
