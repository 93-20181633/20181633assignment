package com.example.a20181633assignment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static android.widget.Toast.*;

public class usermadeActivity extends MainActivity  {

    static int count=0;
    int test=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.usermade);


        final EditText IDcheck = (EditText) findViewById(R.id.textView7);
        final EditText passcheck = (EditText) findViewById(R.id.textView9);
        final EditText homecheck = (EditText) findViewById(R.id.textView9);
        final EditText namecheck = (EditText) findViewById(R.id.textView15);
        final EditText phonecheck = (EditText) findViewById(R.id.textView13);


        Button checkpass= (Button) findViewById(R.id.button5);
        Button checkID=(Button) findViewById(R.id.button4);
        final Button gotologin= (Button) findViewById(R.id.button6);

        gotologin.setEnabled(false);
        RadioGroup rg = (RadioGroup) findViewById(R.id.radio1);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radio1){
                    gotologin.setEnabled(true);
                }
                else{
                    gotologin.setEnabled(true);
                }
            }
        });
        gotologin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(test>0){

                    if (homecheck.getText().toString().length()==0||namecheck.getText().toString().length()==0||phonecheck.getText().toString().length()==0){
                        Toast toast = makeText(getApplicationContext(), "이름,주소,번호 모두 작성해주세요!", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                    else{
                I[count]=IDcheck.getText().toString();
                P[count]=passcheck.getText().toString();
                Home[count]=homecheck.getText().toString();
                Name[count]=namecheck.getText().toString();
                Phone[count]=phonecheck.getText().toString();
                count++;
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                        Toast toast = makeText(getApplicationContext(), "회원가입 완료!", Toast.LENGTH_SHORT);
                        toast.show();}
            }
                };
        });


        checkpass.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (passcheck.getText().toString().length() < 4) {
                    Toast toast = makeText(getApplicationContext(), "비밀번호의 길이는 4자이상", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    Toast toast = makeText(getApplicationContext(), "비밀번호가 안전합니다", Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });
        checkID.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                for (int i = 0; i < 1000;i++){
                    if (IDcheck.getText().toString().equals(I[i])==true) {
                        Toast toast = makeText(getApplicationContext(), "중복되는 아이디가 있습니다", Toast.LENGTH_SHORT);
                        toast.show();
                        break;
                    } else {
                        Toast toast = makeText(getApplicationContext(), "사용할 수 있는 아이디입니다", Toast.LENGTH_SHORT);
                        toast.show();
                        test++;
                        break;
                    }
            }
            }
        });

    }
}


