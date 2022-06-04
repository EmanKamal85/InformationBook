package com.example.informationbook.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.informationbook.ModelClass;
import com.example.informationbook.adapters.ModelClassAdapter;
import com.example.informationbook.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ModelClass> categoriesList = new ArrayList<>();
    ModelClassAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
 //       recyclerView.setLayoutManager(new LinearLayoutManager(this));
     recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
//      recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        categoriesList.add(new ModelClass("Countries", R.drawable.countries));
        categoriesList.add(new ModelClass("Museums", R.drawable.museums));
        categoriesList.add(new ModelClass("Leaders", R.drawable.leaders));
        categoriesList.add(new ModelClass("Seven Wonders of The World", R.drawable.wonders));

        adapter = new ModelClassAdapter(categoriesList, this);
        recyclerView.setAdapter(adapter);


    }
}