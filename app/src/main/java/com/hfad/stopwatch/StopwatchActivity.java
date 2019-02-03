package com.hfad.stopwatch;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class StopwatchActivity extends Activity implements View.OnClickListener {
    public Button mBtnStart;
    public Button mBtnStop;
    public Button mBtnReset;


    private int mSeconds = 0;
    private boolean running = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);
        mBtnStart = findViewById(R.id.btn_start);
        mBtnStop = findViewById(R.id.btn_stop);
        mBtnReset = findViewById(R.id.btn_reset);

        mBtnStart.setOnClickListener(this);
        mBtnStop.setOnClickListener(this);
        mBtnReset.setOnClickListener(this);

        runTimer();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_start:
                //code
                running = true;
                break;
            case R.id.btn_stop:
                //code
                running = false;
                break;
            case R.id.btn_reset:
                //code
                running = false;
                mSeconds = 0;
                break;
        }
    }

    private void runTimer() {
        final TextView timeView = findViewById(R.id.time_view);
        final Handler handler = new Handler();
        handler.post(new  Runnable() {
            @Override
            public void run () {

               int hours = mSeconds / 3600;
                int minets = (mSeconds % 3600) / 60;
                int seconds = mSeconds % 60;

                String time = String.format(Locale.getDefault(), "%d:%02d:%02d", hours, minets, seconds);
                timeView.setText(time);

                if (running == true) {
                    mSeconds++;
                }
                handler.postDelayed(this, 1000);
            }
        });

    }
}
