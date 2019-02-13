/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import frc.robot.commands.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * Add your docs here.
 */
public class OI {
    public static final Joystick joystick_f310 = new Joystick(0);
    public static JoystickButton button_a;
    public static JoystickButton button_y;
//test
    public static JoystickButton button_x;
    public static JoystickButton button_b;

     //f310 joystick mapping id
  // axiss
  private static final int id_left_stick_x = 0;
  private static final int id_left_stick_y = 1;
  private static final int id_left_trigger = 2;
  private static final int id_right_trigger = 3;
  private static final int id_right_stick_x = 4;
  private static final int id_right_stick_y = 5;
  // buttons
  private static final int id_button_a = 1;
  private static final int id_button_b = 2;
  private static final int id_button_x = 3;
  private static final int id_button_y = 4;
  private static final int id_left_bumper = 5;
  private static final int id_right_bumper = 6;
  private static final int id_button_back = 7;
  private static final int id_button_start = 8;
  private static final int id_button_left_stick = 9;
  private static final int id_button_right_stick = 10;

  OI(){

    button_a = new JoystickButton(joystick_f310, id_button_a);
    button_y = new JoystickButton(joystick_f310, id_button_y);

    button_x = new JoystickButton(joystick_f310, id_button_x);
    button_b = new JoystickButton(joystick_f310, id_button_b);


   // button_a.whileHeld(new testCommand());

   button_y.whileHeld(new UpHatchPanel());
   button_a.whileHeld(new HatchDown());
   //testing
   button_x.whileHeld(new UpFrontLift());
   button_b.whileHeld(new DownFrontLift());


  }



}
