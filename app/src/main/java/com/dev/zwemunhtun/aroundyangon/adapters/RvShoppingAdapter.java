package com.dev.zwemunhtun.aroundyangon.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dev.zwemunhtun.aroundyangon.R;
import com.dev.zwemunhtun.aroundyangon.model.RvShoppingModel;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by ZweMunHtun on 7/6/2016.
 */
public class RvShoppingAdapter extends RecyclerView.Adapter<RvShoppingAdapter.MyViewHolder> {

    private Context context;
    private List<RvShoppingModel> rvShoppingList;
    private OnItemClickListener itemClickListener;

    public RvShoppingAdapter(Context context,List<RvShoppingModel> rvShoppingList){
        this.context=context;
        this.rvShoppingList=rvShoppingList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View row= LayoutInflater.from(context).inflate(R.layout.card_item,parent,false);
        return  new MyViewHolder(row);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        RvShoppingModel rvShoppingModel=rvShoppingList.get(position);
        holder.title.setText(rvShoppingModel.getShopName());
        Picasso.with(context).load(rvShoppingModel.getShopImg()).error(R.drawable.error).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return rvShoppingList.size();
    }

    public interface OnItemClickListener{
        void onItemClick(View view,int position);
    }

    public void setOnItemClickListener(final OnItemClickListener itemClickListener){
        this.itemClickListener=itemClickListener;
    }

    public RvShoppingModel selectShopping(int position){
        return rvShoppingList.get(position);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
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
                itemClickListener.onItemClick(v,getAdapterPosition());
            }
        }
    }
}
