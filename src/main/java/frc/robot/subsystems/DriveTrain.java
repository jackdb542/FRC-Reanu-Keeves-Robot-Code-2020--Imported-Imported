/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;

public class DriveTrain extends Subsystem {
  /**
   * Creates a new Robot_Base_Drivetrain. Base drive for basic movement of robot, only Y and R movements
   */
    
        final VictorSP leftFront = new VictorSP(RobotMap.leftFrontPort);
        final VictorSP rightFront = new VictorSP(RobotMap.rightFrontPort);
        final VictorSP leftRear = new VictorSP(RobotMap.leftBackPort);
        final VictorSP rightRear = new VictorSP(RobotMap.rightBackPort);
    
        // left motor group
        final SpeedControllerGroup m_left = new SpeedControllerGroup(leftFront, leftRear);
        // right motor group
        final SpeedControllerGroup m_right = new SpeedControllerGroup(rightFront, rightRear);

        // drivetrain group of left and right
        final DifferentialDrive drive = new DifferentialDrive(m_left, m_right);

        // motors grouped in 2 different functions basec on location, in this case, divided into 2 speed groups, left and right motor groups
        
        // motors are based on a 0.00-1.00 speed scale, 0.00 being no speed and 1.00 being the fastest. Any higher than 1.00 alters turing sensitivity and makes the robot relativly unreliable
        final int inputCurve = 4;
        final double RFM = -1;
        final double RBM = 1;
        final double LBM = -1;
        final double LFM = 1;
    
          public void Drivetrain() {
            drive.setDeadband(0.03);
        // deadband is sensitivity for motor control, to determine how far the joystick needs to go to give out an output for a certain value 
        }
      
        public void manualDrive(double x, double y, double r) {
            // halve the turning power, reason for this is to not risk any damage done to motors during testing, only should be set higher during comp
            // r*= X, where r is the turning sensitivity speed, samething on a scale from 0.00 to 1.00, the higher the faster the iteration will turn
            r *= 0.75;// *9*/
            // front wheel power is linked to rear wheel power so these two are really left
            // power and right power
            // left front power
            double lfpower = +y + r;
            double rfpower = -y + r;
    
            // some math that I dont know, stole from old robot code that was working
            lfpower = Math.signum(lfpower) * (Math.pow(inputCurve, Math.abs(lfpower)) - 1) / (inputCurve - 1);
            rfpower = Math.signum(rfpower) * (Math.pow(inputCurve, Math.abs(rfpower)) - 1) / (inputCurve - 1);
            // false is for squared input, if too sensitive change to true
            drive.tankDrive(rfpower * -RFM, lfpower * -LFM, false);
    
        }
    

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  protected void initDefaultCommand() {
    
  }
}
