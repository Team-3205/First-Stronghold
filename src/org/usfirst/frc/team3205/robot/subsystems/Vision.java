package org.usfirst.frc.team3205.robot.subsystems;

import com.ni.vision.NIVision.Image;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Vision extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	CameraServer server; 
	Image frame; 
	int cameraOne, cameraTwo; 
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

