package com.example.a1056374147.ejercicios.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ejercicio3 extends AppCompatActivity {
    private TextView label;
    private EditText texto;
    Button sig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);
        label = (TextView) findViewById(R.id.label);
        texto = (EditText) findViewById(R.id.texto);
        texto.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                String c = String.valueOf(texto.getText());
                label.setText(c);
                return false;
            }
        });

        Button vaciar = (Button) findViewById(R.id.vaciar);
        vaciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                label.setText("           ");
                texto.setText("           ");
            }
        });
        Button sig = (Button) findViewById(R.id.sig);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(ejercicio3.this, ejercicio4.class);
                startActivity(siguiente);
            }
        });


    }
}
