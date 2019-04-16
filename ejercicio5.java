package com.example.a1056374147.ejercicios.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ejercicio5 extends AppCompatActivity {

    private TextView va;
    private TextView ve;
    private TextView vi;
    private TextView vo;
    private TextView vu;
    private EditText frase;
    Button sig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio5);

        frase = (EditText) findViewById(R.id.frase);
        va = (TextView) findViewById(R.id.a);
        ve = (TextView) findViewById(R.id.e);
        vi = (TextView) findViewById(R.id.i);
        vo = (TextView) findViewById(R.id.o);
        vu = (TextView) findViewById(R.id.u);


        Button analizar = (Button) findViewById(R.id.analizar);
        analizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String frases = String.valueOf(frase.getText());
                String frase1 = frases.toLowerCase();
                int a = 0, e = 0, i = 0, o = 0, u = 0;
                if (frases.isEmpty()) {
                    System.out.println("Cadena Vacía");
                } else {
                    for (int q = 0; q < frase1.length(); q++) {
                        if (frase1.charAt(q) == 'a') {
                            a++; //LetraA.setText("A="+a);
                        }
                        if (frase1.charAt(q) == 'e') {
                            e++; //LetraE.setText("E="+e);
                        }
                        if (frase1.charAt(q) == 'i') {
                            i++; //LetraI.setText("I="+i);
                        }
                        if (frase1.charAt(q) == 'o') {
                            o++; //LetraO.setText("O="+o);
                        }
                        if (frase1.charAt(q) == 'u') {
                            u++; //LetraU.setText("U="+u);
                        }
                    }
                }
                va.setText("A=" + a);
                ve.setText("E=" + e);
                vi.setText("I=" + i);
                vo.setText("O=" + o);
                vu.setText("U=" + u);

            }
        });

        Button sig = (Button) findViewById(R.id.sig);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(ejercicio5.this, ejercicio6.class);
                startActivity(siguiente);
            }
        });

    }

}
