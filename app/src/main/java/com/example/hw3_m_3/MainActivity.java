package com.example.hw3_m_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_spisoc;
    private ArrayList<String>Liist = new ArrayList<>();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_spisoc= findViewById(R.id.rv_spisoc);
        loadData();

        ContactAdapter adapter= new ContactAdapter(Liist);
        rv_spisoc.setAdapter(adapter);

        }
private void loadData(){

    spisoc.add("линейка");
    spisoc.add("чайка");
    spisoc.add("суп");
    spisoc.add("лампа");
    spisoc.add("пальто");
    spisoc.add("линейка");
    spisoc.add("чайка");
    spisoc.add("суп");
    spisoc.add("лампа");
    spisoc.add("пальто");
    spisoc.add("хлеб");
   cspisoc.add("линейка");
    spisoc.add("чайка");
    spisoc.add("суп");
    spisoc.add("лампа");
    spisoc.add("пальто");
    }
}