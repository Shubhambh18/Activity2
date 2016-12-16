package com.example.mindfak3.activity2;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class FirstActivity extends AppCompatActivity {
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        final ImageView iv=(ImageView)findViewById(R.id.iv);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        Bitmap bit;

        Picasso.with(this).load("http://a2b2.in/wp-content/uploads/2014/09/a2b2-logo-214-1163.png").into(iv);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv.setRotation(90);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(FirstActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}
