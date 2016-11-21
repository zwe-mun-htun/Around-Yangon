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
import com.dev.zwemunhtun.aroundyangon.model.RvRestaurantModel;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by ZweMunHtun on 7/6/2016.
 */
public class RvRestaurantAdapter extends RecyclerView.Adapter<RvRestaurantAdapter.MyViewHolder> {

    private Context context;
    private List<RvRestaurantModel> rvRestaurantList;
    OnItemClickListener onItemClickListener;

    public RvRestaurantAdapter(Context context,List<RvRestaurantModel> rvRestaurantList){
        this.context=context;
        this.rvRestaurantList=rvRestaurantList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View row= LayoutInflater.from(parent.getContext()).inflate(R.layout.res_item,parent,false);
        return  new MyViewHolder(row);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        RvRestaurantModel rvRestaurantModel=rvRestaurantList.get(position);
        holder.title.setText(rvRestaurantModel.getResName());
        Picasso.with(context).load(rvRestaurantList.get(position).getResImage()).error(R.drawable.error).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return rvRestaurantList.size();
    }

    public interface OnItemClickListener{
        void OnItemClick(View view,int position);
    }

    public void setOnItemClickListener(final OnItemClickListener itemClickListener){
        this.onItemClickListener=itemClickListener;

    }

    public RvRestaurantModel selectRestaurant(int position){
        return rvRestaurantList.get(position);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView title;
        public ImageView image;
        public MyViewHolder(View view) {
            super(view);
            title= (TextView) view.findViewById(R.id.res_text);
            image= (ImageView) view.findViewById(R.id.res_img);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            if (onItemClickListener!=null){
                onItemClickListener.OnItemClick(v,getAdapterPosition());
            }
        }
    }
}
