package org.usfirst.frc.team3205.robot.subsystems;

import org.usfirst.frc.team3205.robot.Robot;
import org.usfirst.frc.team3205.robot.RobotMap;

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
	//Encoder armEncoder;
	private DigitalInput armUpperLimit;
	private DigitalInput armLowerLimit;
	private DigitalInput armPortcullis;
	private SpeedController armMover;
	
	public Arm(){
//		armEncoder = new Encoder(4,5, false, Encoder.EncodingType.k4X);
		armUpperLimit = new DigitalInput(RobotMap.ARM_UPPER_LIMIT);
		armLowerLimit = new DigitalInput(RobotMap.ARM_LOWER_LIMIT);
		armPortcullis = new DigitalInput(RobotMap.ARM_PORTCULLIS_LIMIT);
		armMover = new Talon(RobotMap.ARM_MOTOR);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	//setDefaultCommand(new armDown());
    }
    
    public boolean isUpperLimitSet(){
    	return armUpperLimit.get();
    }
    
    public boolean isLowerLimitSet(){
    	return armLowerLimit.get();
    }
    
    public void moveUp(){
    	armMover.set(RobotMap.FLEX);
    }
    
    public void moveDown(){
    	armMover.set(-RobotMap.ARM_DOWN);
    }
   
    public void stopMoving(){
    	armMover.set(0.0);
    }
    
    public void moveUpSlow(){
    	armMover.set(.25);
    }
    
    public void moveDownSlow(){
    	armMover.set(.25);
    }
    public void resetEncoder(){
    	Robot.armEncoder.reset();
    }
    
    public int getEncoder(){
    	return Robot.armEncoder.getRaw();
    }

    public boolean isPortcullisLimitSet(){
    	return armPortcullis.get();
    }
    
    public void updateSmartDashboard(){
    	SmartDashboard.putNumber("Arm Encoder", getEncoder());
    	SmartDashboard.putBoolean("Arm Upper Limit", isUpperLimitSet());
    	SmartDashboard.putBoolean("Arm Lower Limit", isLowerLimitSet());
    	SmartDashboard.putBoolean("Portcullis Limit", isPortcullisLimitSet());
    }
}

