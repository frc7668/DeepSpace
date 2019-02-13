/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.HatchStop;

/**
 * Add your docs here.
 */
public class HatchPanel extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  //public static Talon hatchTalon =new Talon(0);
  public static SpeedController sc_1 = new Victor(0);
  public static DigitalInput limit_switch_down = new DigitalInput(1);
  public static DigitalInput limit_switch_up = new DigitalInput(0);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new HatchStop());

  }

  public void hatchDown(){
    sc_1.set(.4);
}

  public void hatchUp(){
      sc_1.set(-.4);
  }

  public void hatchStop(){
      sc_1.set(0);
}

  public boolean get_limit_switch_down(){
    return limit_switch_down.get();
}

public boolean get_limit_switch_up(){
  return limit_switch_up.get();
}

}
