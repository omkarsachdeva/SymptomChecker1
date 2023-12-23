package com.example.symptomchecker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HealthTracker extends AppCompatActivity {
    CardView cardView;
    CardView cardView2;
    CardView cardView3;
    CardView cardView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_tracker);
        cardView=findViewById(R.id.cardView);
        cardView2=findViewById(R.id.cardView2);
        cardView3=findViewById(R.id.cardView3);
        cardView4=findViewById(R.id.cardView4);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(HealthTracker.this,heartrate.class);
                startActivity(n);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(HealthTracker.this,activitytracking.class);
                startActivity(n);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(HealthTracker.this,exerciselogging.class);
                startActivity(n);
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(HealthTracker.this,nutritiontracking.class);
                startActivity(n);
            }
        });

    }
}