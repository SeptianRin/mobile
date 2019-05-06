package com.example.lesson4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class Activity2Activity extends AppCompatActivity {
    @Bind(R.id.a2a)
    TextView a2a;
    @Bind(R.id.ba2a)
    Button ba2a;

    String me = "saya akan melakukan apa saja";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        ButterKnife.bind(this);
        a2a.setText("heheh " + me);
        setTitle("Activity to acticity");

        ba2a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ResultActivity.class);
                intent.putExtra("data",me);
                startActivity(intent);
            }
        });
    }
}
