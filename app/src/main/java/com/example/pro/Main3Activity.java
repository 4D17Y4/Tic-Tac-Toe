package com.example.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity {
    ImageButton exit;
    ImageButton play_again;
    ImageView image;
    int status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        exit = findViewById(R.id.image);
        play_again=findViewById(R.id.imageButton);
        image=findViewById(R.id.imageView11);

        status= getIntent().getIntExtra("status",status);
        //.makeText(Main3Activity.this, "status"+status, Toast.LENGTH_SHORT).show();
        if(status==1)
        {
            image.setImageResource(R.drawable.won);
        }
        if(status==0)
        {
            image.setImageResource(R.drawable.lost);
        }
        if(status==-1)
        {   //Toast.makeText(Main3Activity.this, "status1"+status, Toast.LENGTH_SHORT).show();
            image.setImageResource(R.drawable.draw);
        }
        play_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Main3Activity.this,Main2Activity.class);

               startActivity(intent);
               System.exit(0);
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });

    }
}
