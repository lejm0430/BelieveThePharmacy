package com.example.gamerecommendapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class English extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.englishsymptom);

        Button nextbtn = (Button)findViewById(R.id.nextbtn);
        final CheckBox stomachache = (CheckBox)findViewById(R.id.stomachache);
        final CheckBox headache = (CheckBox)findViewById(R.id.headache);
        final CheckBox teethache = (CheckBox)findViewById(R.id.teethache);
        final CheckBox menstrual = (CheckBox)findViewById(R.id.menstrual);
        final CheckBox sore = (CheckBox)findViewById(R.id.sore);
        final CheckBox abrasion = (CheckBox)findViewById(R.id.abrasion);
        final CheckBox indigestion = (CheckBox)findViewById(R.id.indigestion);


        nextbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(stomachache.isChecked() == true && headache.isChecked() == true){

                    Intent intent = new Intent(getApplicationContext(), tylenol.class);
                    intent.putExtra("result","Stomachache, Headeache");
                    intent.putExtra("result1","복통, 두통");
                    intent.putExtra("result2","");
                    startActivity(intent);
                }
                else if(stomachache.isChecked() == true && teethache.isChecked() == true){

                    Intent intent = new Intent(getApplicationContext(), tylenol.class);
                    intent.putExtra("result","Stomachache, Teethache");
                    intent.putExtra("result1","복통, 치통");
                    intent.putExtra("result2","");
                    startActivity(intent);
                }
                else if(stomachache.isChecked() == true && menstrual.isChecked() == true){

                    Intent intent = new Intent(getApplicationContext(), ezn.class);
                    intent.putExtra("result","Stomachache, Menstrual Pain");
                    intent.putExtra("result1","복통, 생리통");
                    intent.putExtra("result2","");
                    startActivity(intent);
                }
                else if(stomachache.isChecked() == true && indigestion.isChecked() == true){

                    Intent intent = new Intent(getApplicationContext(), qsid.class);
                    intent.putExtra("result","Stomachache, Indigestion");
                    intent.putExtra("result1","복통, 소화불량");
                    intent.putExtra("result2","");
                    startActivity(intent);
                }
                ///////////////////////////////////////stomachace

                else if(headache.isChecked() == true && teethache.isChecked() == true){

                    Intent intent = new Intent(getApplicationContext(), tylenol.class);
                    intent.putExtra("result","Headache, Teethache");
                    intent.putExtra("result1","두통, 치통");
                    intent.putExtra("result2","");
                    startActivity(intent);
                }
                else if(headache.isChecked() == true && menstrual.isChecked() == true){

                    Intent intent = new Intent(getApplicationContext(), ezn.class);
                    intent.putExtra("result","Headache, Menstrual pain");
                    intent.putExtra("result1","두통, 생리통");
                    intent.putExtra("result2","");
                    startActivity(intent);
                }
                else if(headache.isChecked() == true && indigestion.isChecked() == true){

                    Intent intent = new Intent(getApplicationContext(), qsid.class);
                    intent.putExtra("result","Headache, Indigestion");
                    intent.putExtra("result1","두통, 소화불량");
                    intent.putExtra("result2","");
                    startActivity(intent);
                }
                else if(headache.isChecked() == true && sore.isChecked() == true){

                    Intent intent = new Intent(getApplicationContext(), tylenol.class);
                    intent.putExtra("result","Headache, Sore Throat");
                    intent.putExtra("result1","두통, 인후통");
                    intent.putExtra("result2","");
                    startActivity(intent);
                }

                ///////////////////////////////////////headache
                else if(teethache.isChecked() == true && menstrual.isChecked() == true){
                    Intent intent = new Intent(getApplicationContext(), ezn.class);
                    intent.putExtra("result","Teethache, Menstrual pain");
                    intent.putExtra("result1","치통, 생리통");
                    intent.putExtra("result2","");
                    startActivity(intent);
                }
                else if(teethache.isChecked() == true && indigestion.isChecked() == true){

                    Intent intent = new Intent(getApplicationContext(), qsid.class);
                    intent.putExtra("result","Teethache, Indigestion");
                    intent.putExtra("result1","치통, 소화불량");
                    startActivity(intent);
                }

                ///////////////////////////////////////Teethache

                else if(menstrual.isChecked() == true && indigestion.isChecked() == true){
                    Intent intent = new Intent(getApplicationContext(), qsid.class);
                    intent.putExtra("result","Menstrual Pain, Indigestion");
                    intent.putExtra("result1","생리통, 소화불량");
                    intent.putExtra("result2","");
                    startActivity(intent);
                }

                ///////////////////////////////////////menstrual



                else if(stomachache.isChecked() == true){
                    Intent intent = new Intent(getApplicationContext(), Buscopan.class);
                    intent.putExtra("result","Stomachache");
                    intent.putExtra("result1","복통");
                    intent.putExtra("result2","");
                    startActivity(intent);
                }
                else if(headache.isChecked() == true){
                    Intent intent = new Intent(getApplicationContext(), tylenol.class);
                    intent.putExtra("result","Headache");
                    intent.putExtra("result1","두통");
                    intent.putExtra("result2","");
                    startActivity(intent);
                }
                else if(teethache.isChecked() == true){
                    Intent intent = new Intent(getApplicationContext(), tylenol.class);
                    intent.putExtra("result","Teethache");
                    intent.putExtra("result1","치통");
                    intent.putExtra("result2","");
                    startActivity(intent);
                }
                else if(menstrual.isChecked() == true){
                    Intent intent = new Intent(getApplicationContext(), ezn.class);
                    intent.putExtra("result","Menstrual Pain");
                    intent.putExtra("result1","생리통");
                    intent.putExtra("result2","");
                    startActivity(intent);
                }
                else if(sore.isChecked() == true){
                    Intent intent = new Intent(getApplicationContext(), strepsils.class);
                    intent.putExtra("result","Sore Throat");
                    intent.putExtra("result1","인후통");
                    intent.putExtra("result2","");
                    startActivity(intent);
                }
                else if(abrasion.isChecked() == true){
                    Intent intent = new Intent(getApplicationContext(), anti.class);
                    intent.putExtra("result","Abrasion");
                    intent.putExtra("result1","찰과상");
                    intent.putExtra("result2","");
                    startActivity(intent);
                }
                else if(indigestion.isChecked() == true){
                    Intent intent = new Intent(getApplicationContext(), qsid.class);
                    intent.putExtra("result","Indigestion");
                    intent.putExtra("result1","소화불량");
                    intent.putExtra("result2","");
                    startActivity(intent);
                }
            }
        });
    }
}
