package com.mo_said.azkar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mo_said.azkar.DB.DB;

public class ShowFromHome extends AppCompatActivity implements View.OnClickListener {
    // Views
    ImageButton mBBack;
    ImageView mImageTitle;
    TextView mTextTitle;

    // RecyclerView
    RecyclerView mRv;
    RvFromHomeAdapter rvFromHomeAdapter;
    //DataBase Object
    DB db = new DB();

    int mIntentID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_from_home);
        iniviews();
        intent();
        iniRv();

    }

    private void iniviews() {
        mBBack = findViewById(R.id.ib_back);
        mBBack.setOnClickListener(this);

        mImageTitle = findViewById(R.id.image_title);
        mTextTitle = findViewById(R.id.text_title);
    }

    private void iniRv() {
        mRv = findViewById(R.id.Rv_from_home);
        switch (mIntentID) {
            case 0:
                rvFromHomeAdapter = new RvFromHomeAdapter(db.HomeRv_item_0());
                break;
            case 1:
                rvFromHomeAdapter = new RvFromHomeAdapter(db.HomeRv_item_1());
                break;
            case 2:
                rvFromHomeAdapter = new RvFromHomeAdapter(db.HomeRv_item_2());
                break;

        }
        mRv.setAdapter(rvFromHomeAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ShowFromHome.this, RecyclerView.VERTICAL, false);
        mRv.setLayoutManager(layoutManager);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ib_back:
                finish();
                break;
        }
    }

    void intent() {

        Intent OO = getIntent();
        Bundle OOO = OO.getExtras();
        if (OOO != null) {
            mIntentID = OO.getIntExtra("io", 104);
            String j = (String) OOO.get("ii");
            mImageTitle.setImageResource((Integer) OOO.get("icon"));
            mTextTitle.setText(j);
        }
    }

}