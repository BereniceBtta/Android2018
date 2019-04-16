package com.example.a1056374147.ejercicios.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ejercicio6 extends AppCompatActivity {
    private TextView finalIDN;
    private EditText frase;
    Button sig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio6);
        finalIDN = (TextView) findViewById(R.id.finalIDN);
        frase = (EditText) findViewById(R.id.frase);

        Button IDN = (Button) findViewById(R.id.idn);
        IDN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String DNI = String.valueOf(frase.getText());
                if (DNI.isEmpty()) {
                    Toast.makeText(ejercicio6.this, "cadena vacia", Toast.LENGTH_LONG).show();
                    //JOptionPane.showMessageDialog(null,"Cadena Vacía");
                } else {
                    String dni = DNI.replaceAll("\\,", "");
                    String dnI = dni.replaceAll("\\.", "");
                    String dn = dnI.replaceAll("\\-", "");
                    String d = dn.replaceAll("\\_", "");
                    String e = dn.replaceAll(" ", "");
                    String dniFinal = e.trim();
                    finalIDN.setText(dniFinal);
                }
            }
        });


        Button sig = (Button) findViewById(R.id.sig);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(ejercicio6.this, ejercicio7.class);
                startActivity(siguiente);
            }
        });

    }

}
