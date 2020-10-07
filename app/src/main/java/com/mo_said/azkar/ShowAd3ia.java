package com.mo_said.azkar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mo_said.azkar.DB.DB;
import com.mo_said.azkar.Home.HomeActivity;
import com.mo_said.azkar.RV.RvDo3a2ItemAdapter;

public class ShowAd3ia extends AppCompatActivity implements View.OnClickListener {

    //Views
    ImageButton mBackButton, mHomeButton;
    TextView mTv;

    RecyclerView mRv;
    int mIntentID;
    // object of Class DataBase
    DB db = new DB();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_ad3ia);
        IniViews();
        intent();

    }

    private void IniViews() {
        mBackButton = findViewById(R.id.ib_back);
        mHomeButton = findViewById(R.id.ib_home);
        mHomeButton.setOnClickListener(this);
        mBackButton.setOnClickListener(this);
        mTv = findViewById(R.id.tv);

    }

    void intent() {

        Intent OO = getIntent();
        Bundle OOO = OO.getExtras();
        if (OOO != null) {
            mIntentID = OO.getIntExtra("io", 104);
            String j = (String) OOO.get("ii");
            mTv.setText(j);
        }


        switch (mIntentID) {
            case 0:
                RvDo3a2ItemAdapter rvDo3a2ItemAdapter1 = new RvDo3a2ItemAdapter(db.ad3ia_0());
                IniRv(rvDo3a2ItemAdapter1);
                break;
            case 1:
                RvDo3a2ItemAdapter rvDo3a2ItemAdapter2 = new RvDo3a2ItemAdapter(db.ad3ia_1());
                IniRv(rvDo3a2ItemAdapter2);
                break;
            case 2:
                RvDo3a2ItemAdapter rvDo3a2ItemAdapter3 = new RvDo3a2ItemAdapter(db.ad3ia_2());
                IniRv(rvDo3a2ItemAdapter3);
                break;
            case 3:
                RvDo3a2ItemAdapter rvDo3a2ItemAdapter4 = new RvDo3a2ItemAdapter(db.ad3ia_3());
                IniRv(rvDo3a2ItemAdapter4);
                break;
            case 4:
                RvDo3a2ItemAdapter rvDo3a2ItemAdapter5 = new RvDo3a2ItemAdapter(db.ad3ia_4());
                IniRv(rvDo3a2ItemAdapter5);
                break;
            case 5:
                RvDo3a2ItemAdapter rvDo3a2ItemAdapter6 = new RvDo3a2ItemAdapter(db.ad3ia_5());
                IniRv(rvDo3a2ItemAdapter6);
                break;

        }
    }


    private void IniRv(RvDo3a2ItemAdapter rvDo3a2ItemAdapter) {
        mRv = findViewById(R.id.rv_ad3ia_class);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ShowAd3ia.this, RecyclerView.VERTICAL, false);
        mRv.setAdapter(rvDo3a2ItemAdapter);
        mRv.setLayoutManager(layoutManager);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ib_back:
                finish();
                break;
            case R.id.ib_home:
                Intent intentHome = new Intent(ShowAd3ia.this, HomeActivity.class);
                startActivity(intentHome);
                break;


        }
    }
}