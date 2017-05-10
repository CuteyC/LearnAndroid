package com.example.administrator.mycalculator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity implements OnClickListener {

    private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,Add,Cal,Dvi,Mul,delete,Sub,CE,Point;
    private EditText editText;//显示输入的数字
    private double n1 = 0.0, n2 = 0.0;//两个操作数
    private double result=0.0;//结果
    int sign=0;//用来判断是做加减乘除哪个操作
    boolean isClickCal=false;
    final int SignAdd=1;
    final int SignSub=2;
    final int SignMul=3;
    final int SignDvi=4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0=(Button)findViewById(R.id.btn0);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        Point=(Button)findViewById(R.id.point);
        Add=(Button)findViewById(R.id.Add);
        Cal=(Button)findViewById(R.id.Cal);
        Dvi=(Button)findViewById(R.id.dvi);
        Mul=(Button)findViewById(R.id.Mul);
        delete=(Button)findViewById(R.id.delete);
        Sub=(Button)findViewById(R.id.Sub);
        CE=(Button)findViewById(R.id.CE);
        editText=(EditText)findViewById(R.id.editText1);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        Point.setOnClickListener(this);
        Add.setOnClickListener(this);
        Cal.setOnClickListener(this);
        Dvi.setOnClickListener(this);
        Mul.setOnClickListener(this);
        Sub.setOnClickListener(this);
        delete.setOnClickListener(this);
        CE.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){

            //----btn0~btn9:
            case R.id.btn0:
                if (isClickCal){
                    editText.setText(null);
                    isClickCal=false;
                }
                    String num=editText.getText().toString();
                    num+="0";
                    editText.setText(num);
                    break;

            case R.id.btn1:
                if (isClickCal){
                    editText.setText(null);
                    isClickCal=false;
                }
                    String num1=editText.getText().toString();
                    num1+="1";
                    editText.setText(num1);
                    break;

            case R.id.btn2:
                if (isClickCal){
                    editText.setText(null);
                    isClickCal=false;
                }
                    String num2=editText.getText().toString();
                    num2+="2";
                    editText.setText(num2);
                    break;

            case R.id.btn3:
                if (isClickCal){
                    editText.setText(null);
                    isClickCal=false;
                }
                    String num3=editText.getText().toString();
                    num3+="3";
                    editText.setText(num3);
                    break;

            case R.id.btn4:
                if (isClickCal){
                    editText.setText(null);
                    isClickCal=false;
                }
                    String num4=editText.getText().toString();
                    num4+="4";
                    editText.setText(num4);
                    break;

            case R.id.btn5:
                if (isClickCal){
                    editText.setText(null);
                    isClickCal=false;
                }
                    String num5=editText.getText().toString();
                    num5+="5";
                    editText.setText(num5);
                    break;

            case R.id.btn6:
                if (isClickCal){
                    editText.setText(null);
                    isClickCal=false;
                }
                    String num6=editText.getText().toString();
                    num6+="6";
                    editText.setText(num6);
                    break;

            case R.id.btn7:
                if (isClickCal){
                    editText.setText(null);
                    isClickCal=false;
                }
                    String num7=editText.getText().toString();
                    num7+="7";
                    editText.setText(num7);
                    break;

            case R.id.btn8:
                if (isClickCal){
                    editText.setText(null);
                    isClickCal=false;
                }
                    String num8=editText.getText().toString();
                    num8+="8";
                    editText.setText(num8);
                    break;

            case R.id.btn9:
                if (isClickCal){
                    editText.setText(null);
                    isClickCal=false;
                }
                    String num9=editText.getText().toString();
                    num9+="9";
                    editText.setText(num9);
                    break;

                //btn Point:
            case R.id.point:
                String Pointnum=editText.getText().toString();
                if(Pointnum.equals("")){
                    return;
                }else if(Pointnum.indexOf(".")>0){
                    return;
                }else{
                    Pointnum+=".";
                    editText.setText(Pointnum);
                    break;
                }

                //btn delete:
            case R.id.delete:
                String Deletenum=editText.getText().toString();
                try {
                    editText.setText(Deletenum.substring(0, Deletenum.length()-1));
                } catch (Exception e) {
                    editText.setText("");
                }
                break;
            //btn CE:
            case R.id.CE:
                editText.setText(null);
                break;
            //btn Add:
            case R.id.Add:
               String StrAdd= editText.getText().toString();
                if (StrAdd.equals("")){
                    return;
                }else {
                    n1=Double.valueOf(StrAdd);
                    editText.setText(null);
                    sign = SignAdd;
                    isClickCal=false;
                    break;
                }
            //btn Sub:
            case R.id.Sub:
                String StrSub= editText.getText().toString();
                if (StrSub.equals("")){
                    return;
                }else {
                    n1=Double.valueOf(StrSub);
                    editText.setText(null);
                    sign = SignSub;
                    isClickCal=false;
                    break;
                }
            //btn Mul:
            case R.id.Mul:
                String StrMul= editText.getText().toString();
                if (StrMul.equals("")){
                    return;
                }else {
                    n1=Double.valueOf(StrMul);
                    editText.setText(null);
                    sign = SignMul;
                    isClickCal=false;
                    break;
                }
            //btn Dvi:
            case R.id.dvi:
                String StrDvi= editText.getText().toString();
                if (StrDvi.equals("")){
                    return;
                }else {
                    n1=Double.valueOf(StrDvi);
                    editText.setText(null);
                    sign = SignDvi;
                    isClickCal=false;
                    break;
                }
            //btn Cal:
            case R.id.Cal:
                String StrCal=editText.getText().toString();
                if(StrCal.equals("")){
                    return;
                }
                n2=Double.valueOf(StrCal);
                editText.setText(null);
                switch (sign){
                    case SignAdd:
                        result=n1+n2;
                        break;
                    case SignSub:
                        result=n1-n2;
                        break;
                    case SignMul:
                        result=n1*n2;
                        break;
                    case SignDvi:
                        result=n1/n2;
                        break;
                }
                editText.setText(String.valueOf(result));
                isClickCal=true;
                n1=result;
                n2=0;
                sign=0;
                break;


        }
    }
}
