package com.example.symptomchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView img1;
ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;
    ImageView img6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        img3=findViewById(R.id.img3);
        img4=findViewById(R.id.img4);
        img5=findViewById(R.id.img5);
        img6=findViewById(R.id.img6);
img1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent n=new Intent(MainActivity.this,Orthopedics.class);
        startActivity(n);
    }
});
img2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent g=new Intent(MainActivity.this,WomenHealth.class);
        startActivity(g);
    }
});
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g=new Intent(MainActivity.this,HealthTracker.class);
                startActivity(g);
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g=new Intent(MainActivity.this,Neurology.class);
                startActivity(g);
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g=new Intent(MainActivity.this,SymptomChecker.class);
                startActivity(g);
            }
        });
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g=new Intent(MainActivity.this, Vaccination.class);
                startActivity(g);
            }
        });

    }
}