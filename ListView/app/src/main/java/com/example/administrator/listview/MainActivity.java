package com.example.administrator.listview;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DialogTitle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;


public class MainActivity extends ListActivity {
    String[] weekStrings =new String []{"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
    ArrayAdapter<String> adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,weekStrings);
        this.setListAdapter(adapter);
        this.getListView().setOnItemSelectedListener(
                new OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                        MainActivity.this.setTitle(((TextView)arg1).getText());

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
                     MainActivity.this.setTitle("NothingSelected");
                    }
                }
        );

    }
}
