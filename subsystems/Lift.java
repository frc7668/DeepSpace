/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class Lift extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  //public static Victor mc_front = new Victor(0);
  //public static Victor mc_back = new Victor();
  //public static Victoe mc_move =  new Victor();

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());

  
  }

  public void front_up(){
   // mc_front.set(.2);
  }

  //public void back_up(){
   // mc_back.set(.2);
 // }

  public void front_down(){
    //mc_front.set(-.2);
  }

   //public void back_down(){
   // mc_back.set(-.2);
 // }

  public void all_stop(){
    //mc_front.set(0);
    //mc_back.set(0);
  }

}
