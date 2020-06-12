package com.example.gamerecommendapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Japan extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.japansymptom);

        Button nextbtn = (Button)findViewById(R.id.nextbtnJ);
        final CheckBox stomachache = (CheckBox)findViewById(R.id.stomachacheJ);
        final CheckBox headache = (CheckBox)findViewById(R.id.headacheJ);
        final CheckBox teethache = (CheckBox)findViewById(R.id.teethacheJ);
        final CheckBox menstrual = (CheckBox)findViewById(R.id.menstrualJ);
        final CheckBox sore = (CheckBox)findViewById(R.id.soreJ);
        final CheckBox abrasion = (CheckBox)findViewById(R.id.abrasionJ);
        final CheckBox indigestion = (CheckBox)findViewById(R.id.indigestionJ);


        // sto=ふくつう head=ずつう teeth=はいた men=せいりつう sore=喉の痛み ab=さっかしょう indi=しょうかふりょう
            nextbtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if(stomachache.isChecked() == true && headache.isChecked() == true){

                        Intent intent = new Intent(getApplicationContext(), tylenol.class);
                        intent.putExtra("result","ふくつう, ずつう");
                        intent.putExtra("result1","복통, 두통");
                        intent.putExtra("result4","");
                        startActivity(intent);
                    }
                    else if(stomachache.isChecked() == true && teethache.isChecked() == true){

                        Intent intent = new Intent(getApplicationContext(), tylenol.class);
                        intent.putExtra("result","ふくつう, はいた");
                        intent.putExtra("result1","복통, 치통");
                        intent.putExtra("result4","");
                        startActivity(intent);
                    }
                    else if(stomachache.isChecked() == true && menstrual.isChecked() == true){

                        Intent intent = new Intent(getApplicationContext(), ezn.class);
                        intent.putExtra("result","ふくつう, せいりつう");
                        intent.putExtra("result1","복통, 생리통");
                        intent.putExtra("result4","");
                        startActivity(intent);
                    }
                    else if(stomachache.isChecked() == true && indigestion.isChecked() == true){

                        Intent intent = new Intent(getApplicationContext(), qsid.class);
                        intent.putExtra("result","ふくつう, しょうかふりょう");
                        intent.putExtra("result1","복통, 소화불량");
                        intent.putExtra("result4","");
                        startActivity(intent);
                    }
                    ///////////////////////////////////////stomachace

                    else if(headache.isChecked() == true && teethache.isChecked() == true){

                        Intent intent = new Intent(getApplicationContext(), tylenol.class);
                        intent.putExtra("result","ずつう, はいた");
                        intent.putExtra("result1","두통, 치통");
                        intent.putExtra("result4","");
                        startActivity(intent);
                    }
                    else if(headache.isChecked() == true && menstrual.isChecked() == true){

                        Intent intent = new Intent(getApplicationContext(), ezn.class);
                        intent.putExtra("result","ずつう, せいりつう");
                        intent.putExtra("result1","두통, 생리통");
                        intent.putExtra("result4","");
                        startActivity(intent);
                    }
                    else if(headache.isChecked() == true && indigestion.isChecked() == true){

                        Intent intent = new Intent(getApplicationContext(), qsid.class);
                        intent.putExtra("result","ずつう, しょうかふりょう");
                        intent.putExtra("result1","두통, 소화불량");
                        intent.putExtra("result4","");
                        startActivity(intent);
                    }
                    else if(headache.isChecked() == true && sore.isChecked() == true){

                        Intent intent = new Intent(getApplicationContext(), tylenol.class);
                        intent.putExtra("result","ずつう, 喉の痛み");
                        intent.putExtra("result1","두통, 인후통");
                        intent.putExtra("result4","");
                        startActivity(intent);
                    }

                    ///////////////////////////////////////headache
                    else if(teethache.isChecked() == true && menstrual.isChecked() == true){
                        Intent intent = new Intent(getApplicationContext(), ezn.class);
                        intent.putExtra("result","はいた, せいりつうn");
                        intent.putExtra("result1","치통, 생리통");
                        intent.putExtra("result4","");
                        startActivity(intent);
                    }
                    else if(teethache.isChecked() == true && indigestion.isChecked() == true){

                        Intent intent = new Intent(getApplicationContext(), qsid.class);
                        intent.putExtra("result","はいた, しょうかふりょう");
                        intent.putExtra("result1","치통, 소화불량");
                        intent.putExtra("result4","");
                        startActivity(intent);
                    }

                    ///////////////////////////////////////Teethache

                    else if(menstrual.isChecked() == true && indigestion.isChecked() == true){
                        Intent intent = new Intent(getApplicationContext(), qsid.class);
                        intent.putExtra("result","せいりつう, しょうかふりょう");
                        intent.putExtra("result1","생리통, 소화불량");
                        intent.putExtra("result4","");
                        startActivity(intent);
                    }

                    ///////////////////////////////////////menstrual



                    else if(stomachache.isChecked() == true){
                        Intent intent = new Intent(getApplicationContext(), Buscopan.class);
                        intent.putExtra("result","ふくつう");
                        intent.putExtra("result1","복통");
                        intent.putExtra("result4","");
                        startActivity(intent);
                    }
                    else if(headache.isChecked() == true){
                        Intent intent = new Intent(getApplicationContext(), tylenol.class);
                        intent.putExtra("result","ずつう");
                        intent.putExtra("result1","두통");
                        intent.putExtra("result4","");
                        startActivity(intent);
                    }
                    else if(teethache.isChecked() == true){
                        Intent intent = new Intent(getApplicationContext(), tylenol.class);
                        intent.putExtra("result","はいた");
                        intent.putExtra("result1","치통");
                        intent.putExtra("result4","");
                        startActivity(intent);
                    }
                    else if(menstrual.isChecked() == true){
                        Intent intent = new Intent(getApplicationContext(), ezn.class);
                        intent.putExtra("result","せいりつう");
                        intent.putExtra("result1","생리통");
                        intent.putExtra("result4","");
                        startActivity(intent);
                    }
                    else if(sore.isChecked() == true){
                        Intent intent = new Intent(getApplicationContext(), strepsils.class);
                        intent.putExtra("result","喉の痛み");
                        intent.putExtra("result1","인후통");
                        intent.putExtra("result4","");
                        startActivity(intent);
                    }
                    else if(abrasion.isChecked() == true){
                        Intent intent = new Intent(getApplicationContext(), anti.class);
                        intent.putExtra("result","さっかしょう");
                        intent.putExtra("result1","찰과상");
                        intent.putExtra("result4","");
                        startActivity(intent);
                    }
                    else if(indigestion.isChecked() == true){
                        Intent intent = new Intent(getApplicationContext(), qsid.class);
                        intent.putExtra("result","しょうかふりょう");
                        intent.putExtra("result1","소화불량");
                        intent.putExtra("result4","");
                        startActivity(intent);
                    }
                }
            });
        }
    }
