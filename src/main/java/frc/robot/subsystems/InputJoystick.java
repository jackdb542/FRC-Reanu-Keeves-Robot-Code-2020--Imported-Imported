/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
//1import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class InputJoystick extends Subsystem {
   /**
   * Creates a new RB_Inputs.
   */
    // All Y and R axis movements for Iteration Base which are linked via RobotMap.java
      double x = 0.0;
      double y = 0.5;
      double r = 0.5;
      double voltage = 0.0;

      //public InputJoystick(XboxController xbox, double voltage) {
        //x = xbox.getX();
        //y = xbox.getY();
        //r = xbox.getTwist();
            //this.voltage = voltage;
            
      public void InputButton(){
        
      }
      // 2018-2019 Pneumatic Controller Map
          //public InputJoystick(XboxController box, double voltage) {
            //pistonUp = box.getRawButton(1);
            //pistonDown = box.getRawButton(4);
            //up = box.getRawButton(5);
            //down = box.getRawButton(6);
            //mechUp = box.getRawButton(7);
            //mechDown = box.getRawButton(8);
              //this.voltage = voltage;
      

  //public InputJoystick(final XboxController xbox, final double d) {
  //}

  public double getX() {
    return x;
  }

  public void setX(double value) {
    x = value;
  }

  public double getY() {
    return y;
  }

  public void setY( double value) {
    y = value;
  }

  public double getTwist() {
    return r;
  }

  public void setTwist(double value) {
    r = value;
  }
    

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }





  @Override
  protected void initDefaultCommand() {
    
  }
}