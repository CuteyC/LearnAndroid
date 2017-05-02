package com.example.administrator.datepicker;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;
import android.view.View;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import android.widget.Button;
import android.widget.DatePicker;
import android.view.View.OnClickListener;
import android.app.DatePickerDialog;

public class MainActivity extends Activity {
    private TextView showtime;
    private Button setdate;
    private int year;
    private int month;
    private int day;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showtime = (TextView) findViewById(R.id.showtime);
        setdate = (Button) findViewById(R.id.setdate);
        Calendar C = Calendar.getInstance(Locale.CHINA);
        Date date = new Date();
        C.setTime(date);
        year = C.get(Calendar.YEAR);
        month = C.get(Calendar.MONTH);
        day = C.get(Calendar.DAY_OF_MONTH);
        showtime.setText("当前日期:" + year + "年" + (month + 1) + "月" + day + "日");
        setdate.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog myDatePicker=new DatePickerDialog(MainActivity.this,Datelistener,year,month,day);
                myDatePicker.show();
            }
        });
    }
    private DatePickerDialog.OnDateSetListener Datelistener=new DatePickerDialog.OnDateSetListener()
     {
         @Override
         public void onDateSet(DatePicker v, int y, int m,int d) {


             //修改year、month、day的变量值，以便以后单击按钮时，DatePickerDialog上显示上一次修改后的值
             year=y;
             month=m;
             day=d;
             //更新日期
             updateDate();

         }

        private void updateDate(){
            showtime.setText("当前日期:"+year+"年"+(month+1)+"月"+day+"日");
        }
};
}
