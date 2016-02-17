package org.usfirst.frc.team3205.robot.subsystems;

import org.usfirst.frc.team3205.robot.RobotMap;
import org.usfirst.frc.team3205.robot.commands.armStart;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Arm extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Encoder armEncoder;
	private DigitalInput armUpperLimit;
	private DigitalInput armLowerLimit;
	private SpeedController armMover;
	
	public Arm(){
		armEncoder = new Encoder(10,11, false, Encoder.EncodingType.k4X);
		armUpperLimit = new DigitalInput(RobotMap.ARM_UPPER_LIMIT);
		armLowerLimit = new DigitalInput(RobotMap.ARM_LOWER_LIMIT);
		armMover = new Talon(RobotMap.ARM_MOTOR);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	//setDefaultCommand(new armStart());
    }
    
    public boolean isUpperLimitSet(){
    	return armUpperLimit.get();
    }
    
    public boolean isLowerLimitSet(){
    	return armLowerLimit.get();
    }
    
    public void moveUp(){
    	armMover.set(RobotMap.ARM_SPEED);
    }
    
    public void moveDown(){
    	armMover.set(-RobotMap.ARM_SPEED);
    }
   
    public void stopMoving(){
    	armMover.set(0.0);
    }
    
    public void resetEncoder(){
    	armEncoder.reset();
    }
    
    public int getEncoder(){
    	return armEncoder.getRaw();
    }
    
    public void updateSmartDashboard(){
    	SmartDashboard.putNumber("Arm Encoder", getEncoder());
    	SmartDashboard.putBoolean("Arm Upper Limit", isUpperLimitSet());
    	SmartDashboard.putBoolean("Arm Lower Limit", isLowerLimitSet());
    	
    }
}

