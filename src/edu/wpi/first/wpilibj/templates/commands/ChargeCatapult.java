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
public class ChargeCatapult extends CommandBase {
    
    public ChargeCatapult() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Mechatron._winch);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if(!Mechatron._winch.isLimSwitch()) {
            Mechatron._winch.setWinch(-((Mechatron.oi.getSliderVal() + 1) / 2));
        } else {
            end();
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Mechatron._winch.isLimSwitch();
    }

    // Called once after isFinished returns true
    protected void end() {
        Mechatron._winch.stopWinch();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
