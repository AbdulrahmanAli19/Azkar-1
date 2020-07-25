package com.mo_said.azkar.Home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.mo_said.azkar.Fragment.Elseb7aFragment;
import com.mo_said.azkar.Fragment.Ad3iaFragment;
import com.mo_said.azkar.Fragment.AzkarFragment;
import com.mo_said.azkar.R;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{
    //Views
    ImageButton mAzkarBarButton;
    ImageButton mAd3iaBarButton;
    ImageButton mElseb7aBarButton;


    LinearLayout mPageContiner;


    AzkarFragment azkarFragment;
    Ad3iaFragment ad3iaFragment;
    Elseb7aFragment elseb7aFragment;


    ArrayList<String> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        azkarFragment = new AzkarFragment();
        changeFragment(azkarFragment);
         iniViews();

    }



    private void iniViews() {
        mAzkarBarButton = findViewById(R.id.azkar_bar_button);
        mAzkarBarButton.setOnClickListener(this);

        mAd3iaBarButton = findViewById(R.id.ad3ia_bar_button);
        mAd3iaBarButton.setOnClickListener(this);

        mElseb7aBarButton = findViewById(R.id.elseb7a_bar_button);
        mElseb7aBarButton.setOnClickListener(this);

        mPageContiner = findViewById(R.id.pagecontanier);
        elseb7aFragment = new Elseb7aFragment();


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.azkar_bar_button:
                azkarFragment = new AzkarFragment();
                changeFragment(azkarFragment);

                break;
            case R.id.ad3ia_bar_button:
                ad3iaFragment = new Ad3iaFragment();
                changeFragment(ad3iaFragment);

                break;
            case R.id.elseb7a_bar_button:
                changeFragment(elseb7aFragment);

                break;


        }

    }
    public void changeFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.pagecontanier, fragment).commit();
    }

}