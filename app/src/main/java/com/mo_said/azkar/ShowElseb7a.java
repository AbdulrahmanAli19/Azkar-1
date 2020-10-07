package com.mo_said.azkar;

import android.content.Intent;
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

public class ShowElseb7a extends AppCompatActivity implements View.OnClickListener {


    //Views
    ImageButton mBackButton, mHomeButton;
    Button mRight, mMenu;
    TextView mTitleTV, mCounter;
    ImageView mClick_motion;
    LottieAnimationView mAnimationView;

    //adapter
    choseSeb7aRvAdapter choseSeb7aRvAdapter;

    //Db
    DB db = new DB();

    int ppp;
    int CC = 0;
    int CCC = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_elseb7a);
        iniViews();
        mTitleTV.setText(db.elseb7a0().get(0).Title);

    }

    private void iniViews() {
        mBackButton = findViewById(R.id.ib_back);
        mHomeButton = findViewById(R.id.ib_home);
        mHomeButton.setOnClickListener(this);
        mBackButton.setOnClickListener(this);

        mTitleTV = findViewById(R.id.titleTV);
        mClick_motion = findViewById(R.id.click_motion);
        mClick_motion.setOnClickListener(this);
        mAnimationView = findViewById(R.id.animationView_sebha);
        mAnimationView.pauseAnimation();

        mRight = findViewById(R.id.bRight);
        mRight.setOnClickListener(this);

        mMenu = findViewById(R.id.bLeft);
        mMenu.setOnClickListener(this);

        mCounter = findViewById(R.id.counter);


        choseSeb7aRvAdapter = new choseSeb7aRvAdapter(db.elseb7a0(), this);


    }

    private void setText() {
        mTitleTV.setText(db.elseb7a0().get(CC).Title);
        if (db.elseb7a0().size() - 1 == CC) {
            CC = 0;
        }
    }

    private void setcounter() {
        mCounter.setText(CCC + "  من  " + db.elseb7a0().get(CC).counter);
        if (CCC == 100) {
            CCC = 0;
            CC = CC + 1;
            setText();
        }
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ib_back:
                finish();
                break;
            case R.id.ib_home:
                Intent intentHome = new Intent(ShowElseb7a.this, HomeActivity.class);
                startActivity(intentHome);
                break;
            case R.id.click_motion:
                mAnimationView.playAnimation();
                mAnimationView.setSpeed(10);
                CCC = CCC + 1;
                setcounter();

                break;
            case R.id.bRight:
                CC = CC + 1;
                CCC = 0;
                setcounter();
                setText();
                break;
            case R.id.bLeft:
                choseSeb7aFragment choseSeb7aFragment = new choseSeb7aFragment();
                choseSeb7aFragment.show(getSupportFragmentManager(), "");
                CC = ppp;
                setText();
                break;


        }
    }

}