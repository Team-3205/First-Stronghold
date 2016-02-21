package org.usfirst.frc.team3205.robot.commands;

import org.usfirst.frc.team3205.robot.Robot;
import org.usfirst.frc.team3205.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class autoDrawbridgeDriveBack extends Command {
	
	private int initCount;

    public autoDrawbridgeDriveBack() {
        // Use requires()s here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drivetrain);
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
    	return Robot.drivetrain.getEncoderOne()-initCount == RobotMap.DRAWBRIDGE_DISTANCE;
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
