package com.garoto.musscout;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by felix on 2/19/2018.
 */

public class RobotScout {

    private String scouterName;
    private String teamNumber;
    private String matchNumber;
    private boolean crossedAutoLine;
    private boolean noCubeAttempt;
    private boolean switchAttempted;
    private boolean scaleAttempted;
    private boolean scaleSuccessful;
    private boolean switchSuccessful;
    private boolean cube2Auto;
    private boolean scale2CubeAuto;
    private boolean switch2CubeAuto;
    private boolean cube3Auto;
    private boolean scale3CubeAuto;
    private boolean switch3CubeAuto;
    private boolean cubeWrongSideScaleSwitch;

    //Tele-Op Scouting

    private String allianceSwitch;
    private String centerScale;
    private String opponentSwitch;
    private String exchangeSwitch;
    private boolean powerUpForce;
    private boolean powerUpBoost;
    private boolean powerUpLevitate;
    private boolean anyCubeOnWrongSideScaleSwitch;
    private String estimatedTimeScalePossesion;
    private String estimatedTimeSwitchPossesion;
    private String estimatedOpponentSwitchPossesion;

    //Robot End Game Scouting

    private boolean notParkedOnPlatform;
    private boolean parkedOnPlatform;
    private boolean attemptedHookBar;
    private boolean attemptedAttachRobot;
    private boolean attemptedCarryRobot;
    private boolean hookedBarAttemptedClimb;
    private boolean successfulClimbOnAnotherRobot;
    private boolean succesfulClimbWithAnotherRobotAttached;
    private boolean succesfulClimbOwn;

    //Defense

    private boolean defendefAgainstOpponents;
    private boolean defensePlayedAgainstThem;
    private String penalties;

    public RobotScout(String scouterName, String teamNumber, String matchNumber, boolean crossedAutoLine, boolean noCubeAttempt
//            , boolean switchAttempted, boolean scaleAttempted, boolean scaleSuccessful, boolean switchSuccessful, boolean cube2Auto, boolean scale2CubeAuto, boolean switch2CubeAuto, boolean cube3Auto, boolean scale3CubeAuto, boolean switch3CubeAuto, boolean cubeWrongSideScaleSwitch, String allianceSwitch, String centerScale, String opponentSwitch, String exchangeSwitch, boolean powerUpForce, boolean powerUpBoost, boolean powerUpLevitate, boolean anyCubeOnWrongSideScaleSwitch, String estimatedTimeScalePossesion, String estimatedTimeSwitchPossesion, String estimatedOpponentSwitchPossesion, boolean notParkedOnPlatform, boolean parkedOnPlatform, boolean attemptedHookBar, boolean attemptedAttachRobot, boolean attemptedCarryRobot, boolean hookedBarAttemptedClimb, boolean successfulClimbOnAnotherRobot, boolean succesfulClimbWithAnotherRobotAttached, boolean succesfulClimbOwn, boolean defendefAgainstOpponents, boolean defensePlayedAgainstThem, String penalties
 ) {
        this.scouterName = scouterName;
        this.teamNumber = teamNumber;
        this.matchNumber = matchNumber;
        this.crossedAutoLine = crossedAutoLine;
        this.noCubeAttempt = noCubeAttempt;
//        this.switchAttempted = switchAttempted;
//        this.scaleAttempted = scaleAttempted;
//        this.scaleSuccessful = scaleSuccessful;
//        this.switchSuccessful = switchSuccessful;
//        this.cube2Auto = cube2Auto;
//        this.scale2CubeAuto = scale2CubeAuto;
//        this.switch2CubeAuto = switch2CubeAuto;
//        this.cube3Auto = cube3Auto;
//        this.scale3CubeAuto = scale3CubeAuto;
//        this.switch3CubeAuto = switch3CubeAuto;
//        this.cubeWrongSideScaleSwitch = cubeWrongSideScaleSwitch;
//        this.allianceSwitch = allianceSwitch;
//        this.centerScale = centerScale;
//        this.opponentSwitch = opponentSwitch;
//        this.exchangeSwitch = exchangeSwitch;
//        this.powerUpForce = powerUpForce;
//        this.powerUpBoost = powerUpBoost;
//        this.powerUpLevitate = powerUpLevitate;
//        this.anyCubeOnWrongSideScaleSwitch = anyCubeOnWrongSideScaleSwitch;
//        this.estimatedTimeScalePossesion = estimatedTimeScalePossesion;
//        this.estimatedTimeSwitchPossesion = estimatedTimeSwitchPossesion;
//        this.estimatedOpponentSwitchPossesion = estimatedOpponentSwitchPossesion;
//        this.notParkedOnPlatform = notParkedOnPlatform;
//        this.parkedOnPlatform = parkedOnPlatform;
//        this.attemptedHookBar = attemptedHookBar;
//        this.attemptedAttachRobot = attemptedAttachRobot;
//        this.attemptedCarryRobot = attemptedCarryRobot;
//        this.hookedBarAttemptedClimb = hookedBarAttemptedClimb;
//        this.successfulClimbOnAnotherRobot = successfulClimbOnAnotherRobot;
//        this.succesfulClimbWithAnotherRobotAttached = succesfulClimbWithAnotherRobotAttached;
//        this.succesfulClimbOwn = succesfulClimbOwn;
//        this.defendefAgainstOpponents = defendefAgainstOpponents;
//        this.defensePlayedAgainstThem = defensePlayedAgainstThem;
//        this.penalties = penalties;
    }


    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();

