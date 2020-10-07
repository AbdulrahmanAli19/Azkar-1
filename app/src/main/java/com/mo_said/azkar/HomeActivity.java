package com.mo_said.azkar;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    DrawerLayout mNav;
    ImageButton mMenu, mToSeb7a, mToAzkar, mToAd3ia;

    private List<SlideItem> slideList = new ArrayList<>();
    private ViewPager2 viewPager2;
    private Handler sliderhandler = new Handler();
    private Runnable slideRunnable = new Runnable() {
        @Override
        public void run() {
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
        iniViews();
        iniSlider();
    }

    private void iniViews() {
        mMenu = findViewById(R.id.openDrawer);
        mNav = findViewById(R.id.nav);
        mMenu.setOnClickListener(this);

        mToSeb7a = findViewById(R.id.home_to_seb7a);
        mToSeb7a.setOnClickListener(this);

        mToAd3ia = findViewById(R.id.home_to_ad3ia);
        mToAd3ia.setOnClickListener(this);

        mToAzkar = findViewById(R.id.home_to_azkar);
        mToAzkar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.openDrawer:
                mNav.openDrawer(Gravity.LEFT);
                break;

            case R.id.home_to_seb7a:
                Intent intent = new Intent(HomeActivity.this, ShowElseb7a.class);
                startActivity(intent);
                break;

            case R.id.home_to_ad3ia:
                Intent intent2 = new Intent(HomeActivity.this, Ad3iaActivity.class);
                startActivity(intent2);
                break;

            case R.id.home_to_azkar:
                Intent intent3 = new Intent(HomeActivity.this, AzkarActivity.class);
                startActivity(intent3);
                break;

        }
    }

    //slider ---------------------------------------------------------------------------------------------
    private void iniSlider() {
        viewPager2 = findViewById(R.id.viewPagerImageSlider);
        slideList.add(new SlideItem(R.drawable.p1_pager));
        slideList.add(new SlideItem(R.drawable.p2_pager));
        slideList.add(new SlideItem(R.drawable.p3_pager));
        slideList.add(new SlideItem(R.drawable.p4_pager));
        slideList.add(new SlideItem(R.drawable.p5_pager));
        viewPager2.setAdapter(new SliderAdapter(slideList, viewPager2));
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
                page.setScaleY(0.85f + r * 0.15f);
            }
        });
        viewPager2.setPageTransformer(compositePageTransformer);
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                sliderhandler.removeCallbacks(slideRunnable);
                sliderhandler.postDelayed(slideRunnable, 15000);
            }
        });
    }

    @Override
    public void onPause() {
        super.onPause();
        sliderhandler.removeCallbacks(slideRunnable);
    }

    @Override
    public void onResume() {
        super.onResume();
        sliderhandler.postDelayed(slideRunnable, 10000);
    }
}