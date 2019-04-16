package com.example.a1056374147.ejercicios.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ejercicio4 extends AppCompatActivity {
    private TextView lblresultado;
    private EditText txtnombre;
    private EditText txtciudad;
    Button sig;
    Button aceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4);

        lblresultado = (TextView) findViewById(R.id.lblresultado);
        txtnombre = (EditText) findViewById(R.id.txtnombre);
        txtciudad = (EditText) findViewById(R.id.txtciudad);

        aceptar = (Button) findViewById(R.id.aceptar);
        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = String.valueOf(txtnombre.getText());
                String Ciudad = String.valueOf(txtciudad.getText());
                lblresultado.setText("Usted se llama: " + nombre + " y vive en: " + Ciudad);
            }
        });


        Button desactivar = (Button) findViewById(R.id.desactivar);
        desactivar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtnombre.setEnabled(false);
                txtciudad.setEnabled(false);
            }
        });

        Button activar = (Button) findViewById(R.id.activar);
        desactivar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtnombre.setEnabled(true);
                txtciudad.setEnabled(true);
            }
        });

        Button sig = (Button) findViewById(R.id.sig);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(ejercicio4.this, ejercicio5.class);
                startActivity(siguiente);
            }
        });

    }
}
