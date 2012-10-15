package com.example.slide4android_diandian;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Slide4Android_diandian extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide4_android_diandian);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_slide4_android_diandian, menu);
        return true;
    }
}
