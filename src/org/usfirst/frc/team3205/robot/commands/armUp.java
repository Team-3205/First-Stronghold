package org.usfirst.frc.team3205.robot.commands;

import org.usfirst.frc.team3205.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class armUp extends Command {

    public armUp() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.arm);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.arm.moveUp();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(Robot.arm.isUpperLimitSet()){
    		Robot.arm.stopMoving();
    	}
    	if(Robot.arm.getEncoder() > 2700){
    		Robot.arm.moveUpSlow();
    	}
    	if(Robot.arm.isPortcullisLimitSet() && !Robot.arm.isLowerLimitSet()){
    		Robot.arm.moveDown();
    	}
    }
 
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	//return Robot.arm.isUpperLimitSet();
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
