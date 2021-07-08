package com.example.fragementdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] name = {"Sarkar_Abdullah","Sarkar_Shimu","Monija Begum","Saiful Islam","Altab Hussain","Lipi Begum","Shova","Azim","Suraii","Uma","Bakkar"};

        listView = findViewById(R.id.ListViewId);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1,name);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        Fragment fragment;

        if(i==0){

            fragment=new Abdullah();
            FragmentManager fragmentManager= getSupportFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.FragmentId,fragment);
            fragmentTransaction.commit();

        }
        if(i==1){

            fragment=new Shimu();
            FragmentManager fragmentManager= getSupportFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.FragmentId,fragment);
            fragmentTransaction.commit();

        }

    }
}