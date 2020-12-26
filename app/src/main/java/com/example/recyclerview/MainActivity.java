package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    RecyclerView lists;
    myadapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lists=findViewById(R.id.lists);
        lists.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>().setQuery(FirebaseDatabase.getInstance().
                        getReference().child("PERSONS"),model.class).build();

        adapter=new myadapter(options);
        lists.setAdapter(adapter);



    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }
    
    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }


}