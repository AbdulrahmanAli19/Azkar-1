package com.mo_said.azkar.Home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.mo_said.azkar.R;
import com.mo_said.azkar.ShowElseb7a;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{
    //Views
    ImageButton mAzkarBarButton;
    ImageButton mAd3iaBarButton;
    ImageButton mElseb7aBarButton;
    ImageButton mHomeBarButton;
    LinearLayout mPageContiner;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
         iniViews();

    }



    private void iniViews() {
        mHomeBarButton = findViewById(R.id.home_bar_button);
        mHomeBarButton.setOnClickListener(this);

        mAzkarBarButton = findViewById(R.id.azkar_bar_button);
        mAzkarBarButton.setOnClickListener(this);

        mAd3iaBarButton = findViewById(R.id.ad3ia_bar_button);
        mAd3iaBarButton.setOnClickListener(this);

        mElseb7aBarButton = findViewById(R.id.elseb7a_bar_button);
        mElseb7aBarButton.setOnClickListener(this);


        mPageContiner = findViewById(R.id.pagecontanier);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {


            case R.id.elseb7a_bar_button:
                Intent n = new Intent(HomeActivity.this, ShowElseb7a.class);
                startActivity(n);
                break;


        }

    }
    public void changeFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.pagecontanier, fragment).commit();
    }

}