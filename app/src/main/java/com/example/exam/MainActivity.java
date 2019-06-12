package com.example.exam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private LinearLayout lay;
    private ScrollView scroll;
    private int count=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findview();
    }
    public void findview(){
    textView=(TextView)findViewById(R.id.textView);
    scroll=(ScrollView)findViewById(R.id.scroll);
    lay=(LinearLayout)findViewById(R.id.lay);

    }
    public void add(View v){
    count++;
    String st=Integer.toString(count);
    textView.setText(st);
    TextView tx=new TextView(this);
    tx.setText(st);
    lay.addView(tx);

    scroll.post(new Runnable() {
        @Override
        public void run() {
    scroll.fullScroll(View.FOCUS_DOWN);
        }
    });
    }
    public void ratebar(View view){
        Intent intent=new Intent();
        intent.setClass(this,ratebar.class);
    startActivity(intent);
    }
}
