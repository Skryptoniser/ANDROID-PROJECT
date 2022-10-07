package com.example.workitout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Middle extends AppCompatActivity implements View.OnClickListener {

    Button btn_chest,btn_tricep,btn_bicep,btn_back,btn_hamstring,btn_crunches;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_middle);
        btn_back=findViewById(R.id.back);
        btn_bicep=findViewById(R.id.bicep);
        btn_chest=findViewById(R.id.chest);
        btn_crunches=findViewById(R.id.crunch);
        btn_hamstring=findViewById(R.id.hamstring);
        btn_tricep=findViewById(R.id.tricep);

        btn_back.setOnClickListener(this);
        btn_tricep.setOnClickListener(this);
        btn_hamstring.setOnClickListener(this);
        btn_crunches.setOnClickListener(this);
        btn_chest.setOnClickListener(this);
        btn_bicep.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==btn_back){
            startActivity(new Intent(this,Back.class));
        }
        if(v==btn_bicep){
            startActivity(new Intent(this,Bicep.class));
        }
        if(v==btn_chest){
            startActivity(new Intent(this,Chest.class));
        }
        if(v==btn_crunches){
            startActivity(new Intent(this,Crunches.class));
        }
        if(v==btn_hamstring){
            startActivity(new Intent(this,Hamstring.class));
        }
        if(v==btn_tricep){
            startActivity(new Intent(this,Tricep.class));
        }
    }
}