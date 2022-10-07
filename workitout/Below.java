package com.example.workitout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Below extends AppCompatActivity implements View.OnClickListener {

    Button btn_jump,btn_swim,btn_run,btn_squat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_below);
        btn_jump=findViewById(R.id.jump);
        btn_run=findViewById(R.id.run);
        btn_squat=findViewById(R.id.squat);
        btn_swim=findViewById(R.id.swim);

        btn_swim.setOnClickListener(this);
        btn_jump.setOnClickListener(this);
        btn_squat.setOnClickListener(this);
        btn_run.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==btn_jump){
            startActivity(new Intent(this,Jump.class));
        }
        if(v==btn_run){
            startActivity(new Intent(this,Run.class));
        }
        if(v==btn_squat){
            startActivity(new Intent(this,Squat.class));
        }
        if(v==btn_swim){
            startActivity(new Intent(this,Swim.class));
        }
    }
}