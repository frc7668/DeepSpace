/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.LiftFrontStop;

/**
 * Add your docs here.
 */
public class LiftFront extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public static Spark mc = new Spark(2);
  //public static Spark mc_back = new Spark(3);
  //public static Victor mc_back = new Victor();
  //public static Victoe mc_move =  new Victor();

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
   setDefaultCommand(new LiftFrontStop());

  
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

 

}
