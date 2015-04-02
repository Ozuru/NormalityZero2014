/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.templates.Mechatron;

/**
 *
 * @author Robotics
 */
public class TankDrive extends CommandBase {
    
     public TankDrive() {
        requires(Mechatron._driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {}

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double left = Mechatron.oi.getLeftDrive();
    	double right = Mechatron.oi.getRightDrive();
    	Mechatron._driveTrain.tankDrive(left, right);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        System.out.println("I got interupted!");
    }
}
