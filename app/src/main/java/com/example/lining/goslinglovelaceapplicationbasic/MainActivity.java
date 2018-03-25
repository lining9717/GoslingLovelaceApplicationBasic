package com.example.lining.goslinglovelaceapplicationbasic;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        if(isScrennLand()){
            setContentView(R.layout.activity_main);
        }else {
            setContentView(R.layout.activity_main_land);
        }
    }

    private boolean isScrennLand() {
        // 横屏
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            return true;
        }
        return false;
    }
}
