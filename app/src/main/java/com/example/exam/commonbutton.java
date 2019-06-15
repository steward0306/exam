package com.example.exam;

import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class commonbutton extends AppCompatActivity {
private RadioGroup rgroup;
private CheckBox box;
private Switch sw;
private ToggleButton toggle;
private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commonbutton);
        findview();
    }
    public void findview(){
    text = (TextView)findViewById(R.id.text);
    rgroup =(RadioGroup)findViewById(R.id.ragroup);
    sw=(Switch)findViewById(R.id.switch1);
    rgroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            RadioButton radioButton=(RadioButton)group.findViewById(checkedId);
            text.setText(radioButton.getText());
        }
    });
    sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        Switch tr=(Switch)buttonView;
        String st;
        if(isChecked){
            st=tr.getText().toString()+"ON";
            text.setText(st);
        }
        else{
            st=tr.getText().toString()+"OFF";
            text.setText(st);
        }


        }
    });
    }

    public void ch(View view){
    box=(CheckBox)view;
    if(box.isChecked()){
        text.setText("Checked!");
    }
    else text.setText("Unchecked");

    }
    public void tog(View view){
        toggle=(ToggleButton) view;
        text.setText(toggle.getText());
    }

}
