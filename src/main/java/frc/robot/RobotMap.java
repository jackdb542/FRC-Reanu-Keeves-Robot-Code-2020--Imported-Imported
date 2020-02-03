/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.ADXL345_I2C.AllAxes;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {


public static final int ultrasonicPort = 0;

public static final int leftFrontPort = 2;
public static final int leftBackPort = 3;
public static final int rightFrontPort = 0;
public static final int rightBackPort = 1;
public static int joystickPort = 0;
public static int XBoxPort = 1;
public static int WheelDiameter = 6;

//Unused pnumatics variables
//public static int mechOnePort = 4;
//public static int mechTwoPort = 5;
//public static int pistonSolPort = 1;

}

