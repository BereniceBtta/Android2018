package com.example.a1056374147.ejercicios.app;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class ejercicio2_Examen extends AppCompatActivity {
   EditText a1,b1,c1;
   TextView sol,doblesol,utilsolu;
   Button solucion,vaciar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2__examen);

        a1=(EditText)findViewById(R.id.consA);
        b1=(EditText)findViewById(R.id.consB);
        c1=(EditText)findViewById(R.id.consC);
        sol=(TextView)findViewById(R.id.sol1);
        doblesol=(TextView)findViewById(R.id.sol2);
        utilsolu=(TextView)findViewById(R.id.solUtil);

        solucion = (Button) findViewById(R.id.aceptar);
        solucion.setOnClickListener(new View.OnClickListener() {
            @Override//revisar
            public void onClick(View v) {
                double a=Double.parseDouble(String.valueOf(a1.getText()));
                double b=Double.parseDouble(String.valueOf(b1.getText()));
                double c=Double.parseDouble(String.valueOf(c1.getText()));
                double R=0;


                    R=(b*b)-4*a*c;
                    if(R<0) {
                        sol.setText("Vacío");
                        utilsolu.setText("No tiene solución");
                        doblesol.setText("Vacío");
                    }else if(R==0){
                        double x=(-b/(2*a));
                        sol.setText("-b/(2*a)= "+x);
                        utilsolu.setText("Tiene 1 solución");
                        doblesol.setText("Vacío");
                    } else if(R>0){
                        double x1=(-b+Math.pow(R,0.5))/(2*a);
                        double x2=(-b-Math.pow(R,0.5))/(2*a);
                        sol.setText("(-b+R^1/2)/(2a)= "+x1);
                        doblesol.setText("(-b-R^1/2)/(2a)= "+x2);
                        utilsolu.setText("Tiene 2 soluciones");
                    }


            }
        });

        vaciar = (Button) findViewById(R.id.vac);
        vaciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a1.setText("");
                b1.setText("");
                c1.setText("");
                sol.setText("");
                utilsolu.setText("");
                doblesol.setText("");

            }});


    }


}
