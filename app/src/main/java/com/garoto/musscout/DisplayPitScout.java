package com.garoto.musscout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;

public class DisplayPitScout extends AppCompatActivity {
    TextView showValue;
    private DatabaseReference mDatabase;

    private TextView teamNumber;
    private TextView wheelType;
    private TextView driveTrain;
    private TextView mechanism;

    private RadioButton canSwitch;
    private RadioButton canScale;
    private RadioButton canAuto;
    private TextView robotWeight;
    private TextView cubesPerMatch;
    private TextView comments;
    private TextView howManyRegionals;
    private TextView robotHeight;

    private RadioButton canVisioning;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showValue = (TextView) findViewById(R.id.switchCounter);


        teamNumber = findViewById(R.id.editText13);
        wheelType = findViewById(R.id.editText7);
        driveTrain = findViewById(R.id.editText11);
        mechanism = findViewById(R.id.editText10);

        canSwitch = findViewById(R.id.radioButton);
        canScale = findViewById(R.id.radioButton3);
        canAuto = findViewById(R.id.radioButton5);
        robotWeight = findViewById(R.id.editText15);
        cubesPerMatch = findViewById(R.id.editText16);
        comments = findViewById(R.id.editText12);
        howManyRegionals = findViewById(R.id.editText17);
        robotHeight = findViewById(R.id.editText18);
        canVisioning = findViewById(R.id.radioButton9);


        Button pitSubmit = findViewById(R.id.pitSubmit);

        mDatabase = FirebaseDatabase.getInstance().getReference().child("Pit Scout");
        pitSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PitScout pitScout = new PitScout(teamNumber.getText().toString().trim(), wheelType.getText().toString().trim(), driveTrain.getText().toString().trim(), mechanism.getText().toString().trim(), canSwitch.isSelected(),
                        canScale.isSelected(), canAuto.isSelected(), robotWeight.getText().toString().trim(), cubesPerMatch.getText().toString().trim(), comments.getText().toString().trim(), howManyRegionals.getText().toString().trim(),
                        robotHeight.getText().toString().trim(), canVisioning.isSelected());

                mDatabase.push().setValue(pitScout.toMap());
                Toast.makeText(getBaseContext(),"Data has been saved", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DisplayPitScout.this, DisplayMessageActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }


//    public void pitScoutSubmit(View view) {
//        Intent startMainScreen = new Intent(this, DisplayMessageActivity.class);
//        startActivity(startMainScreen);
//    }

}
