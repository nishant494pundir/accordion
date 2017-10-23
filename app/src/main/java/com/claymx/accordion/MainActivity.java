package com.claymx.accordion;

import android.content.Context;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.eftimoff.viewpagertransformers.AccordionTransformer;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;

    //final Context context = this;

    int NUM_PAGES = 6;
    int currentPage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomPagerAdapter customPagerAdapter = new CustomPagerAdapter(this);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(customPagerAdapter);
        viewPager.setPageTransformer(true, new AccordionTransformer());



        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                viewPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 2000, 2000);
    }
    }

