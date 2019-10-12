package com.example.a20181633assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity  {
    static String I[]=new String[1000];
    static String P[]=new String[1000];
    static String Home[]=new String[1000];
    static String Name[]=new String[1000];
    static String Phone[]=new String[1000];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);
        final EditText WHATID = (EditText) findViewById(R.id.editText7);
        final EditText WHATPASS = (EditText) findViewById(R.id.editText3);

        Button usermake= (Button) findViewById(R.id.button2);
        usermake.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                Intent intent = new Intent(getApplicationContext(), usermadeActivity.class);
                startActivity(intent);
            }

        });
        Button gotocal= (Button) findViewById(R.id.button3);
        gotocal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                for(int i=0;i<1000;i++) {
                    if(WHATID.getText().toString().equals(I[i])==true){
                        if(WHATPASS.getText().toString().equals(P[i])==true){
                            Toast toast = makeText(getApplicationContext(), "로그인완료", Toast.LENGTH_SHORT);
                            toast.show();
                            Intent intent = new Intent(getApplicationContext(), cal.class);
                            startActivity(intent);
                            break;
                        }

                    }
                    else {
                        if(i==999){
                        Toast toast = makeText(getApplicationContext(), "아이디 혹은 비밀번호가 틀렸습니다.", Toast.LENGTH_SHORT);
                        toast.show();}
                    }

                    //Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                }
            }

        });

    }

}
