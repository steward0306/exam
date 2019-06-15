package com.example.exam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.awt.font.TextAttribute;

public class spinner extends AppCompatActivity {
private Spinner food;
private Spinner country;
private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        findfiew();
    }
    public void findfiew(){
        food=(Spinner)findViewById(R.id.food);
        country=(Spinner)findViewById(R.id.country);
        text=(TextView)findViewById(R.id.text);
        food.setSelection(0,true);
        food.setOnItemSelectedListener(listener);

        String[] arr={"Japan","China","Taiwan","korea"};
        ArrayAdapter<String> ad=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,arr);
        country.setAdapter(ad);
        country.setSelection(0,true);
        country.setOnItemSelectedListener(listener);
    }
    Spinner.OnItemSelectedListener listener=new Spinner.OnItemSelectedListener(){
    @Override
        public void onItemSelected(AdapterView<?> parent, View view,int pos,long id){
        text.setText(parent.getItemAtPosition(pos).toString());
    }
    @Override
        public void onNothingSelected(AdapterView<?> parent){
        text.setText("None");
    }
    };
}
