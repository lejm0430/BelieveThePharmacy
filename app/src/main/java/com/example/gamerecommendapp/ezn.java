package com.example.gamerecommendapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ezn extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.ezn);

        TextView tv = (TextView)findViewById(R.id.tve1);
        TextView tv1 = (TextView)findViewById(R.id.tve2);
        TextView tv2 = (TextView)findViewById(R.id.tve3);
        Button btn = (Button)findViewById(R.id.button);

        Intent intent = getIntent();
        String result = intent.getExtras().getString("result");
        tv.setText(result);

        String result1 = intent.getExtras().getString("result1");
        tv1.setText("나의 증상은 : " + result1);

        String result2 = intent.getExtras().getString("result2");
        tv2.setText(
                        "The following people should not take this medicine\n" +
                        "1) Patients with gastrointestinal ulcer, gastrointestinal bleeding or history\n" +
                        "2) Patients with severe heart failure\n" +
                        "3) Patients with severe hypertension\n" +
                        "4) Patients with bronchial asthma or history\n" +
                        "5) Patients with asthma, hives, and allergic reactions to aspirin or other nonsteroidal anti-inflammatory\n" +
                        "6) Pregnant women in the 3 month period at the end of pregnancy");

        String result3 = intent.getExtras().getString("result3");
        tv2.setText("以下人不应该吃这种药\n" +
                "1）消化道溃疡，消化道出血或有病史的患者\n" +
                "2）严重心力衰竭患者\n" +
                "3）重度高血压患者\n" +
                "4）有支气管哮喘或病史的患者\n" +
                "5）患有哮喘，荨麻疹和对阿司匹林或其他非甾体类抗炎药过敏的患者\n" +
                "6）怀孕结束后三个月内的孕妇");

        String result4 = intent.getExtras().getString("result4");
        tv2.setText("次のような人は、この薬を服用しないこと\n" +
                "1）消化管潰瘍、消化管出血患者またはその既往歴のある患者\n" +
                "2）重度の心臓機能不全の患者\n" +
                "3）重度の高血圧の患者\n" +
                "4）気管支喘息又はその既往歴のある患者\n" +
                "5）アスピリンや他の非ステロイド性消炎に対して喘息、じんましん、アレルギー反応がある患者\n" +
                "6）妊娠末期の3ヶ月の期間に該当する妊婦");

        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), map.class);
                startActivity(intent);
            }
        });
    }
}
//생리통 두통