package com.example.gamerecommendapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Buscopan extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.buscopan);

        TextView tv = (TextView)findViewById(R.id.tvb1);
        TextView tv1 = (TextView)findViewById(R.id.tvb2);
        TextView tv2 = (TextView)findViewById(R.id.tvb3);
        Button btn = (Button)findViewById(R.id.nextbtnb);

        Intent intent = getIntent();
        String result = intent.getExtras().getString("result");
        tv.setText(result);

        String result1 = intent.getExtras().getString("result1");
        tv1.setText("나의 증상은 : " + result1);

        String result2 = intent.getExtras().getString("result2");
        if(result2 != null) {
            tv2.setText(
                    "Do not administer to the next patient.\n" +
                            "1) glaucoma patients\n" +
                            "2) Patients with paralytic intestinal obstruction\n" +
                            "3) Patients with myasthenia gravis\n" +
                            "4) patients with giant colon\n" +
                            "5) patients with tachycardia\n" +
                            "6) Patients with severe heart disease\n" +
                            "7) patients with hemorrhagic colitis\n" +
                            "8) Patients with dysuria due to prostatic hypertrophy");
            btn.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent = new Intent(getApplicationContext(), map.class);
                    intent.putExtra("where1","");
                    startActivity(intent);
                }
            });
        }

        String result3 = intent.getExtras().getString("result3");
        if(result3 != null) {
            tv2.setText(
                    "不要对下一位病人用药。\n" +
                            "1）青光眼患者\n" +
                            "2）麻痹性肠梗阻患者\n" +
                            "3）重症肌无力患者\n" +
                            "4）大结肠患者\n" +
                            "5）心动过速患者\n" +
                            "6）严重心脏病患者\n" +
                            "7）出血性结肠炎患者\n" +
                            "8）前列腺肥大引起的排尿困难");
            btn.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent = new Intent(getApplicationContext(), map.class);
                    intent.putExtra("where2","");
                    startActivity(intent);
                }
            });
        }

        String result4 = intent.getExtras().getString("result4");
        if(result4 != null) {
            tv2.setText(
                    "次の患者には投与しないこと。\n" +
                            "1）緑内障の患者\n" +
                            "2）麻痺性イレウスの患者\n" +
                            "3）重症筋無力症の患者\n" +
                            "4）巨大結腸患者\n" +
                            "5）不正頻脈患者\n" +
                            "6）重度の心疾患患者\n" +
                            "7）出血性大腸炎の患者\n" +
                            "8）前立腺肥大による排尿障害の患者");
            btn.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent = new Intent(getApplicationContext(), map.class);
                    intent.putExtra("where3","");
                    startActivity(intent);
                }
            });
        }


    }
}
//복통과 소화불량