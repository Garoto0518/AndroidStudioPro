package com.garoto.musscout;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DisplayRobotScout extends AppCompatActivity {

    Button btnStart, btnPause, btnLap;
    TextView txtTimer;
    Handler customHandler = new Handler();
    LinearLayout container;

    long startTime = 0L, timeInMillisseconds = 0L, timeSwapBuff = 0L, updateTime = 0L;
    Runnable updateTimeThread = new Runnable() {
        @Override
        public void run() {
            timeInMillisseconds = SystemClock.uptimeMillis() - startTime;
            updateTime = timeSwapBuff + timeInMillisseconds;
            int secs = (int) (updateTime / 1000);
            int mins = secs / 60;
            secs %= 60;
            int milliseconds = (int) (updateTime % 1000);
            txtTimer.setText("" + mins + ":" + String.format("%2d", secs) + ":" + String.format("%3d", milliseconds));
            customHandler.postDelayed(this, 0);
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

    private TextView scouterName;
    private TextView teamNumber;
    private TextView matchNumber;

    //Auto
    private CheckBox crossedAutoLine;
    private RadioButton noCubeAttempt;
    private RadioButton switchAttempted;
    private RadioButton scaleAttempted;
    private RadioButton scaleSuccessful;
    private RadioButton switchSuccessful;
    private CheckBox cube2Auto;
    private RadioButton scale2CubeAuto;
    private RadioButton switch2CubeAuto;
    private CheckBox cube3Auto;
    private RadioButton scale3AutoCube;
    private RadioButton switch3CubeAuto;
    private CheckBox cubeWrongSideScaleSwitch;

    //Tele-Op
    private TextView allianceSwitch;
    private TextView centerScale;
    private TextView opponentSwitch;
    private TextView exchangeSwitch;
    private CheckBox powerUpForce;
    private CheckBox powerUpBoost;
    private CheckBox powerUpLevitate;
    private CheckBox anyCubeOnWrongSideScaleSwitch;
    private TextView estimatedTimeScalePossesion;
    private TextView estimatedTimeSwitchPossesion;
    private TextView estimatedOpponentSwitchPossesion;


    //End Game
    private RadioButton notParkedOnPlatform;
    private RadioButton parkedOnPlatform;
    private RadioButton attemptedHookBar;
    private RadioButton attemptedAttachRobot;
    private RadioButton attemptedCarryRobot;
    private RadioButton hookedBarAttemptedClimb;
    private RadioButton successfulClimbOnAnotherRobot;
    private RadioButton succesfulClimbWithAnotherRobotAttached;
    private RadioButton succesfulClimbOwn;

    //Defense
    private CheckBox defenseAgainstOpponents;
    private CheckBox defensePlayedAgainstThem;
    private TextView penalties;


    //Database
    private DatabaseReference mDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_robot_scout);

//        allianceTextView =(TextView) findViewById(R.id.switchCounter);
//        scaleTextView = (TextView) findViewById(R.id.scaleCounter);
//        opponentTextView = (TextView) findViewById(R.id.opponentCounter);
//        exchangeTextView = (TextView) findViewById(exchangeCounter);

        btnStart = (Button) findViewById(R.id.btnStart);
        btnPause = (Button) findViewById(R.id.btnPause);
        btnLap = (Button) findViewById(R.id.btnLap);
        txtTimer = (TextView) findViewById(R.id.timerValue);
        container = (LinearLayout) findViewById(R.id.container);


        scouterName = findViewById(R.id.editText6);
        teamNumber = findViewById(R.id.editText4);
        matchNumber = findViewById(R.id.editText5);

        //Auto
        crossedAutoLine = findViewById(R.id.checkBox);
        noCubeAttempt = findViewById(R.id.checkBox2);
        switchAttempted = findViewById(R.id.checkBox5);
        scaleAttempted = findViewById(R.id.checkBox6);
        scaleSuccessful = findViewById(R.id.checkBox7);
        switchSuccessful = findViewById(R.id.checkBox8);
        cube2Auto = findViewById(R.id.checkBox11);
        scale2CubeAuto = findViewById(R.id.cubeAutoTwo);
        switch2CubeAuto = findViewById(R.id.switch2CubeAuto);
        cube3Auto = findViewById(R.id.checkBox12);
        scale3AutoCube = findViewById(R.id.radioButton11);
        switch3CubeAuto = findViewById(R.id.switchMortalAuto);
        cubeWrongSideScaleSwitch = findViewById(R.id.checkBox3);

        //Tele-Op
        allianceTextView = findViewById(R.id.switchCounter);
        scaleTextView = findViewById(R.id.scaleCounter);
        opponentTextView = findViewById(R.id.opponentCounter);
        exchangeTextView = findViewById(R.id.exchangeCounter);
        powerUpForce = findViewById(R.id.radioButton12);
        powerUpBoost = findViewById(R.id.radioButton13);
        powerUpLevitate = findViewById(R.id.radioButton14);
        anyCubeOnWrongSideScaleSwitch = findViewById(R.id.checkBox4);
        estimatedTimeScalePossesion = findViewById(R.id.editText);
        estimatedTimeSwitchPossesion = findViewById(R.id.editText2);
        estimatedOpponentSwitchPossesion = findViewById(R.id.textView6);


        //End Game
        notParkedOnPlatform = findViewById(R.id.radioButton15);
        parkedOnPlatform = findViewById(R.id.radioButton16);
        attemptedHookBar = findViewById(R.id.radioButton17);
        attemptedAttachRobot = findViewById(R.id.radioButton18);
        attemptedCarryRobot = findViewById(R.id.radioButton19);
        hookedBarAttemptedClimb = findViewById(R.id.radioButton20);
        successfulClimbOnAnotherRobot = findViewById(R.id.radioButton21);
        succesfulClimbWithAnotherRobotAttached = findViewById(R.id.radioButton22);
        succesfulClimbOwn = findViewById(R.id.radioButton23);

        //Defense
        defenseAgainstOpponents = findViewById(R.id.checkBox9);
        defensePlayedAgainstThem = findViewById(R.id.checkBox10);
        penalties = findViewById(R.id.editText9);

        //StopWatch Start
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startTime = SystemClock.uptimeMillis();
                customHandler.postDelayed(updateTimeThread, 0);
            }
        });

        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timeSwapBuff += timeInMillisseconds;
                customHandler.removeCallbacks(updateTimeThread);
            }
        });

        btnLap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View addView = inflater.inflate(R.layout.row, null);
                TextView txtValue = (TextView) addView.findViewById(R.id.txtContent);
                txtValue.setText(txtTimer.getText());
                container.addView(addView);
            }
        });
