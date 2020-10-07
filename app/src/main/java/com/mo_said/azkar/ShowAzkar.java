package com.mo_said.azkar;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;
import com.mo_said.azkar.DB.DB;
import com.mo_said.azkar.Home.HomeActivity;

import java.util.ArrayList;

public class ShowAzkar extends AppCompatActivity implements View.OnClickListener {
    //Views
    ImageButton mBackButton, mHomeButton;
    ImageView mIcon;
    TextView mTitle, mDesc0, mDesc1, mDesc2, mDesc3, mClickMotion, mCounterTv, mCounterAll;
    Button mRight, mLeft;

    // Counter from Intent
    int mIntentID;
    int Counter0 = 0;
    int CounterAll = 1;

    // animation
    LottieAnimationView mAnimationView;

    // object of Class DataBase
    DB db = new DB();


    // media Player
    MediaPlayer mMediaPlayer;
    int CounterTv = 0;
    int CCC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_azkar);
        iniViews();
        intent();
        ChangeWithoutCounter(true);
        CounterAll();

    }

    private void iniViews() {
        mBackButton = findViewById(R.id.ib_back);
        mHomeButton = findViewById(R.id.ib_home);
        mHomeButton.setOnClickListener(this);
        mBackButton.setOnClickListener(this);
        mTitle = findViewById(R.id.azkar_Title);
        mDesc0 = findViewById(R.id.desc0);
        mDesc1 = findViewById(R.id.desc1);
        mDesc2 = findViewById(R.id.desc2);
        mDesc3 = findViewById(R.id.desc3);

        mIcon = findViewById(R.id.icon);
        mRight = findViewById(R.id.bRight);
        mRight.setOnClickListener(this);

        mAnimationView = findViewById(R.id.animationView_Azkar);
        mAnimationView.pauseAnimation();
        mClickMotion = findViewById(R.id.clickMotion);
        mClickMotion.setOnClickListener(this);

        mMediaPlayer = MediaPlayer.create(this, R.raw.click);
        mMediaPlayer.setVolume(1, 1);
        mMediaPlayer.setVolume((float) 0.15, (float) 0.15);


        mLeft = findViewById(R.id.bLeft);
        mLeft.setOnClickListener(this);


        mCounterTv = findViewById(R.id.CounterTv);

        mCounterAll = findViewById(R.id.CounterAll);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ib_back:
                finish();
                break;
            case R.id.ib_home:
                Intent intentHome = new Intent(ShowAzkar.this, HomeActivity.class);
                startActivity(intentHome);
                break;

            case R.id.bRight:
                ChangeWithoutCounter(true);
                CounterTv = 0;
                CounterAll = CounterAll + 1;
                CounterAll();
                break;
            case R.id.bLeft:
                ChangeWithoutCounter(false);
                CounterTv = 0;
                CounterAll = CounterAll - 1;
                CounterAll();

                break;
            case R.id.clickMotion:
                CounterTv = CounterTv + 1;
                ChangeWithCounter(Change(), true);
                Animation();
                mMediaPlayer.start();
                break;


        }
    }

    void ChangeWithoutCounter(Boolean m) {
        ArrayList<ModelAzkar_cc> arrayList;
        arrayList = Change();
        if (m == true) {
            if (Counter0 <= arrayList.size()) {
                mDesc0.setText(arrayList.get(Counter0).disc0);
                mDesc1.setText(arrayList.get(Counter0).disc1);
                mDesc2.setText(arrayList.get(Counter0).disc2);
                mDesc3.setText(arrayList.get(Counter0).disc3);
                mCounterTv.setText(String.valueOf(arrayList.get(Counter0).counter));
                Counter0 = Counter0 + 1;
            }
            if (Counter0 == arrayList.size()) {
                Counter0 = 0;
            }
        } else {
            if (Counter0 <= arrayList.size()) {
                mDesc0.setText(arrayList.get(Counter0).disc0);
                mDesc1.setText(arrayList.get(Counter0).disc1);
                mDesc2.setText(arrayList.get(Counter0).disc2);
                mDesc3.setText(arrayList.get(Counter0).disc3);
                mCounterTv.setText(String.valueOf(arrayList.get(Counter0).counter));
                Counter0 = Counter0 - 1;
            }
            if (Counter0 == 0) {
                Counter0 = arrayList.size() - 1;
            }
        }
    }


    void ChangeWithCounter(ArrayList<ModelAzkar_cc> arrayList, Boolean m) {
        CCC = arrayList.get(Counter0 - 1).counter;
        if (CounterTv == CCC) {
            ChangeWithoutCounter(true);
            CounterAll = CounterAll + 1;
            CounterAll();
            CounterTv = 0;
        }


    }

    private void Animation() {
        mAnimationView.playAnimation();
        mAnimationView.setSpeed(8);

    }

    void intent() {

        Intent OO = getIntent();
        Bundle OOO = OO.getExtras();
        if (OOO != null) {
            mIntentID = OO.getIntExtra("io", 104);
            String j = (String) OOO.get("ii");

            mIcon.setImageResource((Integer) OOO.get("icon"));
            mTitle.setText(j);
        }
    }

    public ArrayList<ModelAzkar_cc> Change() {
        ArrayList<ModelAzkar_cc> arrayList = new ArrayList<>();
        switch (mIntentID) {
            case 0:
                arrayList = db.azkar_0();
                break;

            case 1:
                arrayList = db.azkar_1();
                break;

            case 2:
                arrayList = db.azkar_2();
                break;

            case 3:
                arrayList = db.azkar_3();
                break;

            case 4:
                arrayList = db.azkar_4();
                break;

            case 5:
                arrayList = db.azkar_5();
                break;

            case 6:
                arrayList = db.azkar_6();
                break;

            case 7:
                arrayList = db.azkar_7();
                break;

            case 8:
                arrayList = db.azkar_8();
                break;

            case 9:
                arrayList = db.azkar_9();
                break;

            case 10:
                arrayList = db.azkar_10();
                break;

            case 11:
                arrayList = db.azkar_11();
                break;

            case 12:
                arrayList = db.azkar_12();
                break;

        }
        return arrayList;
    }

    private void CounterAll() {
        if (Change().size() + 1 == CounterAll) {
            CounterAll = 1;
        }
        mCounterAll.setText(CounterAll + "من" + Change().size());

    }

}