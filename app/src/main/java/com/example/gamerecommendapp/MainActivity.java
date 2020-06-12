package com.example.gamerecommendapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button english = (Button) findViewById(R.id.english);
        Button china = (Button) findViewById(R.id.china);
        Button japan = (Button) findViewById(R.id.japan);


        english.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), English.class);
                startActivity(intent);
            }
        });

        china.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), China.class);
                startActivity(intent);
            }
        });

        japan.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), Japan.class);
                startActivity(intent);
            }
        });
    }
}
