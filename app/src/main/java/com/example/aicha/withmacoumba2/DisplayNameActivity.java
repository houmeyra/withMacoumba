package com.example.aicha.withmacoumba2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class DisplayNameActivity extends AppCompatActivity {

    private TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_name);

        tv = findViewById(R.id.textView);

        Intent i = getIntent();
        String msg = i.getStringExtra("msg_label");

        tv.setText(msg);
    }
}
