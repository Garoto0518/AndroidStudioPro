package com.garoto.musscout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class DisplayRobotScout extends AppCompatActivity {
    TextView showValue;
    int counter = 0;
    private int countDown = 0;
    private int mCounter = 0;
    Button btn;
    TextView txv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_robot_scout);

        showValue = (TextView) findViewById(R.id.counterValue);

        btn = (Button) findViewById(R.id.bt);
        txv = (TextView) findViewById(R.id.tv);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view){
                mCounter++;
                txv.setText(Integer.toString(mCounter));
            }
                    public void onClick(View view){
                        countDown--;
                        txv.setText(Integer.toString(countDown));

            }
        });
    }

    public void countIN(View view){
       counter++;
       showValue.setText(Integer.toString(counter));
    }

    public void countDown(View view){
        countDown--;
        showValue.setText(Integer.toString(countDown());
    }

//    public void autoCubeLocationDec(View view){
//        boolean checked = ((RadioButton) view).isChecked();
//    }
}
