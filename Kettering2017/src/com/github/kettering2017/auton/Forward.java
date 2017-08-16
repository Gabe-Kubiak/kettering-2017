package com.github.kettering2017.auton;

import com.github.kettering2017.drive.Drive;

public class Forward {

	public static void Forward(double distance){ //in Inches
		Drive.driveWithPID(distance, distance);
	}
}
