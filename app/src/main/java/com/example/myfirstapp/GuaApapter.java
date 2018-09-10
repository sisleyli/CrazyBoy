package com.example.myfirstapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lenovo on 2018/8/18.
 * 这是自定义的Adapter适配器
 */

public class GuaApapter extends ArrayAdapter<Gua> {
    private int resourceId;

    public GuaApapter(@NonNull Context context, int resource, @NonNull List<Gua> objects) {
        super(context, resource, objects);
        resourceId=resource;//resource是这个ListView的子项布局id
    }

    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        Gua gua=getItem(position);
        View view;
        ViewHolder viewHolder;
        if(convertView==null)
        {
            view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.guaImage=(ImageView)view.findViewById(R.id.gua_image);
            viewHolder.guanName=(TextView)view.findViewById(R.id.gua_name);
            view.setTag(viewHolder);
        }
        else{
            view=convertView;
            viewHolder=(ViewHolder)view.getTag();
        }
        //from用来构建LayoutInflater对象然后调用inflate对象动态加载布局，第一个参数是子布局id，第二个是父布局，第三个参数是只在父布局中声明的布局属性生效但不添加
        viewHolder.guaImage.setImageResource(gua.getImageId());
        viewHolder.guanName.setText(gua.getName());
        return view;
    }
    class ViewHolder{
        ImageView guaImage;
        TextView guanName;
    }
}
