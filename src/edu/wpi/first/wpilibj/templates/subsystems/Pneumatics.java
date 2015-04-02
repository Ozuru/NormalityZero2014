/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author Robotics
 */
public class Pneumatics extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private final DoubleSolenoid _fingers = new DoubleSolenoid(RobotMap.PORT_FINGERS_FORW, RobotMap.PORT_FINGERS_REV);
    private final DoubleSolenoid _arms = new DoubleSolenoid(RobotMap.PORT_ARMS_FORW, RobotMap.PORT_ARMS_REV);
    private final Solenoid _shifter = new Solenoid(RobotMap.PORT_SHIFTER);

    public void initDefaultCommand() {}

    public void setFingers(boolean up) {
        if (up) {
            _fingers.set(DoubleSolenoid.Value.kForward);
        } else {
            _fingers.set(DoubleSolenoid.Value.kReverse);
        }
    }

    public void setArms(boolean up) {
        if (up) {
            _arms.set(DoubleSolenoid.Value.kForward);
        } else {
            _arms.set(DoubleSolenoid.Value.kReverse);
        }
    }
    
    public void setShifter(boolean extended) {
        _shifter.set(extended);
    }

    public boolean getFingers() {
        if (_fingers.get() == DoubleSolenoid.Value.kForward) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getArms() {
        if (_arms.get() == DoubleSolenoid.Value.kForward) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean getShifter() {
        return _shifter.get();
    }
}
