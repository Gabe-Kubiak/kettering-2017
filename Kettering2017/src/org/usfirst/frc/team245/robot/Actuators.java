package org.usfirst.frc.team245.robot;

//import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Talon;

/**
 * All of our robot's actuators including motors and pneumatics
 */
public class Actuators {
	public static double MIN_MOTOR_SPEED = -1;
	public static double MAX_MOTOR_SPEED = 1;
	
	//CONSTANTS
	
	//The PID constants for the arm

	// Motors
	private static Talon leftDriveMotor;
	private static Talon rightDriveMotor;
//	private static TalonSRX leftArmMotor;

	// Pneumatics

	/**
	 * Initializes all actuators
	 */
	public static void init() {
		// TODO: Change ID's
		// Motors
		rightDriveMotor = new Talon(0);
		rightDriveMotor.setInverted(true);


		leftDriveMotor = new Talon(1);
	    //leftDriveMotor.setInverted(true);

	}
	
	/**
	 * All initialization for teleop
	 */
	public static void teleopInit(){
		
		
		

	}

	/**
	 * @return the rightDrive
	 */


	//needed for Dashboard
	 public static Talon getRightDriveMotor() {
	 return rightDriveMotor;
	 }

	/**
	 * @return the leftDrive
	 */
	public static Talon getLeftDriveMotor() {
		return leftDriveMotor;
	}

	

	
}
