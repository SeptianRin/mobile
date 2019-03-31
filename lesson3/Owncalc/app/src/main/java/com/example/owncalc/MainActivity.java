package com.example.owncalc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.owncalc.models.Calc;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
// bind id ke widget masing masing

    @Bind(R.id.angka)
    TextView angka;
    @Bind(R.id.a0)
    Button a0;
    @Bind(R.id.a1)
    Button a1;
    @Bind(R.id.a2)
    Button a2;
    @Bind(R.id.a3)
    Button a3;
    @Bind(R.id.a4)
    Button a4;
    @Bind(R.id.a5)
    Button a5;
    @Bind(R.id.a6)
    Button a6;
    @Bind(R.id.a7)
    Button a7;
    @Bind(R.id.a8)
    Button a8;
    @Bind(R.id.a9)
    Button a9;
    @Bind(R.id.divisor)
    Button divisor;
    @Bind(R.id.mult)
    Button mult;
    @Bind(R.id.tambahi)
    Button tambahi;
    @Bind(R.id.kurangi)
    Button kurangi;
    @Bind(R.id.reset)
    Button reset;
    @Bind(R.id.samadengan)
    Button samadengan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        final Calc myCalc = new Calc();

        a0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myCalc.getOperator() == "null") {
                    myCalc.setA(0);
                } else {
                    myCalc.setB(0);
                }
            }
        });

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myCalc.getOperator() == "null") {
                    myCalc.setA(1);
                } else {
                    myCalc.setB(1);
                }
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myCalc.getOperator() == "null") {
                    myCalc.setA(2);
                } else {
                    myCalc.setB(2);
                }
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myCalc.getOperator() == "null") {
                    myCalc.setA(3);
                } else {
                    myCalc.setB(3);
                }
            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myCalc.getOperator() == "null") {
                    myCalc.setA(4);
                } else {
                    myCalc.setB(4);
                }
            }
        });
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myCalc.getOperator() == "null") {
                    myCalc.setA(5);
                } else {
                    myCalc.setB(5);
                }
            }
        });
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myCalc.getOperator() == "null") {
                    myCalc.setA(6);
                } else {
                    myCalc.setB(6);
                }
            }
        });
        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myCalc.getOperator() == "null") {
                    myCalc.setA(7);
                } else {
                    myCalc.setB(7);
                }
            }
        });
        a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myCalc.getOperator() == "null") {
                    myCalc.setA(8);
                } else {
                    myCalc.setB(8);
                }
            }
        });
        a9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myCalc.getOperator() == "null") {
                    myCalc.setA(9);
                } else {
                    myCalc.setB(9);
                }
            }
        });

        tambahi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCalc.setOperator("+");
            }
        });
        kurangi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCalc.setOperator("-");
            }
        });
        divisor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCalc.setOperator("/");
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCalc.setOperator("*");
            }
        });

        samadengan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myCalc.getOperator().equals("+")) {
                    angka.setText(String.valueOf(myCalc.penjumlahan(myCalc.getA(), myCalc.getB())));
                    myCalc.setOperator("null");
                    myCalc.setA(myCalc.penjumlahan(myCalc.getA(), myCalc.getB()));
                }
                if (myCalc.getOperator().equals("-")) {
                    angka.setText(String.valueOf(myCalc.pengurangan(myCalc.getA(), myCalc.getB())));
                    myCalc.setOperator("null");
                    myCalc.setA(myCalc.pengurangan(myCalc.getA(), myCalc.getB()));
                }
                if (myCalc.getOperator().equals("*")) {
                    angka.setText(String.valueOf(myCalc.perkalian(myCalc.getA(), myCalc.getB())));
                    myCalc.setOperator("null");
                    myCalc.setA(myCalc.perkalian(myCalc.getA(), myCalc.getB()));
                }
                if (myCalc.getOperator().equals("/")) {
                    angka.setText(String.valueOf(myCalc.pembagian(myCalc.getA(), myCalc.getB())));
                    myCalc.setOperator("null");
                    myCalc.setA(myCalc.pembagian(myCalc.getA(), myCalc.getB()));
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka.setText("0");
                myCalc.setOperator("null");
                myCalc.setA(0);
                myCalc.setB(0);
            }
        });

    }
}
