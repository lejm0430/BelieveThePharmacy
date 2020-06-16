package com.example.gamerecommendapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class anti extends AppCompatActivity{
    protected void onCreate(@Nullable Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.anti);

        TextView tv = (TextView)findViewById(R.id.tva1);
        TextView tv1 = (TextView)findViewById(R.id.tva2);
        TextView tv2 = (TextView)findViewById(R.id.tva3);
        Button btn = (Button)findViewById(R.id.nextbtna);

        Intent intent = getIntent();
        String result = intent.getExtras().getString("result");
        tv.setText(result);

        String result1 = intent.getExtras().getString("result1");
        tv1.setText("나의 증상은 : " + result1);

        String result2 = intent.getExtras().getString("result2");
        if(result2 != null) {
            tv2.setText("1) Patients who have had allergic symptoms (rash, redness, itching) due to medicine or cosmetics\n" +
                    "2) Patients who are allergic to themselves or their families\n" +
                    "3) Patients with severe wetting or erosion (cloudiness)\n" +
                    "4) Patients being treated by a doctor\n" +
                    "5) Circulatory disorders or diabetics\n" +
                    "6) Children under 12 years old");
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
            tv2.setText("1）因药物或化妆品而出现过敏症状（皮疹，发红，瘙痒）的患者\n" +
                    "2）对自己或家人过敏的患者\n" +
                    "3）严重湿润或糜烂（浑浊）的患者\n" +
                    "4）正在接受医生治疗的患者\n" +
                    "5）循环系统疾病或糖尿病\n" +
                    "6）12岁以下的儿童");
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
                    "1）今までに薬や化粧品などによるアレルギー症状（発疹、発赤、かゆみ）が示されたことがある患者\n" +
                            "2）本人または家族がアレルギー体質の患者\n" +
                            "3）湿潤やびらん（ただれ）が激しい患者\n" +
                            "4）医師の治療を受けている患者\n" +
                            "5）循環器障害や糖尿病患者\n" +
                            "6）12歳以下の小児");
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
//찰과상만