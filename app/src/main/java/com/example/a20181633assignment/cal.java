package com.example.a20181633assignment;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class cal extends AppCompatActivity {

    Double var1, var2;
    boolean _plus, _minus, _multi, _div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        init();
    }

    private void init() {
        Button ac = findViewById(R.id.ac);
        Button div = findViewById(R.id.div);
        Button num7 = findViewById(R.id.num7);
        Button num8 = findViewById(R.id.num8);
        Button num9 = findViewById(R.id.num9);
        Button multi = findViewById(R.id.multi);
        Button num4 = findViewById(R.id.num4);
        Button num5 = findViewById(R.id.num5);
        Button num6 = findViewById(R.id.num6);
        Button minus = findViewById(R.id.minus);
        Button num1 = findViewById(R.id.num1);
        Button num2 = findViewById(R.id.num2);
        Button num3 = findViewById(R.id.num3);
        Button plus = findViewById(R.id.plus);
        Button num0 = findViewById(R.id.num0);

        Button equal = findViewById(R.id.equal);

        final TextView result = findViewById(R.id.result);

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(null);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(result.getText() + "");
                _div = true;
                result.setText(null);
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(result.getText() + "");
                _multi = true;
                result.setText(null);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(result.getText() + "");
                _minus = true;
                result.setText(null);
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(result.getText() + "");
                _plus = true;
                result.setText(null);
            }
        });

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "0");
            }
        });
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "1");
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "2");
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "3");
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "4");
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "5");
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "6");
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "7");
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "8");
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "9");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2 = Double.parseDouble(result.getText() + "");
                if (_plus == true) {
                    result.setText(var1 + var2 + "");
                    _plus = false;
                }
                if (_minus == true) {
                    result.setText(var1 - var2 + "");
                    _minus = false;
                }
                if (_multi == true) {
                    result.setText(var1 * var2 + "");
                    _multi = false;
                }
                if (_div == true) {
                    result.setText(var1 / var2 + "");
                    _div = false;
                }
            }
        });
    }
}
