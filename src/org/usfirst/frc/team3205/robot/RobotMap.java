package org.usfirst.frc.team3205.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	//Speeds
	public static final double SHOOTER_MOVE_SPEED = 1.0;
	public static final double SHOOTER_SPEED = 1.0;
	public static final double ARM_SPEED = 1.0;
	public static final double DRAWBRIDGE_SPEED = 1.0; 
	
	//Arm Positions
	public static final int ARM_DRAWBRIDGE_UPPER_POSITION = 0;
//	public static final int ARM_SALLY_PORT_POSITION = 0;
	public static final int ARM_DRAWBRIDGE_LOWER_POSITION = 0;
	public static final int TALL_SALLY = 0; 
	public static final int SHORT_SALLY = 0;
	public static final int PORTCULLIS_POS = 0; 
	
	
	//Distances
	public static final int DISTANCE_PAST_OBSTACLE = 0;
	public static final int DRAWBRIDGE_DISTANCE = 0;
	public static final int AUTO_DISTANCE_TO_OBSTACLES = 0;
	public static final int AUTO_DISTANCE_OVER_EVERYTHING = 0;
	public static final int SALLYPORT_DISTANCE = 0; 
	public static final int PORTCULLIS_DISTANCE = 0; 
	
	//MOTORS
	public static final int DRIVE_TOP_LEFT = 2;				
	public static final int DRIVE_BOTTOM_LEFT = 3;
	public static final int DRIVE_TOP_RIGHT = 0;
	public static final int DRIVE_BOTTOM_RIGHT = 1;
	public static final int DRAWBRIDGE_MOTOR = 5;
	public static final int SHOOTER_SHOOTY = 4;
	public static final int SHOOTER_MOVEY = 7;
	public static final int ARM_MOTOR = 6;
	
	
	//SENSORS
	public static final int SHOOTER_UPPER_LIMIT = 4;
	public static final int SHOOTER_LOWER_LIMIT = 5;
	public static final int INTAKE_LIMIT = 6;
	public static final int DRAWBRIDGE_UPPER_LIMIT = 2;
	public static final int DRAWBRIDGE_LOWER_LIMIT = 3;
	public static final int ARM_UPPER_LIMIT = 1;
	public static final int ARM_LOWER_LIMIT = 0;
	
	// vars 
	public static boolean driveToggle = true; 
	public static boolean camOneStart = true;
	public static boolean camTwoStart = true;
}
