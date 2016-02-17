package org.usfirst.frc.team3205.robot.commands;

import org.usfirst.frc.team3205.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Stops the arm from moving - restarts it 
 */
public class armStart extends Command {

    public armStart() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.arm);
    	requires(Robot.drawbridge);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.arm.moveDown();
    	Robot.arm.resetEncoder();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {

    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if(Robot.arm.isLowerLimitSet()){
        	return true;
        }
        else{
        	return false;
        }
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
