package com.garoto.musscout;

import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DisplayRobotScout extends AppCompatActivity {
    //StopWatch buttons and declarations are in line below
//    Button btnStart,btnLap,btnPause;
//    TextView txtTimer;
//    Handler customHandler = new Handler();
//    LinearLayout container;
//    long startTime = 0L,timeInMilliseconds = 0L,timeSwapBuff = 0L, updateTime=0L;
//
//
//    Runnable updateTimerThread = new Runnable() {
//        @Override
//        public void run() {
//            timeInMilliseconds = SystemClock.uptimeMillis()-startTime
//            updateTime = timeSwapBuff+timeInMilliseconds;
//            int secs = (int)(updateTime/10);
//            int mins = secs/60;
//            secs%=60;
//            int milliseconds = (int)(updateTime%1000);
//            txtTimer.setText("" + mins + ":" + String.format("%2d",secs) + ":" + String.format("%3d",milliseconds));
//            customHandler.postDelayed(this,0);
//        }
//    };
    private TextView counterTxt;
    private TextView counterTxt1;
    private Button minusBtn;
    private Button minusBtn1;
    private Button plusBtn;
    private Button plusBtn1;
    //  private Button resetBtn;
    private int counter;
    private int counter1;


//    TextView showValue;
//    int counter = 0;
//    private int countDown = 0;
//    private int mCounter = 0;
//    Button btn;
//    TextView txv;

    //Crazy stuff
    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.minusBtn:
                    minusCounter();
                    break;
                case R.id.plusBtn:
                    plusCounter();
                    break;
//                case R.id.resetBtn:
//                    initCounter();
//                    break;
            }
        }
    };

    private View.OnClickListener clickListener1 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.minusBtn1:
                    minusCounter();
                    break;
                case R.id.plusBtn1:
                    plusCounter();
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_robot_scout);
        counterTxt = (TextView) findViewById(R.id.counterTxt);
        counterTxt1 = (TextView) findViewById(R.id.counterTxt1);
        minusBtn = (Button) findViewById((R.id.minusBtn));
        minusBtn1 = (Button) findViewById(R.id.minusBtn1);
        minusBtn.setOnClickListener(clickListener);
        minusBtn1.setOnClickListener(clickListener1);
        plusBtn = (Button) findViewById(R.id.plusBtn);
        plusBtn1 = (Button) findViewById(R.id.plusBtn1);
        plusBtn.setOnClickListener(clickListener);
        plusBtn1.setOnClickListener(clickListener1);

//        resetBtn = (Button) findViewById(R.id.resetBtn);
//        resetBtn.setOnClickListener(clickListener);

        initCounter();
    }

    private void initCounter() {
        counter = 0;
        counter1 = 0;
        counterTxt.setText(counter + "");
         counterTxt1.setText(counter1  + "");

    }

    private void plusCounter() {
        counter++;
        counter1++;
        counterTxt.setText(counter + "");
        counterTxt1.setText(counter1 + "");
    }

    private void minusCounter() {
        counter--;
        counter1--;
        counterTxt.setText(counter + "");
        counterTxt1.setText(counter1 + "");
    }
}

//        btnStart = (Button) findViewById(R.id.btnStart);
//        btnLap = (Button) findViewById(R.id.btnLap);
//        btnPause = (Button) findViewById(R.id.btnPause);
//        txtTimer = (TextView) findViewById(R.id.timerValue);
//        container = (LinearLayout) findViewById(R.id.container);
//
//        btnStart.setOnClickListener(new View.onClickListener() {
//            public void onClick(View view) {
//                startTime = SystemClock.uptimeMillis();
//
//                customHandler.postDelayed(updateTimerThread, 0);
//            }
//        });
//    }
//       btnPause.setOnClickListener(new View.onClickListener()){
//        @Override
//                public void onClick(View view){
//
//        }
//    }

//
//
//        showValue = (TextView) findViewById(R.id.counterValue);
//
//        btn = (Button) findViewById(R.id.bt);
//        txv = (TextView) findViewById(R.id.tv);
//
//        btn.setOnClickListener(new View.OnClickListener(){
//            @Override
//                    public void onClick(View view){
//                mCounter++;
//                txv.setText(Integer.toString(mCounter));
//            }
//                    public void onClick(View view){
//                        countDown--;
//                        txv.setText(Integer.toString(countDown));
//
//            }
//        });
//    }
//
//    public void countIN(View view){
//       counter++;
//       showValue.setText(Integer.toString(counter));
//    }
//
//    public void countDown(View view){
//        countDown--;
//    //    showValue.setText(Integer.toString(countDown());
//    }
//
//    public void autoCubeLocationDec(View view){
//        boolean checked = ((RadioButton) view).isChecked();
//    }
//}
