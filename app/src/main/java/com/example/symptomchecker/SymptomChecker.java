package com.example.symptomchecker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SymptomChecker extends AppCompatActivity {
CardView cardView2;
    CardView cardView3;
    CardView cardView4;
    CardView cardView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptom_checker);
        cardView5=findViewById(R.id.cardView5);
        cardView2=findViewById(R.id.cardView2);
        cardView3=findViewById(R.id.cardView3);
        cardView4=findViewById(R.id.cardView4);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(SymptomChecker.this,respiratorysymptoms.class);
                startActivity(n);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(SymptomChecker.this,urinarysymptoms.class);
                startActivity(n);
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(SymptomChecker.this,neurologicalsymptoms.class);
                startActivity(n);
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(SymptomChecker.this,digestivesymptoms.class);
                startActivity(n);
            }
        });
    }
}