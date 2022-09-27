package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Global;
    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;
    Button reset;
    Button reset2;
    Button reset3;
    Button reset4;
    Button reset5;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    int sumatorio;
    int sumatorio2;
    int sumatorio3;
    int sumatorio4;
    int sumatorio5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Global = findViewById(R.id.Global);
        text1 = findViewById(R.id.textView);
        text2 = findViewById(R.id.textView2);
        text3 = findViewById(R.id.textView3);
        text4 = findViewById(R.id.textView4);
        reset = findViewById(R.id.reset);
        reset2 = findViewById(R.id.reset2);
        reset3 = findViewById(R.id.reset3);
        reset4 = findViewById(R.id.reset4);
        reset5 = findViewById(R.id.reset5);
        b1 = findViewById(R.id.button2);
        b2 = findViewById(R.id.button3);
        b3 = findViewById(R.id.button4);
        b4 = findViewById(R.id.button5);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               sumatorio2++;
               sumatorio++;
               text1.setText(Integer.toString(sumatorio2));
               Global.setText(Integer.toString(sumatorio));
            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumatorio3++;
                sumatorio++;
                text2.setText(Integer.toString(sumatorio3));
                Global.setText(Integer.toString(sumatorio));
            }

        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumatorio4++;
                sumatorio++;
                text3.setText(Integer.toString(sumatorio4));
                Global.setText(Integer.toString(sumatorio));
            }

        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumatorio5++;
                sumatorio++;
                text4.setText(Integer.toString(sumatorio5));
                Global.setText(Integer.toString(sumatorio));
            }

        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumatorio = 0;
                sumatorio2 = 0;
                sumatorio3 = 0;
                sumatorio4 = 0;
                sumatorio5 = 0;
                text1.setText(Integer.toString(sumatorio2));
                text2.setText(Integer.toString(sumatorio3));
                text3.setText(Integer.toString(sumatorio4));
                text4.setText(Integer.toString(sumatorio5));
                Global.setText(Integer.toString(sumatorio));
            }

        });
        reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumatorio = sumatorio - sumatorio2;
                sumatorio2 = 0;
                text1.setText(Integer.toString(sumatorio2));
                Global.setText(Integer.toString(sumatorio));
            }
        });
        reset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumatorio = sumatorio  - sumatorio3;
                sumatorio3 = 0;
                text2.setText(Integer.toString(sumatorio3));
                Global.setText(Integer.toString(sumatorio));
            }
        });
        reset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumatorio = sumatorio - sumatorio4;
                sumatorio4 = 0;
                text3.setText(Integer.toString(sumatorio4));
                Global.setText(Integer.toString(sumatorio));
            }
        });
        reset5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumatorio = sumatorio - sumatorio5;
                sumatorio5 = 0;
                text4.setText(Integer.toString(sumatorio5));
                Global.setText(Integer.toString(sumatorio));
            }
        });


    }
}