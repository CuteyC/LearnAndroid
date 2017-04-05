package com.example.administrator.xmlandroid;

import android.content.DialogInterface;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v4.media.MediaBrowserServiceCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton b1 = null;
    RadioButton b2 = null;
    RadioButton b3 = null;
    RadioButton b4 = null;
    RadioGroup r1 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MainActivity.this.setTitle("球星选择");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 = (RadioGroup) findViewById(R.id.Group);
        r1.clearCheck();
        b1 = (RadioButton) findViewById(R.id.choice);
        b2 = (RadioButton) findViewById(R.id.choice2);
        b3 = (RadioButton) findViewById(R.id.choice3);
        b4 = (RadioButton) findViewById(R.id.choice4);
        b1.setClickable(true);

        Button button1 = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(new button1());
        button2.setOnClickListener(new button2());
    }

    class button1 implements OnClickListener {
        public void onClick(View v) {
            String ans="";
            if (b1.isChecked()) {
                ans = "迈克尔.乔丹";
            }
            if (b2.isChecked()) {
                ans = "勒布朗.詹姆斯";
            }
            if (b3.isChecked()) {
                ans = "科比.布莱恩特";
            }
            if (b4.isChecked()) {
                ans = "史蒂芬.库里";
            }
            Intent intent=new Intent();
            intent.setClass(MainActivity.this,OtherActivity.class);
            Bundle bundle=new Bundle();
            bundle.putString("ans",ans);
            intent.putExtras(bundle);
            startActivityForResult(intent,0);

        }
    }

    class button2 implements OnClickListener {
        public void onClick(View v) {
            r1.clearCheck();
            MainActivity.this.setTitle("球星选择");
        }
    }

    protected void onActivityResult(int RequestCode,int Resultcode,Intent intent){
        super.onActivityResult(RequestCode, Resultcode,intent);
        if(RequestCode==0&&Resultcode==0){
        Bundle bundle=intent.getExtras();
        String ans=bundle.getString("ans");
        TextView tv2=(TextView)findViewById(R.id.textView3);
        tv2.setText("你上次选择的答案是："+ans);
    }
    }
}

