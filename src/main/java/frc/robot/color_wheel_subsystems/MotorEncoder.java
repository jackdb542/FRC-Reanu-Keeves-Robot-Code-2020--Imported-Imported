/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.color_wheel_subsystems;

import edu.wpi.first.wpilibj.Encoder;

public class MotorEncoder {
  /**
   * Creates a new Encoder.
   */
  Encoder thisEncoder;

  public MotorEncoder(int port1,int port2) {
    thisEncoder = new Encoder(port1,port2);
  }
  
  public double distance(){
     return thisEncoder.getDistance();
  }
}