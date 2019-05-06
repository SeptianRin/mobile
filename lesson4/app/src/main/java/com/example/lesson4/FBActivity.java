package com.example.lesson4;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import butterknife.Bind;
import butterknife.ButterKnife;

public class FBActivity extends AppCompatActivity {

    @Bind(R.id.fab_add)
    FloatingActionButton fab_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fbactivity);
        ButterKnife.bind(this);
        setTitle("Floating button dan Window");

        fab_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSign();
            }
        });
    }

    public void showSign(){
        AlertDialog.Builder signUp = new AlertDialog.Builder(FBActivity.this);
        signUp.setTitle("Sign In");
        signUp.setMessage("Here is my alert");

        LayoutInflater inflater  = this.getLayoutInflater();
        View sign_in = inflater.inflate(R.layout.fragment_popup,null);

        signUp.setView(sign_in);
        signUp.show();

    }
}
