package com.example.workitout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Above extends AppCompatActivity implements View.OnClickListener {

    Button btn_walk,btn_hand,btn_ankle,btn_cobra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_above);
        btn_ankle=findViewById(R.id.ankle);
        btn_hand=findViewById(R.id.hand);
        btn_cobra=findViewById(R.id.cobra);
        btn_walk=findViewById(R.id.walk);
        btn_walk.setOnClickListener(this);
        btn_cobra.setOnClickListener(this);
        btn_hand.setOnClickListener(this);
        btn_ankle.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v==btn_walk){
            startActivity(new Intent(this,Walking.class));
        }
        if(v==btn_ankle){
            startActivity(new Intent(this,Ankle.class));
        }
        if(v==btn_hand){
            startActivity(new Intent(this,Hand.class));
        }
        if(v==btn_cobra){
            startActivity(new Intent(this,Cobra.class));
        }
    }
}