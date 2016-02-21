package org.usfirst.frc.team3205.robot.commands;

import org.usfirst.frc.team3205.robot.Robot;
import org.usfirst.frc.team3205.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class sallyPortDriveBack extends Command {

	private int initCount; 
	
    public sallyPortDriveBack() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.arm); 
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.drivetrain.driveBackSlow();
    	initCount = Robot.drivetrain.getEncoderOne();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	
    	return Robot.drivetrain.getEncoderOne()-initCount == RobotMap.SALLYPORT_DISTANCE;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
