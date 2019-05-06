package com.example.lesson4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;


public class ResultActivity extends AppCompatActivity {

    @Bind(R.id.terima)
    TextView terima;

    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ButterKnife.bind(this);
        preProcessing();

        terima.setText("ininih data yang diterima" + data);
    }

    private void preProcessing(){
        data = getIntent().getStringExtra("data");
        Log.i("intent", data);
    }
}
