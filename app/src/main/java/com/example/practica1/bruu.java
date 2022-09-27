package com.example.practica1;

import android.view.View;
import android.widget.TextView;

public class bruu implements View.OnClickListener{
    int cont1;
    int contg;
    TextView salida;
    TextView salida2;
    public bruu(TextView s,int contador, int contadorG){
        cont1 = contador;
        salida = s;
        contg=contadorG;
    }
    @Override
    public void onClick(View view) {
        cont1++;
        contg++;
        salida.setText(String.valueOf(cont1));
        salida2.setText(String.valueOf(contg));
    }
}
