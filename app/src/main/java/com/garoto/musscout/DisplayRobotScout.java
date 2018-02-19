package com.garoto.musscout;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DisplayRobotScout extends AppCompatActivity {

    Button btnStart, btnPause, btnLap;
    TextView txtTimer;
    Handler customHandler = new Handler();
    LinearLayout container;

    long startTime = 0L, timeInMillisseconds = 0L, timeSwapBuff = 0L, updateTime=0L;
    Runnable updateTimeThread = new Runnable() {
        @Override
        public void run() {
            timeInMillisseconds = SystemClock.uptimeMillis()-startTime;
            updateTime = timeSwapBuff + timeInMillisseconds;
            int secs = (int)( updateTime/1000);
            int mins = secs/60;
            secs%=60;
            int milliseconds = (int) (updateTime%1000);
            txtTimer.setText(""+mins+":"+String.format("%2d",secs) +":"+String.format("%3d",milliseconds));
            customHandler.postDelayed(this,0);
        }
    };

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
        btnStart = (Button) findViewById(R.id.btnStart);
        btnPause = (Button) findViewById(R.id.btnPause);
        btnLap = (Button) findViewById(R.id.btnLap);
        txtTimer = (TextView) findViewById(R.id.timerValue);
        container = (LinearLayout) findViewById(R.id.container);

        btnStart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startTime = SystemClock.uptimeMillis();
                customHandler.postDelayed(updateTimeThread,0);
            }
        });

        btnPause.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                timeSwapBuff += timeInMillisseconds;
                customHandler.removeCallbacks(updateTimeThread);
            }
        });

        btnLap.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                LayoutInflater inflater = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View addView = inflater.inflate(R.layout.row,null);
                TextView txtValue = (TextView)addView.findViewById(R.id.txtContent);
                txtValue.setText(txtTimer.getText());
                container.addView(addView);
            }
        });
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
//whY?

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

