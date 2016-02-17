package org.usfirst.frc.team3205.robot.commands;

import org.usfirst.frc.team3205.robot.Robot;
import org.usfirst.frc.team3205.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class portcullisRaise extends Command {
	private int initCount; 
    public portcullisRaise() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.arm); 
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.arm.moveUp(); 
    	//initCount = Robot.arm.getEncoder(); 
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
      	if(Robot.arm.isUpperLimitSet()){
    		Robot.arm.stopMoving();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() { 
        //return Robot.arm.getEncoder() - initCount == RobotMap.PORTCULLIS_POS;
        //return Robot.arm.getEncoder() == RobotMap.PORTCULLIS_POS;
    	return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.arm.stopMoving();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.arm.stopMoving();
    }
}
