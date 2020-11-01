package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Forthfairy extends AppCompatActivity {
    private Button btback;
    private Button btbaocun;
    private TextView textView;
    Intent back,baocun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forthfairy);
        final Intent intent=getIntent();
        String date1= intent.getStringExtra("math");
        Log.d("Forthfairy",date1);
        String date2= intent.getStringExtra("comp");
        Log.d("Forthfairy",date2);
        String date3= intent.getStringExtra("engl");
        Log.d("Forthfairy",date3);
        String date4= intent.getStringExtra("jing");
        Log.d("Forthfairy",date4);
        String d1=date1;
        String d2=date2;
        String d3=date3;
        String d4=date4;
        double math=0;
        double comp=0;
        double engl=0;
        double jing=0;
        double aver=0;
        double fang=0;
        math=Integer.parseInt(d1);
        comp=Integer.parseInt(d2);
        engl=Integer.parseInt(d3);
        jing=Integer.parseInt(d4);
        aver=(math+comp+engl+jing)/4;
        fang=(math-aver)*(math-aver)+(comp-aver)*(comp-aver)+(engl-aver)*(engl-aver)+(jing-aver)*(jing-aver);
        textView=(TextView)findViewById(R.id.zuihou);
        if (aver>=80&&fang<=200)
        {
            textView.setText("成绩稳定，优秀人上人");
        }
        else if (aver>=80&&fang>200&&fang<1000)
        {
            textView.setText("总成绩很棒但要注意可能存在的偏科现象");
        }
        else if (aver>=80&&fang>=1000)
        {
            textView.setText("偏科严重奥，是不是看某位老师不顺眼？");
        }
        else if (aver>=60&&fang<=200)
        {
            textView.setText("成绩很稳定，但仍需继续努力，加油读书人");
        }
        else if (aver>=60&&fang>200&&fang<1000)
        {
            textView.setText("某些科目可能要挂奥，继续加油吧");
        }
        else if (aver>=60&&fang>=1000)
        {
            textView.setText("注意扬长补短奥，不及格的科目要认真奥");
        }
        else if (aver<60)
        {
            textView.setText("emmm还有很大发展空间....加油吧！");
        }
        btback=(Button)findViewById(R.id.blue);
        btback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Forthfairy.this,Thirdfairy.class);
                startActivity(intent);
                finish();
            }
        });
        btbaocun=(Button)findViewById(R.id.baocun);
        btbaocun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Forthfairy.this, Fairyfirst.class);
                startActivity(intent2);
                finish();
            }
        });

    }

}