package com.example.administrator.handlerdemo;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button StartButton = null;
    private Button StopButton = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StartButton = (Button) findViewById(R.id.start);
        StartButton.setOnClickListener(new StartButtonListener());
        StopButton = (Button) findViewById(R.id.Stop);
        StopButton.setOnClickListener(new StopButtonListener());
    }


    Handler handler = new Handler();

    class StartButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
             handler.post(ChangeThread);
        }
    }
    class StopButtonListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            handler.removeCallbacks(ChangeThread);
        }
    }

    Runnable ChangeThread = new Runnable() {
        @Override
        public void run() {
            System.out.println("ChangeThread");
            Log.v("tag","ChangeThread");
            handler.postDelayed(ChangeThread,2000);
        }
    };
}