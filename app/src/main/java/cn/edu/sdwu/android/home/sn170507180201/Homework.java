package cn.edu.sdwu.android.home.sn170507180201;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Homework extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_homework);
    }
    public  void homework_1(View view){
        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public  void homework_2(View view){
        Intent intent=new Intent(this,Main3Activity.class);
        startActivity(intent);
    }

}
