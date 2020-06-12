package com.example.gamerecommendapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class strepsils extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.strepsils);

        TextView tv = (TextView)findViewById(R.id.tvs1);
        TextView tv1 = (TextView)findViewById(R.id.tvs2);
        TextView tv2 = (TextView)findViewById(R.id.tvs3);
        Button btn = (Button)findViewById(R.id.nextbtns);

        Intent intent = getIntent();
        String result = intent.getExtras().getString("result");
        tv.setText(result);

        String result1 = intent.getExtras().getString("result1");
        tv1.setText("나의 증상은 : " + result1);

        String result2 = intent.getExtras().getString("result2");
        tv2.setText(
                "1) Patients with hypersensitivity to this drug, aspirin, other nonsteroidal anti-inflammatory drugs, or components of this drug\n" +
                "2) Patients with severe heart failure\n" +
                "3) Patients with serious blood abnormalities, patients with no obvious hematopoietic disorder\n" +
                "4) Patients with severe liver failure and kidney failure\n" +
                "5) 3 months after pregnancy");

        String result3 = intent.getExtras().getString("result3");
        tv2.setText("1）对这种药物，阿司匹林，其他非甾体类抗炎药或该药物成分过敏的患者\n" +
                "2）严重心力衰竭患者\n" +
                "3）血液异常严重的患者，无明显造血障碍的患者\n" +
                "4）严重肝功能衰竭和肾功能衰竭的患者\n" +
                "5）怀孕后3个月");

        String result4 = intent.getExtras().getString("result4");
        tv2.setText("1）この薬、アスピリン、他の非ステロイド性抗炎症またはこの薬剤の成分に過敏症のある患者\n" +
                "2）心不全が激しい患者\n" +
                "3）深刻な血液異常のある患者は、造血障害明らかでない患者\n" +
                "4）重度の肝不全と腎不全患者\n" +
                "5）妊婦、妊娠3ヶ月後");

        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), map.class);
                startActivity(intent);
            }
        });
    }
}
//목아픔