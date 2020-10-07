package com.mo_said.azkar.Splach;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.mo_said.azkar.HomeActivity;
import com.mo_said.azkar.R;

public class SplachActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent n = new Intent(SplachActivity.this, HomeActivity.class);
                startActivity(n);
                finish();
            }
        },5000);
        
    }
}