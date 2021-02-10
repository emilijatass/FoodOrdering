package com.example.virtualiw;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import com.example.virtualiw.R;

public class VirtualWaitress extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virtual_waitress);
        Thread startTimer = new Thread() {
            public void run() {
                try {
                    sleep(10000);
                    Intent intent0 = new Intent(VirtualWaitress.this, SlimpleTextClientActivity.class);
                    startActivity(intent0);
                    overridePendingTransition(R.anim.fadin, R.anim.fadout);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };
        startTimer.start();
    }
}
