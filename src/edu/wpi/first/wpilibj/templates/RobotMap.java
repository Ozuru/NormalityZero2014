package edu.wpi.first.wpilibj.templates;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;

    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
    public static final int JOYSTICK_AXIS_DRIVE_LEFT = 2,
            JOYSTICK_AXIS_DRIVE_RIGHT = 6;

    public static final int PORT_DRIVETRAIN_LEFT_FR = 1,
            PORT_DRIVETRAIN_LEFT_BACK = 2,
            PORT_DRIVETRAIN_RIGHT_FR = 3,
            PORT_DRIVETRAIN_RIGHT_BACK = 4;
    
    public static final int PORT_WINCH = 6;
    
    public static final int PORT_COMPRESSOR_1 = 8,
                            PORT_COMPRESSOR_2 = 7;
    
    public static final int PORT_SHIFTER = 1;
    
    public static final int PORT_ARMS_FORW = 2,
                            PORT_ARMS_REV = 3;
    
    public static final int PORT_FINGERS_FORW = 4,
                            PORT_FINGERS_REV = 5;
    
    public static final int PORT_WINCH_LIMIT = 10;
}
