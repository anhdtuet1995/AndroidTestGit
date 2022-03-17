package com.example.androidtestgit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("anh.dt2", "huhuhuhu");
        Log.d("anh.dt2", "huhuhuhu master");
        Log.d("anh.dt2", "huhuhuhu1");
    }
}