package com.github.kettering2017.drive;

import org.usfirst.frc.team245.robot.Gamepad;
import com.ctre.CANTalon;
import com.ctre.CANTalon.TalonControlMode;

import org.usfirst.frc.team245.robot.Actuators;

/**
 * All robot drive code
 *
 */
public class Drive {
	private static final double WHEEL_DIAMETER = 6;
	private static final double INCHES_PER_REV = WHEEL_DIAMETER * Math.PI;

	/**
	 * Initializes all drive (currently does nothidng)
	 */
	public static void init(){
		
	}
	
	/**
	 * Drives robot with a linear and rotational component
	 * @param speed
	 * @param turningSpeed
	 */
	public static void drive(double speed, double turningSpeed) {
		
		//Actuators.getLeftDriveMotor().changeControlMode(TalonControlMode.PercentVbus);
		//Actuators.getRightDriveMotor().changeControlMode(TalonControlMode.PercentVbus);
		
		double leftSpeed = Math.min(Actuators.MAX_MOTOR_SPEED, speed - turningSpeed);
		leftSpeed = Math.max(Actuators.MIN_MOTOR_SPEED, leftSpeed);
		double rightSpeed = Math.min(Actuators.MAX_MOTOR_SPEED, speed + turningSpeed);
		rightSpeed = Math.max(Actuators.MIN_MOTOR_SPEED, rightSpeed);
		
		Actuators.getLeftDriveMotor().set(leftSpeed);
	    Actuators.getRightDriveMotor().set(rightSpeed);

	}
	
	public static void lift(double liftSpeed) {
		Actuators.getLeftArmMotor().set(liftSpeed);
		Actuators.getRightArmMotor().set(liftSpeed);
	}
	
	public static void jaws(double jawsSpeed) {
		Actuators.getJawsMotor().set(jawsSpeed);
	}
	
	public static void wrist(double wristSpeed) {
		Actuators.getWristMotor().set(wristSpeed);
	}
	/**
	 * Drives robot with only linear component
	 * @param speed
	 */
//	public static void drive(double speed) {
//		//Actuators.getLeftDriveMotor().changeControlMode(TalonControlMode.PercentVbus);
//		//Actuators.getRightDriveMotor().changeControlMode(TalonControlMode.PercentVbus);
//		
//		double leftSpeed = Math.min(Actuators.MAX_MOTOR_SPEED, speed);
//		leftSpeed = Math.max(Actuators.MIN_MOTOR_SPEED, leftSpeed);
//		double rightSpeed = Math.min(Actuators.MAX_MOTOR_SPEED, speed);
//		rightSpeed = Math.max(Actuators.MIN_MOTOR_SPEED, rightSpeed);
//		
//	Actuators.getLeftDriveMotor().set(leftSpeed);
//	Actuators.getRightDriveMotor().set(rightSpeed);
//	}
//	
	
	/**
	 * 
	 * @param leftDistance - The distance the left side should travel in inches
	 * @param rightDistance - The distance the right side should travel in inches
	 */
	public static void driveWithPID(double leftDistance, double rightDistance){
		leftDistance /= INCHES_PER_REV;
		rightDistance /= INCHES_PER_REV;
		
		Actuators.getLeftDriveMotor().changeControlMode(TalonControlMode.Position);
		Actuators.getLeftDriveMotor().set(-leftDistance);
		Actuators.getLeftDriveMotor().enable();
		
		Actuators.getRightDriveMotor().changeControlMode(TalonControlMode.Position);
		Actuators.getRightDriveMotor().set(rightDistance);
		Actuators.getRightDriveMotor().enable();
	}
	
	
//	public static void shift(){
//		
//		if(Actuators.getDriveShiftPneumatic().get()){
//			Actuators.getDriveShiftPneumatic().set(false);
//		}else{
//			Actuators.getDriveShiftPneumatic().set(true);
//		}
//		
//	}
	
}

