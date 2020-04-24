package cn.edu.sdwu.android.home.sn170507180201;

import android.content.res.Resources;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class homework_btn3 extends AppCompatActivity {
    private int q=0,correct=0;
    private String[] temp=null;
    private ArrayList<String[]> list=new ArrayList<String[]>();

    private long begin_time;
    private long end_time;
    private boolean show=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_homework_btn3);

        //获取资源
        Resources res=getResources();
        String[] question=this.getResources().getStringArray(R.array.testTitle);
        temp=question;
        String[] an1=this.getResources().getStringArray(R.array.testOption1);
        String[] an2=this.getResources().getStringArray(R.array.testOption2);
        String[] an3=this.getResources().getStringArray(R.array.testOption3);
        final int[] answer=this.getResources().getIntArray(R.array.anwser);
        final TextView textView=(TextView) findViewById(R.id.timu);
        final TextView notice=(TextView) findViewById(R.id.title);
        final RadioGroup radioGroup=(RadioGroup) findViewById(R.id.xuanxiang);
        RadioButton rb1=(RadioButton)findViewById(R.id.an1);
        RadioButton rb2=(RadioButton)findViewById(R.id.an2);
        RadioButton rb3=(RadioButton)findViewById(R.id.an3);
        RadioButton rb4=(RadioButton)findViewById(R.id.an4);
        list.add(an1);
        list.add(an2);
        list.add(an3);

        textView.setText(question[q]);
        rb1.setText(list.get(q)[0]);
        rb2.setText(list.get(q)[1]);
        rb3.setText(list.get(q)[2]);
        rb4.setText(list.get(q)[3]);


        //显示隐藏数组
        Button button=(Button)findViewById(R.id.start);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(show){
                    textView.setVisibility(View.VISIBLE);
                    notice.setVisibility(View.VISIBLE);
                    radioGroup.setVisibility(View.VISIBLE);
                    show=false;
                }else {
                    textView.setVisibility(View.INVISIBLE);
                    notice.setVisibility(View.INVISIBLE);
                    radioGroup.setVisibility(View.INVISIBLE);
                    show=true;
                }
            }
        });

       radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

           TextView textView = (TextView) findViewById(R.id.timu);
           RadioButton rb1 = (RadioButton) findViewById(R.id.an1);
           RadioButton rb2 = (RadioButton) findViewById(R.id.an2);
           RadioButton rb3 = (RadioButton) findViewById(R.id.an3);
           RadioButton rb4 = (RadioButton) findViewById(R.id.an4);
           @Override
           public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
               // radioGroup.clearCheck();///
               if(rb1.isChecked()) {
                   if(answer[q]==1){
                       correct++;
                   }
                   rb1.setChecked(false);
               }else if(rb2.isChecked()) {
                   if(answer[q]==2){
                       correct++;
                   }
                   rb2.setChecked(false);
               }else if(rb3.isChecked()) {
                   if(answer[q]==3){
                       correct++;
                   }
                   rb3.setChecked(false);
               }else if(rb4.isChecked()) {
                   if(answer[q]==4){
                       correct++;
                   }
                   rb4.setChecked(false);
               }

               String res = "";
               end_time = System.currentTimeMillis();
               end_time /= 1000;
               long total = end_time - begin_time;

               q++;
               if (q < 3) {
                   textView.setText(temp[q]);
                   rb1.setText(list.get(q)[0]);
                   rb2.setText(list.get(q)[1]);
                   rb3.setText(list.get(q)[2]);
                   rb4.setText(list.get(q)[3]);
                   Log.i(homework_btn3.this.toString(), String.valueOf(q));

               }
               if (q == 3) {
                   res += "用时共:" + total + "s"+"您答对了"+correct+"道题，"+"您答错了"+(3-correct)+"道题";
                   radioGroup.setVisibility(View.INVISIBLE);
                   Toast.makeText(homework_btn3.this, res, Toast.LENGTH_SHORT).show();

               }

           }
       });



    }


}
