package org.usfirst.frc.team245.robot;

//import edu.wpi.first.wpilibj.CANTalon;
//import edu.wpi.first.wpilibj.CANTalon.FeedbackDevice;
//import edu.wpi.first.wpilibj.CANTalon.TalonControlMode;
import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.SafePWM;
import edu.wpi.first.wpilibj.PWMSpeedController;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.VictorSP;
/**
 * All of our robot's actuators including motors and pneumatics
 */
public class Actuators {
	public static double MIN_MOTOR_SPEED = -1;
	public static double MAX_MOTOR_SPEED = 1;
	
	//CONSTANTS
	
	//The PID constants for the arm

	// Motors
	private static VictorSP leftDriveMotor;
	private static VictorSP rightDriveMotor;
	private static TalonSRX leftArmMotor;

	// Pneumatics

	/**
	 * Initializes all actuators
	 */
	public static void init() {
		// TODO: Change ID's
		// Motors
		rightDriveMotor = new VictorSP(0);
		rightDriveMotor.setInverted(true);


		leftDriveMotor = new VictorSP(1);
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
	 public static VictorSP getRightDriveMotor() {
	 return rightDriveMotor;
	 }

	/**
	 * @return the leftDrive
	 */
	public static VictorSP getLeftDriveMotor() {
		return leftDriveMotor;
	}

	

	
}
