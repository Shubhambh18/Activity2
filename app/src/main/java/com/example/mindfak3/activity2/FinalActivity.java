package com.example.mindfak3.activity2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FinalActivity extends AppCompatActivity {
    Button b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        b4=(Button)findViewById(R.id.b4);
      b4.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent x=new Intent(FinalActivity.this,FirstActivity.class);
              startActivity(x);
          }
      });
    }
}
