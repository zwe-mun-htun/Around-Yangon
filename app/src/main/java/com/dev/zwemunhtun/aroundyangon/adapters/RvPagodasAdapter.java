package com.dev.zwemunhtun.aroundyangon.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dev.zwemunhtun.aroundyangon.R;
import com.dev.zwemunhtun.aroundyangon.model.RvPagodasModel;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by ZweMunHtun on 7/6/2016.
 */
public class RvPagodasAdapter extends RecyclerView.Adapter<RvPagodasAdapter.MyViewHolder> {

    private List<RvPagodasModel> rvPagodasList;
    private Context context;
    OnItemClickListener itemClickListener;

    public RvPagodasAdapter(Context context,List<RvPagodasModel> rvPagodasList){
        this.context=context;
        this.rvPagodasList=rvPagodasList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View row= LayoutInflater.from(context).inflate(R.layout.card_item,parent,false);
        return  new MyViewHolder(row);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.pagTitle.setText(rvPagodasList.get(position).getPagName());
        Picasso.with(context).load(rvPagodasList.get(position).getPagImg()).error(R.drawable.error).into(holder.pagImg);
    }

    @Override
    public int getItemCount() {
        return rvPagodasList.size();
    }

    public RvPagodasModel selectPagoda(int position){
        return rvPagodasList.get(position);
    }

    public interface OnItemClickListener{
        void OnItemClick(View view,int position);
    }

    public void setOnItemClickListener(final OnItemClickListener itemClickListener){
        this.itemClickListener=itemClickListener;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView pagTitle;
        public ImageView pagImg;
        public MyViewHolder(View view) {
            super(view);
            pagTitle= (TextView) view.findViewById(R.id.rv_text);
            pagImg= (ImageView) view.findViewById(R.id.rv_image);
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
