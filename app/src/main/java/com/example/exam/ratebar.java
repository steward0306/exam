package com.example.exam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class ratebar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratebar);
        final RatingBar ratebar=(RatingBar)findViewById(R.id.ratingBar);
        ratebar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
            String string=rating+"star(s)";
                Toast.makeText(ratebar.this,string,Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void web(View v){
    Intent intent=new Intent();
    intent.setClass(this,webview.class);
    startActivity(intent);
    }
}
