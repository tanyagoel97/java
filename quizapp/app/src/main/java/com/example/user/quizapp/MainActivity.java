package com.example.user.quizapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static int Splash_time_out=5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run()
            {
                Intent i=new Intent(MainActivity.this,quiz.class);
                startActivity(i);
                finish();
            }
        },Splash_time_out);

    }
}

