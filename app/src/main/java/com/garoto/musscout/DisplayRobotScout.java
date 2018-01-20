package com.garoto.musscout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DisplayRobotScout extends AppCompatActivity {
    TextView showValue;
     int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_robot_scout);

        showValue = (TextView) findViewById(R.id.counterValue);
    }

    public void countIN(View view){
       counter++;
       showValue.setText(Integer.toString(counter));
    }
}
