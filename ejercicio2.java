package com.example.a1056374147.ejercicios.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ejercicio2 extends AppCompatActivity {
    private TextView nombre;
    private TextView etiqueta1;
    private TextView etiqueta2;
    Button sig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);
        nombre = (TextView) findViewById(R.id.nombre);
        etiqueta1 = (TextView) findViewById(R.id.etiqueta1);
        etiqueta2 = (TextView) findViewById(R.id.etiqueta2);
        Button transpasa1 = (Button) findViewById(R.id.transpasa1);
        transpasa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c = (String) nombre.getText();
                etiqueta1.setText(c);
                etiqueta2.setText("                   ");
            }
        });
        Button transpasa2 = (Button) findViewById(R.id.transpasa2);
        transpasa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = (String) nombre.getText();
                etiqueta1.setText("                   ");
                etiqueta2.setText(a);
            }
        });

        Button sig = (Button) findViewById(R.id.sig);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(ejercicio2.this, ejercicio3.class);
                startActivity(siguiente);
            }
        });

    }
}
