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

        pitResult.put("teamNumber", teamNumber);
        pitResult.put("wheelType", wheelType);
        pitResult.put("driveTrain", driveTrain);
        pitResult.put("mechanism", mechanism);
        pitResult.put("canSwitch", canSwitch);
        pitResult.put("canScale", canScale);
        pitResult.put("canAuto", canAuto);
        pitResult.put("robotWeight", robotWeight);
        pitResult.put("cubesPerMatch", cubesPerMatch);
        pitResult.put("comments", comments);
        pitResult.put("howManyRegionals", howManyRegionals);
        pitResult.put("robotHeight", robotHeight);
        pitResult.put("canVisioning", canVisioning);

        return pitResult;


    }
}
