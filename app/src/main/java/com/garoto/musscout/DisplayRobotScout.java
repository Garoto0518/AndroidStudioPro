package com.garoto.musscout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayRobotScout extends AppCompatActivity {

    private int allianceCounter = 0;
    private TextView allianceTextView;

    private int scaleCounter = 0;
    private TextView scaleTextView;

    private int opponentCounter = 0;
    private TextView opponentTextView;

    private int exchangeCounter = 0;
    private TextView exchangeTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_robot_scout);
        allianceTextView = (TextView) findViewById(R.id.allianceTextView);
        scaleTextView = (TextView) findViewById(R.id.scaleTextView);
        opponentTextView = (TextView) findViewById(R.id.opponentTextView);
        exchangeTextView = (TextView) findViewById(R.id.exchangeTextView);
//        Button robotSubmit = (Button)findViewById(R.id.robotSubmit);
//
//        robotSubmit.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                Intent intent = new Intent(DisplayRobotScout.this,row.class);
//            }
//        });
    }

    public void allianceCounterInc(View view) {
        allianceCounter++;
        allianceTextView.setText(Integer.toString(allianceCounter));
    }

    public void allianceCounterDec(View v) {
        allianceCounter--;
        allianceTextView.setText(Integer.toString(allianceCounter));
    }

    public void scaleCounterInc(View view) {
        scaleCounter++;
        scaleTextView.setText(Integer.toString(scaleCounter));
    }

    public void scaleCounterDec(View view) {
        scaleCounter--;
        scaleTextView.setText(Integer.toString(scaleCounter));
    }

    public void opponentCounterInc(View view) {
        opponentCounter++;
        opponentTextView.setText(Integer.toString(opponentCounter));
    }

    public void opponentCounterDec(View view) {
        opponentCounter--;
        opponentTextView.setText(Integer.toString(opponentCounter));
    }

    public void exchangeCounterInc(View view) {
        exchangeCounter++;
        exchangeTextView.setText(Integer.toString(exchangeCounter));
    }

    public void exchangeCounterDec(View view) {
        exchangeCounter--;
        exchangeTextView.setText(Integer.toString(exchangeCounter));
    }
}

