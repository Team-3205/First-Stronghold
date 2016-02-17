
package org.usfirst.frc.team3205.robot.subsystems;

import org.usfirst.frc.team3205.robot.OI;
import org.usfirst.frc.team3205.robot.RobotMap;
import org.usfirst.frc.team3205.robot.commands.drive;
import org.usfirst.frc.team3205.robot.commands.toggleDrive;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private SpeedController driveTopLeft, driveBottomLeft, driveTopRight, driveBottomRight;
	private RobotDrive robotDrive;
	Encoder one;
	Encoder two;
	
	public DriveTrain(){
		driveTopLeft = new Talon(RobotMap.DRIVE_TOP_LEFT);
		driveBottomLeft = new Talon(RobotMap.DRIVE_BOTTOM_LEFT);
		driveTopRight = new Talon(RobotMap.DRIVE_TOP_RIGHT);
		driveBottomRight = new Talon(RobotMap.DRIVE_BOTTOM_RIGHT);
		one = new Encoder(12,13, false, Encoder.EncodingType.k4X);
		two = new Encoder(14,15, false, Encoder.EncodingType.k4X);
		robotDrive = new RobotDrive(driveTopLeft, driveTopRight, driveBottomLeft, driveBottomRight);
		//robotDrive = new RobotDrive(RobotMap.DRIVE_TOP_LEFT, RobotMap.DRIVE_BOTTOM_LEFT, RobotMap.DRIVE_TOP_RIGHT, RobotMap.DRIVE_BOTTOM_RIGHT);
		robotDrive.setSafetyEnabled(false);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new toggleDrive());
    }
    
    public void driveNow(Joystick left, Joystick right){
    	driveTopLeft.setInverted(false);
    	driveBottomLeft.setInverted(false);
    	driveTopRight.setInverted(false);
    	driveBottomRight.setInverted(false);
    	robotDrive.tankDrive(left, right);
    }
    
    public void backwards(Joystick left, Joystick right){
    	driveTopLeft.setInverted(true);
    	driveBottomLeft.setInverted(true);
    	driveTopRight.setInverted(true);
    	driveBottomRight.setInverted(true);
    	robotDrive.tankDrive(left, right);
    }
    public void stop(){
    	robotDrive.tankDrive(0.0,0.0);
    }
    
    public void reset1stEncoder(){
    	one.reset();
    }
    
    public void reset2ndEncoder(){
    	two.reset();
    }
    
    public int getEncoderOne(){
    	return one.getRaw();
    }
   
    public int getEncoderTwo(){
    	return two.getRaw();
    }
    
    public void driveSequential(){
    	robotDrive.tankDrive(1.0, 1.0); 
    }
    
    public void driveBack(){
    	robotDrive.tankDrive(-1.0, -1.0);
    }
    
    public void updateSmartDashboard(){
    	SmartDashboard.putNumber("Drive Encoder One", getEncoderOne());
    	SmartDashboard.putNumber("Drive Encoder Two", getEncoderTwo());
    }
}

