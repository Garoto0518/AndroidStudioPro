package com.garoto.musscout;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by felix & Garoto on 2/19/2018.
 */

public class RobotScout {

    private String scouterName;
    private String teamNumber;
    private String matchNumber;


    //Auto
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
    private String ownershipPoints;
    private String vaultPoints;
//    private String estimatedOpponentSwitchPossesion;

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

    private boolean defenseAgainstOpponents;
    private boolean defensePlayedAgainstThem;
    private String penalties;

    public RobotScout(String scouterName, String teamNumber, String matchNumber,
                      boolean crossedAutoLine, boolean noCubeAttempt, boolean switchAttempted, boolean scaleAttempted, boolean scaleSuccessful,
                      boolean switchSuccessful, boolean cube2Auto, boolean scale2CubeAuto, boolean switch2CubeAuto, boolean cube3Auto, boolean scale3CubeAuto,
                      boolean switch3CubeAuto, boolean cubeWrongSideScaleSwitch, String allianceSwitch, String centerScale,
                      String opponentSwitch, String exchangeSwitch, boolean powerUpForce, boolean powerUpBoost, boolean powerUpLevitate, boolean anyCubeOnWrongSideScaleSwitch,
                      String ownershipPoints, String vaultPoints, boolean notParkedOnPlatform, boolean parkedOnPlatform, boolean attemptedHookBar,
                      boolean attemptedAttachRobot, boolean attemptedCarryRobot, boolean hookedBarAttemptedClimb, boolean successfulClimbOnAnotherRobot, boolean succesfulClimbWithAnotherRobotAttached,
                      boolean succesfulClimbOwn, boolean defenseAgainstOpponents, boolean defensePlayedAgainstThem, String penalties) {
        // String estimatedOpponentSwitchPossesion,
        this.scouterName = scouterName;
        this.teamNumber = teamNumber;
        this.matchNumber = matchNumber;
        this.crossedAutoLine = crossedAutoLine;
        this.noCubeAttempt = noCubeAttempt;

        this.switchAttempted = switchAttempted;
        this.scaleAttempted = scaleAttempted;
        this.scaleSuccessful = scaleSuccessful;
        this.switchSuccessful = switchSuccessful;
        this.cube2Auto = cube2Auto;
        this.scale2CubeAuto = scale2CubeAuto;
        this.switch2CubeAuto = switch2CubeAuto;
        this.cube3Auto = cube3Auto;
        this.scale3CubeAuto = scale3CubeAuto;
        this.switch3CubeAuto = switch3CubeAuto;
        this.cubeWrongSideScaleSwitch = cubeWrongSideScaleSwitch;
        this.allianceSwitch = allianceSwitch;
        this.centerScale = centerScale;
        this.opponentSwitch = opponentSwitch;
        this.exchangeSwitch = exchangeSwitch;
        this.powerUpForce = powerUpForce;
        this.powerUpBoost = powerUpBoost;
        this.powerUpLevitate = powerUpLevitate;
        this.anyCubeOnWrongSideScaleSwitch = anyCubeOnWrongSideScaleSwitch;
        this.ownershipPoints = ownershipPoints;
        this.vaultPoints = vaultPoints;
        //   this.estimatedOpponentSwitchPossesion = estimatedOpponentSwitchPossesion;
        this.notParkedOnPlatform = notParkedOnPlatform;
        this.parkedOnPlatform = parkedOnPlatform;
        this.attemptedHookBar = attemptedHookBar;
        this.attemptedAttachRobot = attemptedAttachRobot;
        this.attemptedCarryRobot = attemptedCarryRobot;
        this.hookedBarAttemptedClimb = hookedBarAttemptedClimb;
        this.successfulClimbOnAnotherRobot = successfulClimbOnAnotherRobot;
        this.succesfulClimbWithAnotherRobotAttached = succesfulClimbWithAnotherRobotAttached;
        this.succesfulClimbOwn = succesfulClimbOwn;
        this.defenseAgainstOpponents = defenseAgainstOpponents;
        this.defensePlayedAgainstThem = defensePlayedAgainstThem;
        this.penalties = penalties;
    }


    //Mapa
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();

        result.put("Scouter Name", scouterName);
        result.put("Team Number", teamNumber);
        result.put("Match Number", matchNumber);
        result.put("Crossed AutoLine", crossedAutoLine);
        result.put("NoCube Attempt", noCubeAttempt);

        result.put("Switch Attempted", switchAttempted);
        result.put("Scale Attempted", scaleAttempted);
        result.put("Scale Successful", scaleSuccessful);
        result.put("Switch Successful", switchSuccessful);
        result.put("2 CubeAuto", cube2Auto);
        result.put("2 Scale CubeAuto", scale2CubeAuto);
        result.put("2 Switch CubeAuto", switch2CubeAuto);
        result.put("3 cubeAuto", cube3Auto);
        result.put("3 Scale CubeAuto", scale3CubeAuto);
        result.put("switch3CubeAuto", switch3CubeAuto);
        result.put("Cube on WrongSide of ScaleSwitch", cubeWrongSideScaleSwitch);
        result.put("Alliance Switch Cubes", allianceSwitch);
        result.put("Center Scale Cube", centerScale);
        result.put("Opponent Switch Cube", opponentSwitch);
        result.put("Exchange Switch Cube", exchangeSwitch);
        result.put("Force PowerUp", powerUpForce);
        result.put("Boost PowerUp", powerUpBoost);
        result.put("Levitate PowerUp", powerUpLevitate);
        result.put("Cubes on wrong side Scale", anyCubeOnWrongSideScaleSwitch);
        result.put("Ownership Points", ownershipPoints);
        result.put("Vault Points", vaultPoints);
        // result.put("estimatedOpponentSwitchPossesion", estimatedOpponentSwitchPossesion);
        result.put("Not Parked on Platform", notParkedOnPlatform);
        result.put("Parked On Platform", parkedOnPlatform);
        result.put("Attempted to HookBar", attemptedHookBar);
        result.put("Attempted to Attach to a Robot", attemptedAttachRobot);
        result.put("Attempted to Carry a Robot", attemptedCarryRobot);
        result.put("Hooked to Bar AttemptedClimb", hookedBarAttemptedClimb);
        result.put("Successful Climb On AnotherRobot", successfulClimbOnAnotherRobot);
        result.put("Successful ClimbWithAnotherRobotAttached", succesfulClimbWithAnotherRobotAttached);
        result.put("Successful ClimbOwn", succesfulClimbOwn);
        result.put("Defended Against Opponents", defenseAgainstOpponents);
        result.put("Defense Played AgainstThem", defensePlayedAgainstThem);
        result.put("Penalties", penalties);


        return result;
    }

}
