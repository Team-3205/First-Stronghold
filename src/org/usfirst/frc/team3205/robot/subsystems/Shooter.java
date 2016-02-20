package org.usfirst.frc.team3205.robot.subsystems;

import org.usfirst.frc.team3205.robot.RobotMap;
import org.usfirst.frc.team3205.robot.commands.shooterStart;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Shooter extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private SpeedController shooterShoot;
	private SpeedController shooterMove;
	private DigitalInput shooterUpperLimit;
	private DigitalInput shooterLowerLimit;
	private DigitalInput intakeLimit;
	Encoder moveEncoder;

	public Shooter(){
		shooterShoot = new Talon(RobotMap.BAM_BAM);
		shooterMove = new Talon(RobotMap.SHOOTER_MOVEY);
		shooterUpperLimit = new DigitalInput(RobotMap.SHOOTER_UPPER_LIMIT);
		shooterLowerLimit = new DigitalInput(RobotMap.SHOOTER_LOWER_LIMIT);
		intakeLimit = new DigitalInput(RobotMap.INTAKE_LIMIT);
		moveEncoder = new Encoder(6,7, false, Encoder.EncodingType.k4X);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new shooterStart());
    }
    
    public void resetEnc(){
    	moveEncoder.reset();
    }
    
    public int getEncoder(){
    	return moveEncoder.getRaw();
    }
    
    public void shoot(){
    	shooterShoot.set(RobotMap.SPIT_SPEED);
    }
    
    public void intake(){
    	shooterShoot.set(-RobotMap.INTAKE_SPEED);
    }
    
    public void stopShooting(){
    	shooterShoot.set(0.0);
    }
    
    public void moveUp(){
    	shooterMove.set(RobotMap.SHOOTER_UP);
    }
    
    public void moveDown(){
    	shooterMove.set(-RobotMap.SHOOTER_DOWN);
    }
    
    public void stopMoving(){
    	shooterMove.set(0.0);
    }
    
    
    
    public boolean isUpperLimitSet(){
    	return shooterUpperLimit.get();
    }
    
    public boolean isLowerLimitSet(){
    	return shooterLowerLimit.get();
    }
    
    public boolean isIntakeSet(){
    	return intakeLimit.get();
    }
    
    public void updateDashboard(){
    	SmartDashboard.putBoolean("Shooter Upper Limit", isUpperLimitSet());
    	SmartDashboard.putBoolean("Shooter Lower Limit", isLowerLimitSet());
    	SmartDashboard.putBoolean("Intake Limit", isIntakeSet());
    	SmartDashboard.putNumber("Shooter Move Encoder", getEncoder());
    }
}

