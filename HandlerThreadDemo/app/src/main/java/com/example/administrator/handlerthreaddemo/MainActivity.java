package com.example.administrator.handlerthreaddemo;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;


public class MainActivity extends AppCompatActivity {
    Handler updateBarHandler =new Handler(){
        public void handleMessage(Message msg){
            super.handleMessage(msg);
            progressBar.setProgress(msg.arg1);
        }
    };
    private ProgressBar progressBar= null;
    private Button StartButton=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar=(ProgressBar)findViewById(R.id.bar);
        StartButton=(Button)findViewById(R.id.Start);
        StartButton.setOnClickListener(new StartButtonListener());
    }
    class StartButtonListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            progressBar.setVisibility(View.VISIBLE);
            updateBarHandler.post(updateThread);
        }
    }

     Runnable updateThread = new Runnable() {
        int i=0;
        @Override
        public void run() {
            System.out.println("Begin");
            i=i+10;
            Message massage=updateBarHandler.obtainMessage();
             massage.arg1=i;

            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            updateBarHandler.sendMessage(massage);
            int max =progressBar.getMax();
            if(i<max){
                updateBarHandler.removeCallbacks(updateThread);
            }
        }
    };
}
