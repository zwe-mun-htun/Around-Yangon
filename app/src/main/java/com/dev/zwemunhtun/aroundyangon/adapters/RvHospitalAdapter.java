package com.dev.zwemunhtun.aroundyangon.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dev.zwemunhtun.aroundyangon.R;
import com.dev.zwemunhtun.aroundyangon.model.RvHospitalModel;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by ZweMunHtun on 7/6/2016.
 */
public class RvHospitalAdapter extends RecyclerView.Adapter<RvHospitalAdapter.MyViewHolder> {

    private List<RvHospitalModel> rvHospitalList;
    private Context context;
    OnItemCLickListener itemCLickListener;

    public RvHospitalAdapter(Context context,List<RvHospitalModel> rvHospitalList){
        this.context=context;
        this.rvHospitalList=rvHospitalList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View row= LayoutInflater.from(context).inflate(R.layout.card_item,parent,false);
        return  new MyViewHolder(row);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.title.setText(rvHospitalList.get(position).getHosName());
        Picasso.with(context).load(rvHospitalList.get(position).getHosIMG()).error(R.drawable.error).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return rvHospitalList.size();
    }

    public RvHospitalModel selectHospital(int position){
        return rvHospitalList.get(position);
    }

    public interface OnItemCLickListener{
        void onClick(View view,int position);
    }

    public void setOnItemClickListener(final OnItemCLickListener itemClickListener){
        this.itemCLickListener=itemClickListener;
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
            if (itemCLickListener!=null){
                itemCLickListener.onClick(v,getAdapterPosition());
            }
        }
    }
}
