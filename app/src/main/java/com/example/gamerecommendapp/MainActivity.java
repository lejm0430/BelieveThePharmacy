package com.example.gamerecommendapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button english = (Button) findViewById(R.id.english);
        Button china = (Button) findViewById(R.id.china);
        Button japan = (Button) findViewById(R.id.japan);
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setSingleLine();
        tv.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        tv.setSelected(true);
        TextView tv1 = (TextView) findViewById(R.id.textView3);
        tv1.setSelected(true);
        TextView tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setSelected(true);


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
