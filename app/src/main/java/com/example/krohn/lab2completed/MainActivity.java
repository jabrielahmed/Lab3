package com.example.krohn.lab2completed;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Resources res = getResources();
        TypedArray icons = res.obtainTypedArray(R.array.icons);
        Drawable drawable = icons.getDrawable(0);

        TypedArray colors = res.obtainTypedArray(R.array.colors);
        int color = colors.getColor(0,0);
        if(getResources().getConfiguration().orientation==Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.activity_landscape);
        } else{
            setContentView(R.layout.activity_portrait);
        }



        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
    }
}