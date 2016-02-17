package org.usfirst.frc.team3205.robot.commands;

import org.usfirst.frc.team3205.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Retracts the arm 
 */
public class drawbridgeRetract extends Command {

    public drawbridgeRetract() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drawbridge); 
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.drawbridge.drawBridgeRetract(); 
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(Robot.drawbridge.isLowerLimitSet()){
    		Robot.drawbridge.stop();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return Robot.drawbridge.isLowerLimitSet();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drawbridge.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.drawbridge.stop(); 
    }
}
