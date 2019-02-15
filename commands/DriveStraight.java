/*package org.usfirst.frc.team7668.robot.commands;

import org.usfirst.frc.team7668.robot.Robot;
import org.usfirst.frc.team7668.robot.RobotMap;
import org.usfirst.frc.team7668.robot.subsystems.*;

import edu.wpi.first.wilibj.*;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;

public class DriveStraight extends Command {
    Timer timer;
    private double speed;
    double gyro_adj = 0.0;
    double temp = 0.5;
    double k1 = 0.002;
    int epsilon = 2;
    double targetDistance;
    double u;

    public DriveStraight(double distance, double speed) {
        this.speed = speed;
        targetDistance = distance;
    }

    public void resetEncoders() {
        Robot.drive_train.left2.setSelectedSensorPosition(0, 0, 0);
        Robot.drive_train.right2.setSelectedSensorPosition(0, 0, 0);
    }

    public double getRightEncoderDistance() {
        return frc.robot.Robot.drive_train.right2.getSelectedSensorPosition(0) * RobotMap.inchesPerPulse;
    }

    public double getRightEncoderDistance() {
        return frc.robot.Robot.drive_train.right2.getSelectedSensorPosition(0) * RobotMap.inchesPerPulse;
    }
    //WE ARE NOT DONE COPYING DRIVESTRAIGHT.JAVA
}*/