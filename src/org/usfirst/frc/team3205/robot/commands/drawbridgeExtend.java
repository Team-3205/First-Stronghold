package org.usfirst.frc.team3205.robot.commands;

import org.usfirst.frc.team3205.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Extends the drawbridge 
 */
public class drawbridgeExtend extends Command {

    public drawbridgeExtend() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drawbridge);
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	if(!Robot.arm.isLowerLimitSet()){
    		Robot.drawbridge.drawBridgeExtend();
    	}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(Robot.drawbridge.isUpperLimitSet()){
    		Robot.drawbridge.stop();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	//return Robot.drawbridge.isUpperLimitSet();
    	return false;
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
