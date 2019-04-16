package com.example.a1056374147.ejercicios.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ejercicio1 extends AppCompatActivity {

    private TextView lblnombre;
    private TextView lblciudad;
    Button sigu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.a1056374147.ejercicios.app.R.layout.activity_ejercicio1);

        lblnombre = (TextView) findViewById(com.example.a1056374147.ejercicios.app.R.id.lblnombre);
        lblciudad = (TextView) findViewById(com.example.a1056374147.ejercicios.app.R.id.lblciudad);

        Button ocultarNombre = (Button) findViewById(com.example.a1056374147.ejercicios.app.R.id.ocultarNombre);
        ocultarNombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblnombre.setVisibility(TextView.INVISIBLE);

            }
        });
        Button oculCiudad = (Button) findViewById(com.example.a1056374147.ejercicios.app.R.id.oculCiudad);
        oculCiudad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblciudad.setVisibility(TextView.INVISIBLE);
            }
        });
        Button mosNom = (Button) findViewById(com.example.a1056374147.ejercicios.app.R.id.mosNom);
        mosNom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblnombre.setVisibility(TextView.VISIBLE);
                ;
            }
        });
        Button mosCiu = (Button) findViewById(com.example.a1056374147.ejercicios.app.R.id.mosCiu);
        mosCiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblciudad.setVisibility(TextView.VISIBLE);
            }
        });

        sigu = (Button) findViewById(R.id.sig);
        sigu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(ejercicio1.this, ejercicio2.class);
                startActivity(siguiente);

            }
        });



        Button examen = (Button) findViewById(R.id.examen);
        examen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent con = new Intent(ejercicio1.this, ejercicio1_Examen.class);
                startActivity(con);
                ;
            }
        });


    }


}
