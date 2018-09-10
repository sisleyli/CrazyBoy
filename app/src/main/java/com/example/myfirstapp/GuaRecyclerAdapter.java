package com.example.myfirstapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lenovo on 2018/9/9.
 */

public class GuaRecyclerAdapter extends RecyclerView.Adapter<GuaRecyclerAdapter.ViewHolder> {
    private List<Gua> mGuaList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView guaImage;
        TextView guaName;
        //存放单格数据
        public ViewHolder(View view){
            super(view);
            guaImage=(ImageView)view.findViewById(R.id.gua_image);
            guaName=(TextView)view.findViewById(R.id.gua_name);
        }
    }
    public GuaRecyclerAdapter(List<Gua> guaList){
        mGuaList=guaList;//整个表的数据存放到这里
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.gua_item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Gua gua=mGuaList.get(position);
        holder.guaImage.setImageResource(gua.getImageId());
        holder.guaName.setText(gua.getName());
    }

    @Override
    public int getItemCount() {
        return mGuaList.size();
    }
}
