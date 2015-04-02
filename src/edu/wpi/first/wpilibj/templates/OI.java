package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.templates.commands.ChargeCatapult;
import edu.wpi.first.wpilibj.templates.commands.DefuseCatapult;
import edu.wpi.first.wpilibj.templates.commands.FireCatapult;
import edu.wpi.first.wpilibj.templates.commands.StopCatapult;
import edu.wpi.first.wpilibj.templates.commands.ToggleArms;
import edu.wpi.first.wpilibj.templates.commands.ToggleFingers;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    Joystick driverStick = new Joystick(1);
    Joystick shooterStick = new Joystick(2);

    Button driverButton1 = new JoystickButton(driverStick, 1),
            driverButton2 = new JoystickButton(driverStick, 2),
            driverButton3 = new JoystickButton(driverStick, 3),
            driverButton4 = new JoystickButton(driverStick, 4),
            _arms = new JoystickButton(driverStick, 5),
            _fingers = new JoystickButton(driverStick, 6),
            driverButton7 = new JoystickButton(driverStick, 7),
            driverButton8 = new JoystickButton(driverStick, 8),
            driverButton9 = new JoystickButton(driverStick, 9),
            driverButton10 = new JoystickButton(driverStick, 10);

    Button  _fire = new JoystickButton(shooterStick, 1),
            _safety = new JoystickButton(shooterStick, 2),
            _crankDat = new JoystickButton(shooterStick, 3),
            _uncrankDat = new JoystickButton(shooterStick, 4),
            shooterButton5 = new JoystickButton(shooterStick, 5),
            shooterButton6 = new JoystickButton(shooterStick, 6),
            shooterButton7 = new JoystickButton(shooterStick, 7),
            shooterButton8 = new JoystickButton(shooterStick, 8),
            shooterButton9 = new JoystickButton(shooterStick, 9),
            shooterButton10 = new JoystickButton(shooterStick, 10),
            _stop = new JoystickButton(shooterStick, 11),
            shooterButton12 = new JoystickButton(shooterStick, 12);
    
    public OI() {
        _crankDat.whileHeld(new ChargeCatapult());
        _uncrankDat.whileHeld(new DefuseCatapult());
        _arms.whenPressed(new ToggleArms());
        _fingers.whenPressed(new ToggleFingers());
        _stop.whenPressed(new StopCatapult());
        _fire.whenPressed(new FireCatapult());
    }

    public double _zeroDeadzone(double joyValue, double dead) {
        return Math.abs(joyValue) > dead ? joyValue : 0;
    }

    public double getLeftDrive() {
        return _zeroDeadzone(driverStick.getRawAxis(RobotMap.JOYSTICK_AXIS_DRIVE_LEFT), 0.15);
    }

    public double getRightDrive() {
        return _zeroDeadzone(driverStick.getRawAxis(RobotMap.JOYSTICK_AXIS_DRIVE_RIGHT), 0.15);
    }

    public double getSliderVal() {
        return shooterStick.getRawAxis(3);
    }

}
