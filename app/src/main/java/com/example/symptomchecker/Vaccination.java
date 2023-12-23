package com.example.symptomchecker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Vaccination extends AppCompatActivity {
CardView cardView4;
    CardView cardView5;
    CardView cardView6;
    CardView cardView8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaccination);
        cardView5=findViewById(R.id.cardView5);
        cardView6=findViewById(R.id.cardView6);
        cardView8=findViewById(R.id.cardView8);
        cardView4=findViewById(R.id.cardView4);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(Vaccination.this,familyvaccineprofiles.class);
                startActivity(n);
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(Vaccination.this,educationresources.class);
                startActivity(n);
            }
        });
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(Vaccination.this,emergencyalerts.class);
                startActivity(n);
            }
        });
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(Vaccination.this,vaccinationcertificates.class);
                startActivity(n);
            }
        });
    }
}