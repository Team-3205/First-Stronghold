package org.usfirst.frc.team3205.robot.subsystems;



//import org.usfirst.frc.team3205.robot.commands.updateCam;

import org.usfirst.frc.team3205.robot.RobotMap;
import org.usfirst.frc.team3205.robot.commands.cameraOneInit;

import com.ni.vision.NIVision;
import com.ni.vision.NIVision.Image;
import com.ni.vision.NIVision.ImageType;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Vision extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	double AREA_MINIMUM = 0.5;
	CameraServer server, serverOne;
	Image frame;
	Image binaryFrame;
	int imaqError;
	//int session;
	int cameraOne, cameraTwo;
	//NIVision.ParticleFilterCriteria2 criteria[] = new NIVision.ParticleFilterCriteria2[1];
	
	public Vision(){
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	//setDefaultCommand(new ());
    	//setDefaultCommand(new cameraOneInit());
    }
    
    public void changeVision(){
    	
    }
    
//    public void camOneInit(boolean cameraStopToggle){
//    	if(!cameraStopToggle){ 
//	    	NIVision.IMAQdxStartAcquisition(cameraOne);
//	    	NIVision.IMAQdxGrab(cameraOne, frame, 1);
//	    	CameraServer.getInstance().setImage(frame);
//    	}
//    	else{	
//   
//    		NIVision.IMAQdxStopAcquisition(cameraOne);
//    	}
//    }
//    public void cameTwoInit(boolean cameraStopToggle){
//    	if(!cameraStopToggle){ 
//	    	NIVision.IMAQdxStartAcquisition(cameraTwo);
//	    	NIVision.IMAQdxGrab(cameraTwo, frame, 1);
//	    	CameraServer.getInstance().setImage(frame);
//    	}
//    	else{	
//    		NIVision.IMAQdxStopAcquisition(cameraOne);
//    	}
//    }
    
}

