package com.example.gamerecommendapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class qsid extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.qsid);

        TextView tv = (TextView)findViewById(R.id.tvq1);
        TextView tv1 = (TextView)findViewById(R.id.tvq2);
        TextView tv2 = (TextView)findViewById(R.id.tvq3);
        Button btn = (Button)findViewById(R.id.nextbtnq);

        Intent intent = getIntent();
        String result = intent.getExtras().getString("result");
        tv.setText(result);

        String result1 = intent.getExtras().getString("result1");
        tv1.setText("나의 증상은 : " + result1);

        String result2 = intent.getExtras().getString("result2");
        if(result2 != null) {
            tv2.setText("Do not administer to the next patient\n" +
                    "1) Patients being treated with the following diseases: blood diseases, kidney, liver disease, stomach and duodenum diseases, immune system diseases such as asthma and rheumatism\n" +
                    "2) Patients with a history of blood abnormalities\n" +
                    "3) Children (less than 15 years old) and the elderly (over 80 years old): Safety for children is not established, and the blood concentration is high due to a decrease in renal function in the elderly, so the drug efficacy may be strongly expressed.\n" +
                    "4) Patients who may be pregnant or pregnant: Ranitidine is delivered during breastfeeding, so do not breastfeed when administered to a nursing mother.");
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
            tv2.setText("不要对下一位病人用药\n" +
                    "1）患有以下疾病的患者：血液疾病，肾脏，肝脏疾病，胃和十二指肠疾病，免疫系统疾病，例如哮喘和风湿病\n" +
                    "2）有血液异常病史的患者\n" +
                    "3）儿童（15岁以下）和老年人（80岁以上）：儿童的安全性尚未建立，并且由于老年人肾功能的下降，血药浓度很高。\n" +
                    "4）可能怀孕或怀孕的患者：雷尼替丁在母乳喂养期间分娩，因此当喂给哺乳母亲时不要母乳喂养。");
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
            tv2.setText("次の患者には投与しないこと\n" +
                    "1）次の疾患で治療を受けている患者：血液疾患、腎臓、肝臓疾患、胃、十二指腸疾患、喘息及びリウマチ等の免疫系疾患\n" +
                    "2）血液以上の兵力がある患者\n" +
                    "3）小児（15歳未満）と高齢者（80歳以上）：小児に対する安全性は確立していない高齢者には新機能の低下により、血中濃度が高く、薬効が強く発現されることがあります。\n" +
                    "4）妊婦または妊娠している可能性がある患者：ラニチジンは母乳中移行されるので、授乳中の母親に投与する場合は授乳しないようにしてください。");
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
//소화불량만