package org.usfirst.frc.team3205.robot.commands;

import org.usfirst.frc.team3205.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class intake extends Command {

	private double time;
    public intake() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.shootey);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.shootey.intake();
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	try{
    		Thread.sleep(1000);
    		if(Robot.shootey.isIntakeSet()) Robot.shootey.stopShooting();
    			
    	} catch(Exception e){}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.shootey.stopShooting();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.shootey.stopShooting();
    }
}
