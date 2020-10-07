package com.mo_said.azkar;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mo_said.azkar.RV.ModelAzkar;
import com.mo_said.azkar.RV.RvِAzkarAdapter;

import java.util.ArrayList;

public class AzkarActivity extends AppCompatActivity {
    View view;
    RecyclerView mRv;
    RvِAzkarAdapter mRvِAzkarAdapter;
    ArrayList<ModelAzkar> arrayList__;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azkar);
        iniViews();

    }

    private void iniViews() {
        mRv = findViewById(R.id.rv);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        mRv.setLayoutManager(layoutManager);

        arrayList__ = new ArrayList<>();

        arrayList__.add(new ModelAzkar(R.drawable.ic_night, "اذكار المساء"));
        arrayList__.add(new ModelAzkar(R.drawable.ic_morning, "اذكار الصباح"));
        arrayList__.add(new ModelAzkar(R.drawable.ic_alarm, "اذكار الاستيقاظ"));
        arrayList__.add(new ModelAzkar(R.drawable.ic_sleep, "اذكار النوم"));
        arrayList__.add(new ModelAzkar(R.drawable.ic_mosque, "اذكار المسجد"));
        arrayList__.add(new ModelAzkar(R.drawable.ic_azan, "اذكار الاذان"));
        arrayList__.add(new ModelAzkar(R.drawable.ic_prayer, "اذكار الصلاة"));
        arrayList__.add(new ModelAzkar(R.drawable.ic_wdo2, "اذكار الوضوء"));
        arrayList__.add(new ModelAzkar(R.drawable.ic_wc, "اذكار الخلاء"));
        arrayList__.add(new ModelAzkar(R.drawable.ic_home, "اذكار المنزل"));
        arrayList__.add(new ModelAzkar(R.drawable.ic_food, "اذكار الطعام"));
        arrayList__.add(new ModelAzkar(R.drawable.ic_ka3ba, "اذكار الحج والعمرة"));


        mRvِAzkarAdapter = new RvِAzkarAdapter(arrayList__, this);
        mRv.setAdapter(mRvِAzkarAdapter);


    }

}