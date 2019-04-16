package com.example.a1056374147.ejercicios.app;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ejercicio1_Examen extends AppCompatActivity {
    TextView la;
    Button az,ro,ve,sigu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ejercicio1__examen);
           la= (TextView)findViewById(R.id.lblcolor);

        az = (Button) findViewById(R.id.btnAzul);
        az.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                la.setTextColor(Color.BLUE);
                la.setText("Berenice");
            }
        });
        ro = (Button) findViewById(R.id.btnRojo);
        ro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                la.setTextColor(Color.RED);
                la.setText("Berenice");
            }
        });
       ve = (Button) findViewById(R.id.btnVerde);
        ve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                la.setTextColor(Color.GREEN);
                la.setText("Berenice");

            }
        });

        sigu = (Button) findViewById(R.id.sig);
        sigu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(ejercicio1_Examen.this, ejercicio2_Examen.class);
                startActivity(siguiente);

            }
        });
    }
}
