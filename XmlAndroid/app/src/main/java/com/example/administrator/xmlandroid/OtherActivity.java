package com.example.administrator.xmlandroid;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class OtherActivity extends Activity {
    private Bundle bundle;
    private Intent intent;
    String ans="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        intent=this.getIntent();
        bundle=intent.getExtras();
        ans=bundle.getString("ans");
        if(ans.equals("科比.布莱恩特")){
            TextView tv=(TextView)findViewById(R.id.textView2);
            tv.setText("您选择的答案正确！");
        }else{
            TextView tv=(TextView)findViewById(R.id.textView2);
            tv.setText("您选择的答案错误！");
        }

        Button button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){

                OtherActivity.this.setResult(0,intent);
                OtherActivity.this.finish();
            }
        });
        };
    }

