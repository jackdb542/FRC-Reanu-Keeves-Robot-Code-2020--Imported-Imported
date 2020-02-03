/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.color_wheel_subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.RobotMap;

/**
 * This is a sample program demonstrating how to use an ultrasonic sensor and
 * proportional control to maintain a set distance from an object.
 */

public class UltraSonic_Sensor {

  // factor to convert sensor values to a distance in inches
  private static final double conversion = 0.125;

  private final AnalogInput m_ultrasonic = new AnalogInput(RobotMap.ultrasonicPort);

  public double getDistance() {

    // sensor returns a value from 0-4095 that is scaled to inches
    return m_ultrasonic.getValue() * conversion;

  }
}
