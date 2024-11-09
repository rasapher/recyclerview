package com.example.recyclerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi itemList dan tambahkan data
        List<Item> itemList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            itemList.add(new Item(android.R.drawable.ic_menu_gallery, "Item " + (i + 1)));
        }

        // Inisialisasi RecyclerViews
        RecyclerView verticalRecyclerView = findViewById(R.id.verticalRecyclerView);
        RecyclerView horizontalRecyclerView = findViewById(R.id.horizontalRecyclerView);

        // Inisialisasi Adapters
        ItemAdapter verticalAdapter = new ItemAdapter(itemList);
        ItemAdapter horizontalAdapter = new ItemAdapter(itemList);

        // Atur LayoutManagers untuk RecyclerViews
        verticalRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        horizontalRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        // Pasang Adapters ke RecyclerViews
        verticalRecyclerView.setAdapter(verticalAdapter);
        horizontalRecyclerView.setAdapter(horizontalAdapter);
    }
}
