package com.example.instalite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread t = new Thread()
        {
            @Override
            public void run() {
                try {
                    sleep(7000);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
            }
                finally {
                    Intent i = new Intent(MainActivity.this,InstaLite.class);
                    startActivity(i);

                }
                }
        };
        t.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}