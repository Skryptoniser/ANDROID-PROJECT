package com.example.workitout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Category extends AppCompatActivity implements View.OnClickListener {

    Button btn_below,btn_middle,btn_above;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        btn_below=findViewById(R.id.below);
        btn_middle=findViewById(R.id.middle);
        btn_above=findViewById(R.id.above);

        btn_above.setOnClickListener(this);
        btn_middle.setOnClickListener(this);
        btn_below.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==btn_above){
            startActivity(new Intent(Category.this,Above.class));
        }
        if(v==btn_below){
            startActivity(new Intent(Category.this,Below.class));
        }
        if(v==btn_middle){
            startActivity(new Intent(Category.this,Middle.class));
        }
    }
}