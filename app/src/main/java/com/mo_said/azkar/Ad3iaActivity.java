package com.mo_said.azkar;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mo_said.azkar.RV.Model;
import com.mo_said.azkar.RV.RvAd3iaAdapter;

import java.util.ArrayList;

public class Ad3iaActivity extends AppCompatActivity {
    View view;
    RecyclerView mRvAd3ia;
    RvAd3iaAdapter mrvAd3iaAdapter;
    ArrayList<Model> mad3iaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad3ia);
        iniViewsd();
    }

    private void iniViewsd() {
        mRvAd3ia = findViewById(R.id.rv_ad3ia);

        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        mRvAd3ia.setLayoutManager(layoutManager1);

        mad3iaArrayList = new ArrayList<Model>();
        mad3iaArrayList.add(new Model("أدعية النَّبِيِّ صَلَّى اللهُ عَلَيْهِ وَسَلَّم"));
        mad3iaArrayList.add(new Model("الْأدْعِيَةُ القرآنية"));
        mad3iaArrayList.add(new Model("أدعية الأنبياء من القرآن الكريم"));
        mad3iaArrayList.add(new Model("أدعية للمتوفي"));
        mad3iaArrayList.add(new Model("دُعَاءُ خَتْمِ القُرْآنِ الكَريمِ"));
        mad3iaArrayList.add(new Model("جوامع الدعاء"));


        mrvAd3iaAdapter = new RvAd3iaAdapter(mad3iaArrayList, this);
        mRvAd3ia.setAdapter(mrvAd3iaAdapter);


    }
}