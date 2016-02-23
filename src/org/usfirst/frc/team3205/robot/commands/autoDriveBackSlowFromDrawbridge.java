package org.usfirst.frc.team3205.robot.commands;

import org.usfirst.frc.team3205.robot.Robot;
import org.usfirst.frc.team3205.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class autoDriveBackSlowFromDrawbridge extends Command {

	long start;
	private int initCount;
    public autoDriveBackSlowFromDrawbridge() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	start = System.currentTimeMillis();
    	//initCount = Robot.drivetrain.getEncoderOne();
    	Robot.drivetrain.driveBackSlow();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(System.currentTimeMillis() - start == 200){
    		Robot.drivetrain.stop();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivetrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.drivetrain.stop();
    }
}
