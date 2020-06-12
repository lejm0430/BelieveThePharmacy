package com.example.gamerecommendapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class China extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.chinasymptom);

        Button nextbtn = (Button)findViewById(R.id.nextbtnC);
        final CheckBox stomachache = (CheckBox)findViewById(R.id.stomachacheC);
        final CheckBox headache = (CheckBox)findViewById(R.id.headacheC);
        final CheckBox teethache = (CheckBox)findViewById(R.id.teethacheC);
        final CheckBox menstrual = (CheckBox)findViewById(R.id.menstrualC);
        final CheckBox sore = (CheckBox)findViewById(R.id.soreC);
        final CheckBox abrasion = (CheckBox)findViewById(R.id.abrasionC);
        final CheckBox indigestion = (CheckBox)findViewById(R.id.indigestionC);

        //sto =腹痛 head =头痛 teeth=牙疼 men=月经痛 sore= 咽喉痛 ab=擦伤 indi=消化不良
        nextbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(stomachache.isChecked() == true && headache.isChecked() == true){

                    Intent intent = new Intent(getApplicationContext(), tylenol.class);
                    intent.putExtra("result","腹痛, 头痛");
                    intent.putExtra("result1","복통, 두통");
                    intent.putExtra("result3","");
                    startActivity(intent);
                }
                else if(stomachache.isChecked() == true && teethache.isChecked() == true){

                    Intent intent = new Intent(getApplicationContext(), tylenol.class);
                    intent.putExtra("result","腹痛, 牙疼");
                    intent.putExtra("result1","복통, 치통");
                    intent.putExtra("result3","");
                    startActivity(intent);
                }
                else if(stomachache.isChecked() == true && menstrual.isChecked() == true){

                    Intent intent = new Intent(getApplicationContext(), ezn.class);
                    intent.putExtra("result","腹痛, 月经痛");
                    intent.putExtra("result1","복통, 생리통");
                    intent.putExtra("result3","");
                    startActivity(intent);
                }
                else if(stomachache.isChecked() == true && indigestion.isChecked() == true){

                    Intent intent = new Intent(getApplicationContext(), qsid.class);
                    intent.putExtra("result","腹痛, 消化不良");
                    intent.putExtra("result1","복통, 소화불량");
                    intent.putExtra("result3","");
                    startActivity(intent);
                }
                ///////////////////////////////////////stomachace

                else if(headache.isChecked() == true && teethache.isChecked() == true){

                    Intent intent = new Intent(getApplicationContext(), tylenol.class);
                    intent.putExtra("result","头痛, 牙疼");
                    intent.putExtra("result1","두통, 치통");
                    intent.putExtra("result3","");
                    startActivity(intent);
                }
                else if(headache.isChecked() == true && menstrual.isChecked() == true){

                    Intent intent = new Intent(getApplicationContext(), ezn.class);
                    intent.putExtra("result","头痛, 月经痛");
                    intent.putExtra("result1","두통, 생리통");
                    intent.putExtra("result3","");
                    startActivity(intent);
                }
                else if(headache.isChecked() == true && indigestion.isChecked() == true){

                    Intent intent = new Intent(getApplicationContext(), qsid.class);
                    intent.putExtra("result","头痛, 消化不良");
                    intent.putExtra("result1","두통, 소화불량");
                    intent.putExtra("result3","");
                    startActivity(intent);
                }
                else if(headache.isChecked() == true && sore.isChecked() == true){

                    Intent intent = new Intent(getApplicationContext(), tylenol.class);
                    intent.putExtra("result","头痛, 咽喉痛");
                    intent.putExtra("result1","두통, 인후통");
                    intent.putExtra("result3","");
                    startActivity(intent);
                }

                ///////////////////////////////////////headache
                else if(teethache.isChecked() == true && menstrual.isChecked() == true){
                    Intent intent = new Intent(getApplicationContext(), ezn.class);
                    intent.putExtra("result","牙疼, 月经痛");
                    intent.putExtra("result1","치통, 생리통");
                    intent.putExtra("result3","");
                    startActivity(intent);
                }
                else if(teethache.isChecked() == true && indigestion.isChecked() == true){

                    Intent intent = new Intent(getApplicationContext(), qsid.class);
                    intent.putExtra("result","牙疼, 消化不良");
                    intent.putExtra("result1","치통, 소화불량");
                    intent.putExtra("result3","");
                    startActivity(intent);
                }

                ///////////////////////////////////////Teethache

                else if(menstrual.isChecked() == true && indigestion.isChecked() == true){
                    Intent intent = new Intent(getApplicationContext(), qsid.class);
                    intent.putExtra("result","月经痛, Indigestion");
                    intent.putExtra("result1","생리통, 소화불량");
                    intent.putExtra("result3","");
                    startActivity(intent);
                }

                ///////////////////////////////////////menstrual



                else if(stomachache.isChecked() == true){
                    Intent intent = new Intent(getApplicationContext(), Buscopan.class);
                    intent.putExtra("result","腹痛");
                    intent.putExtra("result1","복통");
                    intent.putExtra("result3","");
                    startActivity(intent);
                }
                else if(headache.isChecked() == true){
                    Intent intent = new Intent(getApplicationContext(), tylenol.class);
                    intent.putExtra("result","头痛");
                    intent.putExtra("result1","두통");
                    intent.putExtra("result3","");
                    startActivity(intent);
                }
                else if(teethache.isChecked() == true){
                    Intent intent = new Intent(getApplicationContext(), tylenol.class);
                    intent.putExtra("result","牙疼");
                    intent.putExtra("result1","치통");
                    intent.putExtra("result3","");
                    startActivity(intent);
                }
                else if(menstrual.isChecked() == true){
                    Intent intent = new Intent(getApplicationContext(), ezn.class);
                    intent.putExtra("result","月经痛");
                    intent.putExtra("result1","생리통");
                    intent.putExtra("result3","");
                    startActivity(intent);
                }
                else if(sore.isChecked() == true){
                    Intent intent = new Intent(getApplicationContext(), strepsils.class);
                    intent.putExtra("result","咽喉痛");
                    intent.putExtra("result1","인후통");
                    intent.putExtra("result3","");
                    startActivity(intent);
                }
                else if(abrasion.isChecked() == true){
                    Intent intent = new Intent(getApplicationContext(), anti.class);
                    intent.putExtra("result","擦伤");
                    intent.putExtra("result1","찰과상");
                    intent.putExtra("result3","");
                    startActivity(intent);
                }
                else if(indigestion.isChecked() == true){
                    Intent intent = new Intent(getApplicationContext(), qsid.class);
                    intent.putExtra("result","消化不良");
                    intent.putExtra("result1","소화불량");
                    intent.putExtra("result3","");
                    startActivity(intent);
                }
            }
        });
    }
}
