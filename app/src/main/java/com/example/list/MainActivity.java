package com.example.list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView nameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        nameView = findViewById(R.id.contactsRecView);

        ArrayList<Name> names = new ArrayList<>();
        names.add(new Name("Buben Patao 1"));
        names.add(new Name("Buben Patao 2"));
        names.add(new Name("Buben Patao 3"));
        names.add(new Name("Buben Patao 69"));
        names.add(new Name("Buben Patao infinity"));

        ViewNameAdapter adapter = new ViewNameAdapter(this);
        adapter.setNames(names);
        nameView.setAdapter(adapter);
        nameView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

    }
}