package com.example.symptomchecker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Neurology extends AppCompatActivity {
CardView cardView;
    CardView cardView2;
    CardView cardView3;
    CardView cardView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neurology);
        cardView=findViewById(R.id.cardView);
        cardView2=findViewById(R.id.cardView2);
        cardView3=findViewById(R.id.cardView3);
        cardView4=findViewById(R.id.cardView4);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(Neurology.this,epilopsy.class);
                startActivity(n);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g=new Intent(Neurology.this,migraines.class);
                startActivity(g);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g=new Intent(Neurology.this,alzheimer.class);
                startActivity(g);
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g=new Intent(Neurology.this,parkinson.class);
                startActivity(g);
            }
        });
    }
}