package com.example.zacth.cs349hw1pt2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] foods = new String[] {"Bacon", "Ham", "Candy", "Pizza", "Chicken"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mListView = (ListView) findViewById(R.id.listView);
        ListAdapter mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, foods);
        mListView.setAdapter(mAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, foods.get(position), Toast.LENGTH_SHORT).show();

                if (position==0){
                    Intent mIntent = new Intent(view.getContext(),ItemView.class);
                    startActivityForResult(mIntent, 0);
                }
                if (position==1){
                    Intent mIntent = new Intent(view.getContext(),ItemView.class);
                    startActivityForResult(mIntent, 1);
                }
                if (position==2){
                    Intent mIntent = new Intent(view.getContext(),ItemView.class);
                    startActivityForResult(mIntent, 2);
                }
                if (position==3){
                    Intent mIntent = new Intent(view.getContext(),ItemView.class);
                    startActivityForResult(mIntent, 3);
                }
                if (position==4){
                    Intent mIntent = new Intent(view.getContext(),ItemView.class);
                    startActivityForResult(mIntent, 4);
                }
            }
        });

    }
}
