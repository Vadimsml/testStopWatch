package com.hfad.stopwatch;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class StopwatchActivity extends Activity implements View.OnClickListener {
public Button mBtnStart;
public Button mBtnStop;
public Button mBtnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);
        mBtnStart=findViewById(R.id.btn_start);
        mBtnStop=findViewById(R.id.btn_stop);
        mBtnReset=findViewById(R.id.btn_reset);

        mBtnStart.setOnClickListener(this);
        mBtnStop.setOnClickListener(this);
        mBtnReset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_start:
                //code
                break;
            case R.id.btn_stop:
                //code
                break;
            case R.id.btn_reset:
                //code
                break;
        }
    }
}