// End of StopWatch


        Button robotSubmit = findViewById(R.id.robotSubmit);
//
        mDatabase = FirebaseDatabase.getInstance().getReference().child("Primera");
        robotSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //    Intent intent = new Intent(DisplayRobotScout.this,row.class);


                //   if(allianceSwitch != null && centerScale!= null) {

//                }
//                if ( scouterName != null && teamNumber != null && matchNumber != null && crossedAutoLine != null && noCubeAttempt != null && switchAttempted != null && scaleAttempted != null && scaleSuccessful != null
//                        && switchSuccessful != null && cube2Auto != null && scale2CubeAuto != null && switch2CubeAuto != null && cube3Auto != null &&scale3AutoCube != null  && switch3CubeAuto != null && cubeWrongSideScaleSwitch != null
//                        && allianceSwitch != null &&centerScale != null && opponentSwitch != null && exchangeSwitch != null && powerUpForce != null && powerUpBoost != null && powerUpLevitate != null && anyCubeOnWrongSideScaleSwitch != null &&
//                        estimatedTimeScalePossesion != null && estimatedTimeSwitchPossesion!= null && estimatedTimeScalePossesion != null &&estimatedOpponentSwitchPossesion != null && notParkedOnPlatform != null && parkedOnPlatform != null && attemptedHookBar != null
//                        && attemptedAttachRobot != null && attemptedCarryRobot != null && hookedBarAttemptedClimb != null && successfulClimbOnAnotherRobot != null && succesfulClimbWithAnotherRobotAttached != null &&succesfulClimbOwn != null && defenseAgainstOpponents != null &&
//                        defensePlayedAgainstThem != null && penalties != null)
//                {
//
//                }
                RobotScout robotScout = new RobotScout(scouterName.getText().toString().trim(), teamNumber.getText().toString().trim(), matchNumber.getText().toString().trim(),
                        crossedAutoLine.isChecked(), noCubeAttempt.isSelected(), switchAttempted.isSelected(), scaleAttempted.isSelected(), scaleSuccessful.isSelected(),
                        switchSuccessful.isSelected(), cube2Auto.isChecked(), scale2CubeAuto.isSelected(), switch2CubeAuto.isSelected(), cube3Auto.isChecked(), scale3AutoCube.isSelected(),
                        switch3CubeAuto.isSelected(), cubeWrongSideScaleSwitch.isChecked(), allianceTextView.getText().toString().trim(), scaleTextView.getText().toString().trim(),
                        opponentTextView.getText().toString().trim(), exchangeTextView.getText().toString().trim(), powerUpForce.isChecked(), powerUpBoost.isChecked(), powerUpLevitate.isChecked(), anyCubeOnWrongSideScaleSwitch.isChecked(),
                        estimatedTimeScalePossesion.getText().toString().trim(), estimatedTimeSwitchPossesion.getText().toString().trim(), estimatedOpponentSwitchPossesion.getText().toString().trim(), notParkedOnPlatform.isSelected(), parkedOnPlatform.isSelected(), attemptedHookBar.isSelected(),
                        attemptedAttachRobot.isSelected(), attemptedCarryRobot.isSelected(), hookedBarAttemptedClimb.isSelected(), successfulClimbOnAnotherRobot.isSelected(), succesfulClimbWithAnotherRobotAttached.isSelected(),
                        succesfulClimbOwn.isSelected(), defenseAgainstOpponents.isChecked(), defensePlayedAgainstThem.isChecked(), penalties.getText().toString().trim());

                mDatabase.push().setValue(robotScout.toMap());

                if ()
                //}

            }
        });
    }


    //Counters...
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

