package com.example.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity {
    ImageButton star;
    ImageButton circle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        star = findViewById(R.id.imageButton11);
        circle = findViewById(R.id.imageButton12);

        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main2Activity.this,MainActivity.class);
                intent.putExtra("chosen",0);
                startActivity(intent);
                finish();
                System.exit(0);
            }
        });
        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Main2Activity.this,MainActivity.class);
                intent2.putExtra("chosen",1);
                startActivity(intent2);
                finish();
                System.exit(0);
            }
        });
    }
}
