package com.example.exam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class seekbar extends AppCompatActivity {
private SeekBar seek;
private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar);
        findview();

    }
    public void findview(){
        seek=(SeekBar)findViewById(R.id.seekBar3);
        text=(TextView)findViewById(R.id.textView2);

        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            text.setTextSize(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(seekbar.this,"start size= " +seek.getProgress(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(seekbar.this,"stop size = "+seek.getProgress(),Toast.LENGTH_SHORT).show();

            }
        });
    }
}
