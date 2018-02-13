package com.garoto.musscout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
    }

    public void robotScout(View view){
        Intent startMainScreen = new Intent(this, DisplayRobotScout.class);
        startActivity(startMainScreen);
    }
    public void pitScout(View view){
        Intent startScreen = new Intent(this, MainActivity.class);
        startActivity(startScreen);
    }
    public void mainMenu(View view){
        Intent mainActivity = new Intent(this, DisplayMessageActivity.class);
        startActivity(mainActivity);
    }
}
