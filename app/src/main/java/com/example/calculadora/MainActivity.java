package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.app.*;


public class MainActivity extends AppCompatActivity {
    //---- Aqui se coloca o id dos itens ----
    EditText txtVal1, txtVal2;
    Button btnSoma, btnSub, btnDiv, btnMult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //------------------atribuindo as variaveis----------------
        txtVal1 = (EditText) findViewById(R.id.txtVal1);
        txtVal2 = (EditText) findViewById(R.id.txtVal2);
        btnSoma = (Button) findViewById(R.id.btnSoma);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnMult = (Button) findViewById(R.id.btnMult);

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble (txtVal1.getText().toString());
                double num2 = Double.parseDouble (txtVal2.getText().toString());
                double soma = num1 + num2;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado da soma");
                dialogo.setMessage("A soma é " +soma);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(txtVal1.getText().toString());
                double num2 = Double.parseDouble(txtVal2.getText().toString());
                double subracao = num1 - num2;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado da subtração");
                dialogo.setMessage("A subtração é " +subracao);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(txtVal1.getText().toString());
                double num2 = Double.parseDouble(txtVal2.getText().toString());
                double divisao = num1 / num2;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado da divisão");
                dialogo.setMessage("A divisão é " +divisao);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(txtVal1.getText().toString());
                double num2 = Double.parseDouble(txtVal2.getText().toString());
                double multiplicacao = num1 * num2;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado da Multiplicação");
                dialogo.setMessage("A multiplicação é " +multiplicacao);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });



    }
}
