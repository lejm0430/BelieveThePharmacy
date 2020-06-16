package com.example.gamerecommendapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class tylenol extends AppCompatActivity{
    protected void onCreate(@Nullable Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.tylenol);

        TextView tv = (TextView)findViewById(R.id.textView8);
        TextView tv1 = (TextView)findViewById(R.id.textView9);
        TextView tv2 = (TextView)findViewById(R.id.textView10);
        Button btn = (Button)findViewById(R.id.nextbtnt);

        Intent intent = getIntent();

        String result = intent.getExtras().getString("result");
        tv.setText(result);

        String result1 = intent.getExtras().getString("result1");
        tv1.setText("나의 증상은 : " + result1);

        String result2 = intent.getExtras().getString("result2");
        if(result2 != null) {
            tv2.setText("1) Hypersensitivity to this drug\n2) patients with peptic ulcer\n" +
                    "3) Patients with severe liver disorder\n4) Patients with severe kidney (kidney) disorder\n" +
                    "5) Patients with severe cardiac dysfunction\n" +
                    "6) One patient who gets the following solutions: Barbital measures, tricyclic antidepressants\n" +
                    "7) People who ate alcohol");
            btn.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent = new Intent(getApplicationContext(), map.class);
                    intent.putExtra("where1","");
                    startActivity(intent);
                }
            });
        }

        //////////////////////////////영어
        String result3 = intent.getExtras().getString("result3");
        if(result3 != null) {
            tv2.setText("1）对此药物过敏的人\n" +
                    "2）消化性溃疡患者\n" +
                    "3）严重肝衰竭患者\n" +
                    "4）严重肾脏（肾脏）疾病患者\n" +
                    "5）严重心功能不全的患者\n" +
                    "6）服用以下药物的患者：巴比妥药物，三环类抗抑郁药\n" +
                    "7）饮酒的人");
            btn.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent = new Intent(getApplicationContext(), map.class);
                    intent.putExtra("where2","");
                    startActivity(intent);
                }
            });
        }
        //////////////////////////////중국어
        String result4 = intent.getExtras().getString("result4");
        if(result4 != null) {
            tv2.setText(
                    "1）本剤過敏症の患者\n" +
                            "2）消化性潰瘍の患者\n" +
                            "3）重度の肝障害の患者\n" +
                            "4）重度の腎臓（腎）障害の患者\n" +
                            "5）重度の心機能低下患者\n" +
                            "6）次の薬を服用した患者バール坂系薬物、三環系抗うつ薬\n" +
                            "7）アルコールを服用した人");
            btn.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent = new Intent(getApplicationContext(), map.class);
                    intent.putExtra("where3","");
                    startActivity(intent);
                }
            });
        }
        //////////////////////////////일본어

    }
}
//두통 치통