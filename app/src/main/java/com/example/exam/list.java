package com.example.exam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class list extends AppCompatActivity {
private Spinner fun;
String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        fun=(Spinner)findViewById(R.id.spinner);
        fun.setOnItemSelectedListener(listen);
    }
    Spinner.OnItemSelectedListener listen=new Spinner.OnItemSelectedListener(){
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id){
            st=parent.getItemAtPosition(pos).toString();

        }
        @Override
        public void onNothingSelected(AdapterView<?> parent){

        }
    };
    public void onClick(View v){
        Intent intent=new Intent();
        if(st.equals("Scrollview"))intent.setClass(this,MainActivity.class);
        if(st.equals("Webview"))intent.setClass(this,webview.class);
        if(st.equals("Ratingbar"))intent.setClass(this,ratebar.class);
        if(st.equals("Seekbar"))intent.setClass(this,seekbar.class);
        if(st.equals("Compounbuttom"))intent.setClass(this,commonbutton.class);
        if(st.equals("Menus"));
        if(st.equals("Spinner"))intent.setClass(this,spinner.class);
        startActivity(intent);

    }
}
