package com.example.mindfak3.activity2;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView auto;
    Button b3;


    String[] arr={"Violet","Indigo","Brown","Green","Yellow","Orange","Red"};
    Handler h = new Handler(){
        @Override
        public void handleMessage(Message msg)
        {
            Intent j = new Intent(MainActivity.this,FinalActivity.class);
            startActivity(j);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        auto =(AutoCompleteTextView)findViewById(R.id.autotxt);
        b3=(Button)findViewById(R.id.b3);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,arr);
        auto.setThreshold(1);
        auto.setAdapter(adapter);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = auto.getText().toString();
                if(s.equals("Yellow")) {
                    h.sendEmptyMessage(0);
                }
                else {
                    Toast.makeText(MainActivity.this ,"Not Yellow! Try Again",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }





}
