package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import static android.text.TextUtils.isEmpty;

public class Secondfairy extends AppCompatActivity {

    public Button button;
    public EditText editText;
    private Toast toast;
    private EditText km1;
    private EditText km2;
    private EditText km3;
    private EditText km4;
    private EditText first; //高数
    private EditText second; //计算机导论
    private EditText third;//大英
    private EditText forth;//近纲
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondfairy);
        first = this.findViewById(R.id.first);
        second = this.findViewById(R.id.second);
        third = this.findViewById(R.id.third);
        forth = this.findViewById(R.id.forth);
        km1=this.findViewById(R.id.km1);
        km2=this.findViewById(R.id.km2);
        km3=this.findViewById(R.id.km3);
        km4=this.findViewById(R.id.km4);
        button = (Button) findViewById(R.id.ceshi);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String date1 = first.getText().toString();
                String date2 = second.getText().toString();
                String date3 = third.getText().toString();
                String date4 = forth.getText().toString();
                String mc1 = km1.getText().toString();
                String mc2 = km2.getText().toString();
                String mc3 = km3.getText().toString();
                String mc4 = km4.getText().toString();
                if((TextUtils.isEmpty(date1))||(TextUtils.isEmpty(date2))||(TextUtils.isEmpty(date3))||(TextUtils.isEmpty(date4))){
                    Toast.makeText(Secondfairy.this,"数据不能为空",Toast.LENGTH_LONG).show();}
                
             else   if (Integer.parseInt(date1)>100||Integer.parseInt(date2)>100||Integer.parseInt(date3)>100||Integer.parseInt(date4)>100) {
                  Toast.makeText(Secondfairy.this, "输入数据有误", Toast.LENGTH_SHORT).show();
               }
                //

                else
               {
                   Intent intent = new Intent(Secondfairy.this, Thirdfairy.class);
                   intent.putExtra("math",date1);
                   intent.putExtra("comp",date2);
                   intent.putExtra("engl",date3);
                   intent.putExtra("jing",date4);
                   intent.putExtra("mc1",mc1);
                   intent.putExtra("mc2",mc2);
                   intent.putExtra("mc3",mc3);
                   intent.putExtra("mc4",mc4);
                   startActivity(intent);
                    finish();
               }

            }

        });


    }


    }

