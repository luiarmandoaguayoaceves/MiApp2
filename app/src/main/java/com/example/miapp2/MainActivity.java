package com.example.miapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Creacion de variables locales
    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Almacenar los valores desde la vista a la porte logica por id
        et1 = (EditText)findViewById(R.id.txt_num1);
        et2 = (EditText)findViewById(R.id.txt_num2);
        et3 = (EditText) findViewById(R.id.txt_num3);
        tv1 = (TextView) findViewById(R.id.txt_status);
    }

    //Metodo de promedio
    public void promedio(View view){
        //Se toma el valor y se almacena en las variables valor
    String valor1 = et1.getText().toString();
    String valor2 = et2.getText().toString();
    String valor3 = et3.getText().toString();

    //se cambian de texto a tipo numerico
    int num1 = Integer.parseInt(valor1);
    int num2 = Integer.parseInt(valor2);
    int num3 = Integer.parseInt(valor3);

    //Se realiza la operacion a usar
    int promedio = (num1+num2+num3)/3;

    //Se convierte en tipo texto el resultado en otra variable
    String evalu = String.valueOf(promedio);

    //Se ponen condiciones en caso de aprobar o no
    if (promedio >= 6){
        //se modifica el atributo texto si cumple la condicion
        tv1.setText("Estatus aprovado con "+evalu);
    }else if (promedio <=5){
        //se modifica el atributo texto si cumple la condicion
        tv1.setText("Estatus reprovado con "+evalu);
    }

    }
}