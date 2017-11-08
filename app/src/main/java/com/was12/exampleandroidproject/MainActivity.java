package com.was12.exampleandroidproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Objeto> objetoList;
        objetoList=new ArrayList<>();
        objetoList.add(new Objeto("FC Barcelona",R.drawable.ic_launcher_background));
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.my_recycler_view);
        RecyclerView.LayoutManager manager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        RecyclerView.Adapter adapter=new ObjetoAdapter(this,objetoList);
        recyclerView.setAdapter(adapter);

    }
}
