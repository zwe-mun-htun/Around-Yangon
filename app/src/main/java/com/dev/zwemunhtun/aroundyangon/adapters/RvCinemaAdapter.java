package com.dev.zwemunhtun.aroundyangon.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.dev.zwemunhtun.aroundyangon.R;
import com.dev.zwemunhtun.aroundyangon.model.RvCinemaModel;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by ZweMunHtun on 7/6/2016.
 */
public class RvCinemaAdapter extends RecyclerView.Adapter<RvCinemaAdapter.MyViewHolder> {

    private Context context;
    private List<RvCinemaModel> rvCinemaList;
    OnItemClickListener itemClickListener;
    int lastPosition=-1;

    public RvCinemaAdapter(Context context,List<RvCinemaModel> rvCinemaList){
        this.context=context;
        this.rvCinemaList=rvCinemaList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View row= LayoutInflater.from(context).inflate(R.layout.card_item,parent,false);
        return  new MyViewHolder(row);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.ctitle.setText(rvCinemaList.get(position).getCinemaName());
        Picasso.with(context).load(rvCinemaList.get(position).getCinemaImageUrl()).error(R.drawable.error).into(holder.cimage);

        if (position > lastPosition){
            Animation animation= AnimationUtils.loadAnimation(context,R.anim.up_to_bottom);
            holder.itemView.startAnimation(animation);
            lastPosition=position;
        }

    }

    @Override
    public int getItemCount() {
        return rvCinemaList.size();
    }

    public RvCinemaModel selectCinema(int position){

        return rvCinemaList.get(position);
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    public void setOnItemClickListener(final OnItemClickListener mItemClickListener){
        this.itemClickListener=mItemClickListener;

    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView ctitle;
        public ImageView cimage;
        public MyViewHolder(View view) {
            super(view);
            ctitle= (TextView) view.findViewById(R.id.rv_text);
            cimage= (ImageView) view.findViewById(R.id.rv_image);
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
