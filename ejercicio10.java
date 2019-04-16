package com.example.a1056374147.ejercicios.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ejercicio10 extends AppCompatActivity {
Spinner combo;
TextView label;
EditText inicio,finnal,intervalo;
Button rellenar,vaciar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio10);
         combo = (Spinner) findViewById(R.id.combo);
        label= (TextView)findViewById(R.id.res);
        inicio= (EditText)findViewById(R.id.ini);
        finnal=(EditText)findViewById(R.id.fin);
        intervalo=(EditText)findViewById(R.id.inter);
        rellenar=(Button)findViewById(R.id.btn1);
        vaciar=(Button)findViewById(R.id.btn2);

        String[] letra = {"A","B","C","D","E"};
        combo.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, letra));
        combo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id)
            {
                //Toast.makeText(adapterView.getContext(),
                        //(String) adapterView.getItemAtPosition(pos), Toast.LENGTH_SHORT).show();
                label.setText(""+adapterView.getItemAtPosition(pos));//si sirve

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {    }
        });

        vaciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //no funciona
                combo.removeAllViews();
                inicio.setText("");
                finnal.setText("");
                intervalo.setText("");
                label.setText("");
            }
        });

        rellenar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ini=Integer.parseInt(String.valueOf(inicio.getText()));
                int fin=Integer.parseInt(String.valueOf(finnal.getText()));
                int interval=Integer.parseInt(String.valueOf(intervalo.getText()));
                try{
                    if(fin <= ini){
                        Toast.makeText(ejercicio10.this, "El valor final no puede ser menor", Toast.LENGTH_SHORT).show();
                        //JOptionPane.showMessageDialog(null, "El valor final no puede ser menor");
                    }else{
                        for (int i=ini;i <= fin;){
                           String posicion= String.valueOf(i);
                            //combo.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, posicion));
                            //combo.addItem(""+i);
                            i+=interval;
                        }
                    }
                    label.setText("");
                }catch(NumberFormatException nfe){
                    Toast.makeText(ejercicio10.this, "Sólo números", Toast.LENGTH_SHORT).show();
                    //JOptionPane.showMessageDialog(null, "Sólo números");
                }
            }
        });


    }
}
