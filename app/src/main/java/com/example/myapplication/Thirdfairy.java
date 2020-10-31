package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class Thirdfairy extends AppCompatActivity {
    private TextView textView;
    private TextView textView1;//高数
    private TextView textView2;//计导
    private TextView textView3;//大英
    private TextView textView4;//近纲
    private TextView textView5;
    private TextView wendin;
    private TextView zongpin;
    private TextView jingang;
    private TextView daying;
    private TextView jidao;
    private TextView gaoshu;
    private TextView zp;
    private Button button;
    private Button buttonqj;
    private Button buttonht;
    Intent jy,qj,ht;
    private Object Button;
    private Date d5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdfairy);
        textView1=(TextView)findViewById(R.id.a);
        textView2=(TextView)findViewById(R.id.ji);
        textView3=(TextView)findViewById(R.id.dy);
        textView4=(TextView)findViewById(R.id.jg);
        textView5=(TextView)findViewById(R.id.sz);
        wendin=(TextView)findViewById(R.id.wdx);
        zp=(TextView)findViewById(R.id.l);
        wendin.setText("稳定性");
        zongpin=(TextView)findViewById(R.id.zhcp);
        zongpin.setText("综合测评");
        jingang=(TextView)findViewById(R.id.d);

        daying=(TextView)findViewById(R.id.c);

        jidao=(TextView)findViewById(R.id.b);

        gaoshu=(TextView)findViewById(R.id.gao);

        textView=(TextView)findViewById(R.id.zm);
        Intent intent = getIntent();
        Bundle bundle=intent.getExtras();
        String mc1= intent.getStringExtra("mc1");
        assert mc1 != null;
        Log.d("Thirdfairy",mc1);
        jingang.setText(mc1);
        String mc2= intent.getStringExtra("mc2");
        assert mc2 != null;
        Log.d("Thirdfairy",mc2);
        daying.setText(mc2);
        String mc3= intent.getStringExtra("mc3");
        assert mc3 != null;
        Log.d("Thirdfairy",mc3);
        jidao.setText(mc3);
        String mc4= intent.getStringExtra("mc4");
        assert mc4 != null;
        Log.d("Thirdfairy",mc4);
        gaoshu.setText(mc4);
        final String date1=intent.getStringExtra("math");
        assert date1 != null;
        Log.d("Thirdfairy",date1);
        textView1.setText(String.valueOf("成绩  "+date1));
        final String date2=intent.getStringExtra("comp");
        assert date2 != null;
        Log.d("Thirdfairy",(date2));
        textView2.setText(String.valueOf("成绩  "+date2));
        final String date3=intent.getStringExtra("engl");
        assert date3 != null;
        Log.d("Thirdfairy",(date3));
        textView3.setText(String.valueOf("成绩  "+date3));
        final String date4=intent.getStringExtra("jing");
        assert date4 != null;
        Log.d("Thirdfairy",date4);
        textView4.setText(String.valueOf("成绩  "+date4));
        assert bundle != null;
        //final int d1=bundle.getInt(date1);
     // final int d2=bundle.getInt(date2);
    //  final int d3=bundle.getInt(date3);
      // final int d4=bundle.getInt(date4);
        //final double date5=(d1+d2+d3+d4)/4;
        String d1=date1;
        String d2=date2;
        String d3=date3;
        String d4=date4;
        double math=0;
        double comp=0;
        double engl=0;
        double jing=0;
        double date5=0;
        math=Integer.parseInt(d1);
        comp=Integer.parseInt(d2);
        engl=Integer.parseInt(d3);
        jing=Integer.parseInt(d4);
        date5=(math+comp+engl+jing)/4;
        if (date5>90)
        {
            textView.setText("A");
        }
        else if (date5>70)
        {
            textView.setText("B");
        }
        else if (date5>60)
        {
            textView.setText("C");
        }
        else
        {
            textView.setText("D");
        }
        final double vari=(math-date5)*(math-date5)+(comp-date5)*(comp-date5)+(engl-date5)*(engl-date5)+(jing-date5)*(jing-date5);
        if (vari<100)
        {
            zp.setText("良好");
        }
        else if (vari<300)
        {
            zp.setText("尚可");
        }
        else
        {
            zp.setText("过山车?");
        }
        //@SuppressLint("DefaultLocale") String ave= String.format("%.1f",date5);
        //textView5.setText(String.valueOf(ave));
        textView5.setText(String.valueOf(date5));
        button=(Button) findViewById(R.id.jy);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String math=date1;
               String comp=date2;
               String engl=date3;
               String jing=date4;

                Intent intent=new Intent(Thirdfairy.this,Forthfairy.class);
                intent.putExtra("math",date1);
                intent.putExtra("comp",date2);
                intent.putExtra("engl",date3);
                intent.putExtra("jing",date4);
                startActivity(intent);
                finish();
            }
        });

       buttonht=(Button)findViewById(R.id.ht);
        buttonht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent3=new Intent(Thirdfairy.this,Secondfairy.class);
                startActivity(intent3);
                finish();
            }
     });

                }
            }
