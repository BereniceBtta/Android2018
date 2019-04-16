package com.example.a1056374147.ejercicios.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class ejercicio8 extends AppCompatActivity {
    private TextView distancia;
    private EditText puntox1;
    private EditText puntox2;
    private EditText puntoy1;
    private EditText puntoy2;
    Button sigu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio8);
        distancia = (TextView) findViewById(R.id.distanciafinal);
        puntox1 = (EditText) findViewById(R.id.puntox1);
        puntox2 = (EditText) findViewById(R.id.puntox2);
        puntoy1 = (EditText) findViewById(R.id.puntoy1);
        puntoy2 = (EditText) findViewById(R.id.puntoy2);


        Button calcula = (Button) findViewById(R.id.calcular);
        calcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x1 = String.valueOf(puntox1.getText());
                double X1 = Double.parseDouble(x1);
                String y1 = String.valueOf(puntoy1.getText());
                double Y1 = Double.parseDouble(y1);
                String x2 = String.valueOf(puntox2.getText());
                double X2 = Double.parseDouble(x2);
                String y2 = String.valueOf(puntoy2.getText());
                double Y2 = Double.parseDouble(y2);
                if (x1.isEmpty() || y1.isEmpty() || x2.isEmpty() || y2.isEmpty()) {
                    Toast.makeText(ejercicio8.this, "Algún campo está vacío", Toast.LENGTH_LONG).show();
                    // JOptionPane.showMessageDialog(null,"Algún campo está vacío");
                } else {
                    try {
                        double dif1 = Math.pow((X2 - X1), 2);
                        double dif2 = Math.pow((Y2 - Y1), 2);
                        double cifra = dif1 + dif2;
                        double distan = (Math.sqrt(cifra));
                        String Cifra = String.valueOf(distan);
                        distancia.setText(Cifra);
                    } catch (NumberFormatException exception) {
                        Toast.makeText(ejercicio8.this, "Algún dato es incorrecto y se ejecuta una excepción de tipo NumberFormatcException ", Toast.LENGTH_LONG).show();
                    } finally {
                        Toast.makeText(ejercicio8.this, "Terminado", Toast.LENGTH_LONG).show();
                    }
                }
            }

        });

        sigu = (Button) findViewById(R.id.sig);
        sigu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(ejercicio8.this, ejercicio9.class);
                startActivity(siguiente);

            }
        });


    }

}
