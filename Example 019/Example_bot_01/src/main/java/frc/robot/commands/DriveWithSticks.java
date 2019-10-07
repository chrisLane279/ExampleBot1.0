/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class DriveWithSticks extends Command {

   
  public DriveWithSticks() {
  
       requires(Robot.m_drivetrainsubsystem);
  }

  // Called just before this Command runs the first time
  protected void initialize() {
    Robot.m_drivetrainsubsystem.DTInit();
  
  }

  // Called repeatedly when this Command is scheduled to run
  protected void execute() {
Robot.m_drivetrainsubsystem.arcadeDrive();
  }

  // Make this return true when this Command no longer needs to run execute()
  protected boolean isFinished() {
      return false;//bot is always driving
  }

  // Called once after isFinished returns true
  protected void end() {
      Robot.m_drivetrainsubsystem.eStop();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  protected void interrupted() {
      end();
  }
}