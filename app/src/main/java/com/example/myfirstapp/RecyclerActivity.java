package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {
    private List<Gua> guaList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        initGua();
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);//设置recycleView布局
        GuaRecyclerAdapter adapter=new GuaRecyclerAdapter(guaList);
        recyclerView.setAdapter(adapter);
    }
    public void initGua(){
        for(int i=0;i<2;i++)
        {
            Gua bao=new Gua("爆头",R.drawable.g1);
            guaList.add(bao);
            Gua g2=new Gua("g2",R.drawable.g2);
            guaList.add(g2);
            Gua g3=new Gua("g3",R.drawable.g3);
            guaList.add(g3);
            Gua g4=new Gua("g4",R.drawable.g4);
            guaList.add(g4);
            Gua g5=new Gua("g5",R.drawable.g5);
            guaList.add(g5);
            Gua titan=new Gua("Titan",R.drawable.titan1);
            guaList.add(titan);
            Gua cy=new Gua("cy",R.drawable.cyclops);
            guaList.add(cy);
        }
    }
}
