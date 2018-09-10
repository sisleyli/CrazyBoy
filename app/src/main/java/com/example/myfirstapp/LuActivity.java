package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class LuActivity extends AppCompatActivity {

    private List<Gua> guaList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lu);
        initGua();
        GuaApapter guaApapter=new GuaApapter(LuActivity.this,R.layout.gua_item,guaList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(guaApapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Gua gua=guaList.get(position);
                Toast.makeText(LuActivity.this,gua.getName(),Toast.LENGTH_SHORT).show();
            }
        });
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
