/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.kauailabs.navx.frc.AHRS;
//import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.commands.DriveJoystick;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

 //public static ADXRS450_Gyro gyroSPI = new ADXRS450_Gyro();


 //public static AHRS ahrs= new AHRS(SPI.Port.kMXP);

 // speed controllers
 public static WPI_TalonSRX srx_1 = new WPI_TalonSRX(1);
 public static WPI_TalonSRX srx_2 = new WPI_TalonSRX(2);
 public static WPI_TalonSRX srx_3 = new WPI_TalonSRX(3);
 public static WPI_TalonSRX srx_4 = new WPI_TalonSRX(4);


 // speed controller groups
 public SpeedControllerGroup scg_right;
 public SpeedControllerGroup scg_left;

 public DifferentialDrive diff_drive ;
 
 public DriveTrain(){

  scg_right = new SpeedControllerGroup(srx_1,srx_2);
  scg_left = new SpeedControllerGroup(srx_3,srx_4);
  diff_drive= new DifferentialDrive(scg_right, scg_left);
  

 }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new DriveJoystick());
  }
  public double getAngle() {

    return 3; //ahrs.getAngle();

  }

  //public void tank_drive(double l, double r){

  //}

 // public double getLeftEncoderDistance() {
 //   return left2.getSelectedSensorPosition(0) * RobotMap.inchesPerPulse;
 // }

  //public double getRightEncoderDistance() {
  //  return right2.getSelectedSensorPosition(0) * RobotMap.inchesPerPulse;
  //}

  //public void tank(double leftSpeed, double rightSpeed) {
  //  my_drive.tankDrive(leftSpeed, rightSpeed);
  //  }

  //public void resetEncoders() {
  //  left2.setSelectedSensorPosition(0, 0, 0);
  //  right2.setSelectedSensorPosition(0, 0, 0);
  //  System.out.println("Encoders reset.");
  //}

  //public void stop() {
  //  left1.set(ControlMode.PercentOutput, 0);
  //  left2.set(ControlMode.PercentOutput, 0);
  //  right1.set(ControlMode.PercentOutput, 0);
  //  right2.set(ControlMode.PercentOutput, 0);
  //}

  //public void setLeftSpeed(double speed) {
  //  left1.set(ControlMode.PercentOutput, speed);
  //  left2.set(ControlMode.PercentOutput, speed);
  //}

  //public void setRightSpeed(double speed) {
  //  right1.set(ControlMode.PercentOutput, -speed);
  //  right2.set(ControlMode.PercentOutput, -speed);
  //}



}
