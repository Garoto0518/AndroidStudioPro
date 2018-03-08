package com.garoto.musscout;

import android.widget.RadioGroup;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Garoto on 2/22/2018.
 */

public class PitScout {

    // Pit scout information
    private String teamNumber;
    private String wheelType;
    private String driveTrain;
    private String mechanism;
    private boolean canSwitch;
    private boolean canScale;
    private boolean canAuto;
    private String robotWeight;
    private String cubesPerMatch;
    private String comments;
    private String howManyRegionals;
    private String robotHeight;
    private boolean canVisioning;

    public PitScout(String teamNumber, String wheelType, String driveTrain, String mechanism, boolean canSwitch, boolean canScale, boolean canAuto, String robotWeight,
                    String cubesPerMatch, String comments, String howManyRegionals, String robotHeight, boolean canVisioning) {

        this.teamNumber = teamNumber;
        this.wheelType = wheelType;
        this.driveTrain = driveTrain;
        this.mechanism = mechanism;
        this.canSwitch = canSwitch;
        this.canScale = canScale;
        this.canAuto = canAuto;
        this.robotWeight = robotWeight;
        this.cubesPerMatch = cubesPerMatch;
        this.comments = comments;
        this.howManyRegionals = howManyRegionals;
        this.robotHeight = robotHeight;
        this.canVisioning = canVisioning;

    }

    public Map<String, Object> toMap() {
        HashMap<String, Object> pitResult = new HashMap<>();

        pitResult.put("Team Number", teamNumber);
        pitResult.put("Wheel Type", wheelType);
        pitResult.put("Drive Train", driveTrain);
        pitResult.put("Mechanism", mechanism);
        pitResult.put("Can Switch", canSwitch);
        pitResult.put("Can Scale", canScale);
        pitResult.put("Can Auto", canAuto);
        pitResult.put("Robot Weight", robotWeight);
        pitResult.put("Cubes Per Match", cubesPerMatch);
        pitResult.put("Comments", comments);
        pitResult.put("How Many Regionals", howManyRegionals);
        pitResult.put("Robot Height", robotHeight);
        pitResult.put("Can Visioning", canVisioning);

        return pitResult;


    }
}
