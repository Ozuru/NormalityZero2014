/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.TankDrive;

/**
 *
 * @author Robotics
 */
public class DriveTrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private final Talon _leftfr = new Talon(RobotMap.PORT_DRIVETRAIN_LEFT_FR),
            _leftback = new Talon(RobotMap.PORT_DRIVETRAIN_LEFT_BACK),
            _rightfr = new Talon(RobotMap.PORT_DRIVETRAIN_RIGHT_FR),
            _rightback = new Talon(RobotMap.PORT_DRIVETRAIN_RIGHT_BACK);

    private final RobotDrive _drive = new RobotDrive(_leftfr, _leftback, _rightfr, _rightback);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new TankDrive());
    }
    
    public void invertMotors() {
        _drive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
        _drive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        _drive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        _drive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
    }
    
    public void tankDrive(double left, double right) {
        _drive.tankDrive(left, right);
    }
}