        result.put("scouterName",scouterName);
        result.put("teamMember",teamNumber);
        result.put("matchNumber",matchNumber);
        result.put("crossedAutoLine",crossedAutoLine);
        result.put("noCubeAttempt",noCubeAttempt);
//        result.put("switchAttempted",switchAttempted);
//        result.put("scaleAttempted",scaleAttempted);
//        result.put("scaleSuccessful",scaleSuccessful);
//        result.put("switchSuccessful",switchSuccessful);
//        result.put("cube2Auto",cube2Auto);
//        result.put("scale2CubeAuto",scale2CubeAuto);
//        result.put("switch2CubeAuto",switch2CubeAuto);
//        result.put("cube3Auto",cube3Auto);
//        result.put("scale3CubeAuto",scale3CubeAuto);
//        result.put("switch3CubeAuto",switch3CubeAuto);
//        result.put("cubeWrongSideScaleSwitch",cubeWrongSideScaleSwitch);
//        result.put("allianceSwitch",allianceSwitch);
//        result.put("centerScale",centerScale);
//        result.put("opponentSwitch",opponentSwitch);
//        result.put("exchangeSwitch",exchangeSwitch);
//        result.put("powerUpForce",powerUpForce);
//        result.put("powerUpBoost",powerUpBoost);
//        result.put("powerUpLevitate",powerUpLevitate);
//        result.put("anyCubeOnWrongSideScaleSwitch",anyCubeOnWrongSideScaleSwitch);
//        result.put("estimatedTimeScalePossesion",estimatedTimeScalePossesion);
//        result.put("estimatedTimeSwitchPossesion",estimatedTimeSwitchPossesion);
//        result.put("estimatedOpponentSwitchPossesion",estimatedOpponentSwitchPossesion);
//        result.put("notParkedOnPlatform",notParkedOnPlatform);
//        result.put("parkedOnPlatform",parkedOnPlatform);
//        result.put("attemptedHookBar",attemptedHookBar);
//        result.put("attemptedAttachRobot",attemptedAttachRobot);
//        result.put("attemptedCarryRobot",attemptedCarryRobot);
//        result.put("hookedBarAttemptedClimb",hookedBarAttemptedClimb);
//        result.put("successfulClimbOnAnotherRobot",successfulClimbOnAnotherRobot);
//        result.put("succesfulClimbWithAnotherRobotAttached",succesfulClimbWithAnotherRobotAttached);
//        result.put("succesfulClimbOwn",succesfulClimbOwn);
//        result.put("defendefAgainstOpponents",defendefAgainstOpponents);
//        result.put("defensePlayedAgainstThem",defensePlayedAgainstThem);
//        result.put("penalties",penalties);

        

        return result;
    }

}
