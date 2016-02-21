package org.usfirst.frc.team3205.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Autonomous drawBridge arm attachment 
 */
public class drawbridgeGroup extends CommandGroup {
    
    public  drawbridgeGroup() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
  
    	// Extending and retracting drawBridge arm 
    	addSequential(new armToUpperDrawbridge());
    	addSequential(new drawbridgeExtend());
    	addSequential(new autoDrawbridgeMove());
    	addParallel(new armToLowerDrawbridge());
    	addSequential(new autoDrawbridgeDriveBack()); 
    	addParallel(new drawbridgeRetract());
    	addSequential(new armDown());
    	addSequential(new drivePastStuff()); 
    }
}
