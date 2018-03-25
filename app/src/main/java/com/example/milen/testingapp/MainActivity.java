package com.example.milen.testingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        long carouselSlideInterval = 3000; // 3 SECONDS
        int [] imageResourceIds = {R.drawable.color_1, R.drawable.color_2, R.drawable.color_3, R.drawable.color_4};

        ViewPagerCarouselView viewPagerCarouselView = findViewById(R.id.carousel_view);
        viewPagerCarouselView.setData(getSupportFragmentManager(), imageResourceIds, carouselSlideInterval);


    }
}
