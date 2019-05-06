package com.example.lesson4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.activity)
    Button activity;
    @Bind(R.id.bottombar)
    Button bottombar;
    @Bind(R.id.burgermenu)
    Button burgermenu;
    @Bind(R.id.floatbtn)
    Button floatbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        buttonClickListener();

    }

    private void buttonClickListener(){
        activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoIntent(R.id.activity);
            }
        });

        bottombar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoIntent(R.id.bottombar);
            }
        });

        burgermenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoIntent(R.id.burgermenu);
            }
        });

        floatbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoIntent(R.id.floatbtn);
            }
        });

    }

    private void gotoIntent(int id) {
        Intent intent = new Intent();
        switch (id) {
            case R.id.activity:
                intent = new Intent(this, Activity2Activity.class);
                break;
            case R.id.bottombar:
                intent = new Intent(this, BottomNavActivity.class);
                break;
            case R.id.floatbtn:
                intent = new Intent(this, FBActivity.class);
                break;
            case R.id.burgermenu:
                intent = new Intent(this, BurgerMenuActivity.class);
                break;
        }
        if (intent.getClass().getSimpleName().isEmpty()) {
            Toast toast = Toast.makeText(getApplicationContext(), "Intent Activity is Empty", Toast.LENGTH_LONG);
            toast.show();
        } else {
            startActivity(intent);
        }
    }
}
