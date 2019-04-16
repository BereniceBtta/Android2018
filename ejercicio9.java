package com.example.a1056374147.ejercicios.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class ejercicio9 extends AppCompatActivity {

    private CheckBox bacon;
    private RadioButton pequeña;
    private CheckBox anchoas;
    private RadioButton mediana;
    private CheckBox cebolla;
    private RadioButton familiar;
    private CheckBox pimiento;
    private TextView resultado;
    Button sigu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio9);

        bacon = (CheckBox) findViewById(R.id.bacon);
        anchoas = (CheckBox) findViewById(R.id.anchoas);
        cebolla = (CheckBox) findViewById(R.id.cebolla);
        pimiento = (CheckBox) findViewById(R.id.pimiento);
        pequeña = (RadioButton) findViewById(R.id.pequeña);
        mediana = (RadioButton) findViewById(R.id.mediana);
        familiar = (RadioButton) findViewById(R.id.familiar);
        resultado = (TextView) findViewById(R.id.resultado);

        sigu = (Button) findViewById(R.id.sig);
        sigu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(ejercicio9.this, ejercicio10.class);
                startActivity(siguiente);
            }});

                Button total = (Button) findViewById(R.id.total);
                total.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        double precioingrediente = 0;
                        double Total = 0;
                        double preciobacon = 1.5;
                        double precioanchoas = 1.8;
                        double preciocebolla = 1.0;
                        double preciopimiento = 1.2;

                        if (bacon.isChecked() && anchoas.isChecked()) {
                            precioingrediente = preciobacon + precioanchoas;
                        }
                        if (bacon.isChecked() && cebolla.isChecked()) {
                            precioingrediente = preciobacon + preciocebolla;
                        }
                        if (bacon.isChecked() && pimiento.isChecked()) {
                            precioingrediente = preciobacon + preciopimiento;
                        }
                        if (anchoas.isChecked() && cebolla.isChecked()) {
                            precioingrediente = precioanchoas + preciocebolla;
                        }
                        if (anchoas.isChecked() && pimiento.isChecked()) {
                            precioingrediente = precioanchoas + preciopimiento;
                        }
                        if (cebolla.isChecked() && pimiento.isChecked()) {
                            precioingrediente = preciocebolla + preciopimiento;
                        }
                        Total = precioTamaño(precioingrediente);
                        String total = Double.toString(Total);
                        resultado.setText(total);
                    }
                });

    }

    private double precioTamaño(double precioingrediente) {

        double preciopizza = 0;
        double preciopequeña = 7;
        double preciomediana = 9;
        double preciofamiliar = 11;

        if (pequeña.isChecked()) {
            preciopizza = preciopequeña + precioingrediente;
        } else if (mediana.isChecked()) {
            preciopizza = preciomediana + precioingrediente;
        } else if (familiar.isChecked()) {
            preciopizza = preciofamiliar + precioingrediente;
        }
        return preciopizza;
    }

}
