/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.LiftBackStop;

/**
 * Add your docs here.
 */
public class LiftBack extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public static Spark mc = new Spark(3);
  //public static Spark mc_roll = new Spark(xxxxx);
  

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
     setDefaultCommand(new LiftBackStop());

  
  }

  public void up(){
    System.out.println("lift up method");
    mc.set(1);
  }

 

  public void down(){
    mc.set(-1);
  }

 

  public void stop(){
    mc.set(0);
    //mc_back.set(0);
  }

  public void roll_forward(){
    //mc_roll.set(1);
    
  }

  public void roll_backwards(){
   // mc_roll.set(-1);
  }

   public void roll_stop(){
    // mc_roll.set(0);
   
  }

 
  
}
