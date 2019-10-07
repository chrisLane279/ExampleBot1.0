/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        *///////////
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import frc.robot.Robot;
import frc.robot.constants;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.RobotDrive;

public class drivetrainSubsystem extends Subsystem {

public RobotDrive robotDrive;



  @Override
  public void initDefaultCommand() {
    




    // setDefaultCommand(new MySpecialCommand())
  }

public void DTInit(){

robotDrive = new RobotDrive(RobotMap.drivetrainLeft,RobotMap.drivetrainRight);


}


public void arcadeDrive(){

robotDrive.arcadeDrive(Robot.m_oi.driverStick, constants.kdriverLxAxis , Robot.m_oi.driverStick, constants.kdriverTriggerAxis);


}



public void creep(boolean x){

if(x==true){

robotDrive.drive(constants.kcreepSpeed,constants.kcreepCurve);

}



}

public void eStop(){

  RobotMap.drivetrainLeft.stopMotor();
  RobotMap.drivetrainRight.stopMotor();
  
  }
  


}


/*-------XBOX controller mapping--------
Buttons
1=A
2=B
3=X
4=Y
5=LB
6=RB
7=L menu button
8=R menu button
9=L stick button
10=R stick button

AXIS
0=LX axis
1=LY axis
2=LT axis (exclusively Y axis)
3=RT axis (exclusively Y axis)
4=RX axis
5=RY axis


*/