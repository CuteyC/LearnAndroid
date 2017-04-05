package com.example.administrator.log;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button button;
    private final String Tag="LogDemo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.Button);
        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.v(Tag,"This is Verbose");
                Log.d(Tag,"This is Debug");
                Log.i(Tag,"This is Info");
                Log.w(Tag,"This is Warn");
                Log.e(Tag,"This is Error");

            }
        });
    }
}


