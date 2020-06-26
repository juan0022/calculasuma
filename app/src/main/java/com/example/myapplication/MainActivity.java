package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText n1;
    private EditText n2;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1=(EditText) findViewById(R.id.Numero1);
        n2=(EditText) findViewById(R.id.Number2);
        res=(TextView) findViewById(R.id.Respuesta);
    }
    public void Sumar(View view){
        String valor1=n1.getText().toString();
        String valor2=n2.getText().toString();

        int numero1=Integer.parseInt(valor1);
        int numero2=Integer.parseInt(valor2);

        int  suma= numero1 + numero2;
        String resultado=String.valueOf(suma);

        res.setText(resultado);
    }
}