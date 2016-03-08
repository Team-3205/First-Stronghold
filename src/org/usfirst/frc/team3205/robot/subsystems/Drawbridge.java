package org.usfirst.frc.team3205.robot.subsystems;

import org.usfirst.frc.team3205.robot.RobotMap;
import org.usfirst.frc.team3205.robot.commands.drawbridgeRetract;

import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
//WRITTEN BY PROFESSIONAL STEVE!!!!!!

/**
 *
 */
public class Drawbridge extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private SpeedController drawbridgeMotor;
	private DigitalInput drawbridgeUpperLimit;
	private DigitalInput drawbridgeLowerLimit;
	Counter counter; 
	
	public Drawbridge() {
		drawbridgeMotor = new Talon(RobotMap.DRAWBRIDGE_MOTOR);
		drawbridgeUpperLimit = new DigitalInput(RobotMap.DRAWBRIDGE_UPPER_LIMIT);
		drawbridgeLowerLimit = new DigitalInput(RobotMap.DRAWBRIDGE_LOWER_LIMIT);
		counter = new Counter();
		counter.setUpSource(8);
		counter.setUpDownCounterMode();
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
       // setDefaultCommand(new drawbridgeRetract());
    }
    
    
    public double getDistance(){
    	return counter.getDistance();
    }
    
    public int get(){
    	return counter.get();
    }
    public boolean isUpperLimitSet() {
    	return drawbridgeUpperLimit.get();
    }
    
    public boolean isLowerLimitSet() {
    	return drawbridgeLowerLimit.get();
    }
    
    public void drawBridgeExtend(){
    	drawbridgeMotor.set(-RobotMap.DRAWBRIDGE_SPEED); 
    }
    
    public void drawBridgeRetract(){
    	drawbridgeMotor.set(RobotMap.DRAWBRIDGE_SPEED); 
    }
    
    public void stop(){
    	drawbridgeMotor.set(0); 
    }
    
    public void updateDashboard() {
    	SmartDashboard.putBoolean("Drawbridge Upper Limit", isUpperLimitSet());
    	SmartDashboard.putBoolean("Drawbridge Lower Limit", isLowerLimitSet());
    	SmartDashboard.putNumber("Drawbridge Distance", getDistance());
    }
}

