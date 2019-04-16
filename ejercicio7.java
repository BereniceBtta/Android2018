package com.example.a1056374147.ejercicios.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ejercicio7 extends AppCompatActivity {
    private TextView lblsubcadena;
    private EditText txtfrase;
    private EditText txtposini;
    private EditText txtposfin;
    Button sig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio7);
        lblsubcadena = (TextView) findViewById(R.id.lblsubcadena);
        txtfrase = (EditText) findViewById(R.id.txtfrase);
        txtposini = (EditText) findViewById(R.id.txtposini);
        txtposfin = (EditText) findViewById(R.id.txtposfin);

        Button IDN = (Button) findViewById(R.id.analizar);
        IDN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String frase = String.valueOf(txtfrase.getText());
                    String posIni = String.valueOf(txtposini.getText());
                    int posini = Integer.parseInt(posIni) - 1;
                    String posFin = String.valueOf(txtposfin.getText());
                    int posfin = Integer.parseInt(posFin);
                    String subcad = frase.substring(posini, posfin);//el substring ya resta uno por default
                    lblsubcadena.setText(subcad);
                } catch (IndexOutOfBoundsException exception) {
                    Toast.makeText(ejercicio7.this, "Revise sus datos", Toast.LENGTH_LONG).show();
                } catch (NumberFormatException exception) {
                    Toast.makeText(ejercicio7.this, "Revise sus datos (fuera de rango)", Toast.LENGTH_LONG).show();
                }

            }
        });

        sig = (Button) findViewById(R.id.sig);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(ejercicio7.this, ejercicio8.class);
                startActivity(siguiente);
            }
        });


    }

}
