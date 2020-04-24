package cn.edu.sdwu.android.home.sn170507180201;

import android.content.DialogInterface;
import android.renderscript.Byte2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class homework_btn5 extends AppCompatActivity {
    private EditText editText;
    boolean clear_flag;//清空
    String a="";
    int symbol;
    double x;
    double y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_homework_btn52);

        Button btn0=(Button) findViewById(R.id.btn0);
        Button btn1=(Button) findViewById(R.id.btn1);
        Button btn2=(Button) findViewById(R.id.btn2);
        Button btn3=(Button) findViewById(R.id.btn3);
        Button btn4=(Button) findViewById(R.id.btn4);
        Button btn5=(Button) findViewById(R.id.btn5);
        Button btn6=(Button) findViewById(R.id.btn6);
        Button btn7=(Button) findViewById(R.id.btn7);
        Button btn8=(Button) findViewById(R.id.btn8);
        Button btn9=(Button) findViewById(R.id.btn9);
        Button btn=(Button) findViewById(R.id.btn);
        Button jia=(Button) findViewById(R.id.jia);
        Button jian=(Button) findViewById(R.id.jian);
        Button cheng=(Button) findViewById(R.id.cheng);
        Button equal=(Button) findViewById(R.id.equal);
        Button change=(Button) findViewById(R.id.change);
        Button chu=(Button) findViewById(R.id.chu);
        Button mr=(Button) findViewById(R.id.mr);
        Button mc=(Button) findViewById(R.id.mc);
        Button m1=(Button) findViewById(R.id.m1);
        Button m2=(Button) findViewById(R.id.m2);
        Button c=(Button) findViewById(R.id.c);
        editText=(EditText)findViewById(R.id.xy);

        btn0.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                a+=0;
                editText.setText(a);
            }
        });
        btn1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                a+=1;
                editText.setText(a);
            }
        });
        btn2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                a+=2;
                editText.setText(a);
            }
        });
        btn3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                a+=3;
                editText.setText(a);
            }
        });
        btn4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                a+=4;
                editText.setText(a);
            }
        });
        btn5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                a+=5;
                editText.setText(a);
            }
        });
        btn6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                a+=6;
                editText.setText(a);
            }
        });
        btn7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                a+=7;
                editText.setText(a);
            }
        });
        btn8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                a+=8;
                editText.setText(a);
            }
        });
        btn9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                a+=9;
                editText.setText(a);
            }
        });
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                a+=".";
                editText.setText(a);
            }
        });
       c.setOnClickListener(new OnClickListener() {
           @Override
           public void onClick(View view) {
               a="";
               editText.setText(a);
           }
       });
        jia.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                symbol=1;//switch中的序号
                x=Double.parseDouble(editText.getText().toString());
                a="+";
                editText.setText(a);
            }
        });
        jian.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                symbol=2;
                x=Double.parseDouble(editText.getText().toString());
                a="-";
                editText.setText(a);

            }
        });
        cheng.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                symbol=3;//switch中的序号
                x=Double.parseDouble(editText.getText().toString());
                a="*";
                editText.setText(a);
            }
        });
        chu.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                symbol=4;//switch中的序号
                x=Double.parseDouble(editText.getText().toString());
                a="/";
                editText.setText(a);
            }
        });

        equal.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                y=Double.parseDouble(editText.getText().toString());
                switch (symbol){
                    case 1:
                        editText.setText(String.valueOf(x+y));
                        a="";
                        break;
                    case 2:
                        editText.setText(String.valueOf(x-y));
                        a="";
                        break;
                    case 3:
                        editText.setText(String.valueOf(x*y));
                        a="";
                        break;
                    case 4:
                        editText.setText(String.valueOf(1.0*x/y));
                        a="";
                        break;
                    default:
                        break;
                }
            }
        });
    }
}
