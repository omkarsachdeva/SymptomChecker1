package com.example.symptomchecker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Orthopedics extends AppCompatActivity {
   CardView cd1;
    CardView cd2;
    CardView cd3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orthopedics);
      cd1=findViewById(R.id.cd1);
        cd2=findViewById(R.id.cd2);
        cd3=findViewById(R.id.cd3);

        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(Orthopedics.this,findadoctor.class);
                startActivity(n);
            }
        });
        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(Orthopedics.this,requestanappointment.class);
                startActivity(n);
            }
        });
        cd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(Orthopedics.this,labreport.class);
                startActivity(n);
            }
        });



    }
}