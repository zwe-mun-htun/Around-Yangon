package com.dev.zwemunhtun.aroundyangon.adapters;

import android.content.ContentValues;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dev.zwemunhtun.aroundyangon.R;
import com.dev.zwemunhtun.aroundyangon.model.RvHotelModel;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by ZweMunHtun on 7/6/2016.
 */
public class RvHotelAdapter extends RecyclerView.Adapter<RvHotelAdapter.MyViewHolder> {

    private Context context;
    private List<RvHotelModel> rvHotelList;
    OnItemClickListener itemClickListener;

    public RvHotelAdapter(Context context,List<RvHotelModel> rvHotelList){
        this.context=context;
        this.rvHotelList=rvHotelList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View row= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item,parent,false);
        return  new MyViewHolder(row);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        RvHotelModel rvHotelModel=rvHotelList.get(position);
        holder.title.setText(rvHotelModel.getHotName());
        Picasso.with(context).load(rvHotelModel.getHotImg()).error(R.drawable.error).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return rvHotelList.size();
    }

    public interface OnItemClickListener{
        void OnItemClick(View view,int position);
    }
    public RvHotelModel selectHotel(int position){
        return rvHotelList.get(position);
    }
    public void setOnItemClickListener(final OnItemClickListener itemClickListener){
        this.itemClickListener=itemClickListener;
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
            if (itemClickListener!=null){
                itemClickListener.OnItemClick(v,getAdapterPosition());
            }
        }
    }
}
