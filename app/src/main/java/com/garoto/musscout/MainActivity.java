package com.garoto.musscout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView showValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showValue = (TextView) findViewById(R.id.allianceTextView);
    }

//    public void pitScoutSubmit(View view){
//        Intent startMainScreen = new Intent(this, DisplayMessageActivity.class);
//        startActivity(startMainScreen);
//    }

}
