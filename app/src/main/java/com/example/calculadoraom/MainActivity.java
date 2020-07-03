package com.example.calculadoraom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button_sumar;
    private Button button_restar;
    private Button button_dividir;
    private Button button_multiplicar;
    private TextView text_respuesta;
    private EditText edit_numero_uno;
    private EditText edit_numero_dos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_respuesta = findViewById(R.id.Res);
        edit_numero_uno = findViewById(R.id.etvalor1);
        edit_numero_dos = findViewById(R.id.etvalor2);
        button_sumar = findViewById(R.id.button_sumar);
        button_sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( sumar( Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()) )+"");
            }
        });

        button_dividir = findViewById(R.id.button_dividir);
        button_dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( dividir( Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()) )+"");

            }
        });

        button_multiplicar = findViewById(R.id.button_multiplicar);
        button_multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( multiplicar( Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()) )+"");

            }
        });

        button_restar = findViewById(R.id.button_restar);
        button_restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( restar( Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()) )+"");

            }
        });

    }

    public double sumar (int a, int b){
        return a+b;
    }

    public double restar (int a, int b){
        return a-b;
    }

    public double multiplicar (int a, int b){
        return a*b;
    }

    public double dividir (int a, int b){
        int respuesta = 0;

        if (b!=0){
            respuesta=a/b;
        }

        return respuesta;
    }
}