package com.example.sampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 EditText ed1,ed2;
 Button b1,b2,b3,b4,b5,b6;
 TextView t;
 int a=0,b=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText) findViewById(R.id.editText4);
        ed2 = (EditText) findViewById(R.id.editText3);
        b1 = (Button) findViewById(R.id.button7);
        b2 = (Button) findViewById(R.id.button8);
        b3 = (Button) findViewById(R.id.button9);
        b4 = (Button) findViewById(R.id.button10);
        b5 = (Button) findViewById(R.id.button11);
        b6 = (Button) findViewById(R.id.button12);
        t = (TextView) findViewById(R.id.textView5);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setText(" ");
                ed1.setText(" ");
                ed2.setText(" ");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fun();
                int c = a+b;
                t.setText("Addition is "+c);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fun();
                int c = a-b;
                t.setText("subtraction is " +c);

            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fun();
                int c = a*b;
                t.setText("Multioplication is "+c);

            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fun();
                int c = (a%b);
                t.setText("Mod is "+c);

            }
        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fun();
                int c = a/b;
                t.setText("Division is"+c);

            }
        });

    }

    private void fun() {


        String s1, s2;
        s1 = ed1.getText().toString();
        s2 = ed2.getText().toString();

        if(TextUtils.isEmpty(s1)||TextUtils.isEmpty(s2))
        {
            ed1.setError("Please give input");
        }else {
            a  = Integer.parseInt(s1);
            b  = Integer.parseInt(s2);
        }

    }
}
