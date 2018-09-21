package com.example.light.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ScheduleInfo extends AppCompatActivity {

    ImageButton backArrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_info);

        backArrow = findViewById(R.id.backArrow);
        backArrow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ScheduleInfo.this, MainActivity.class));
            }
        });

        TextView t2 = (TextView) findViewById(R.id.txtLink);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
