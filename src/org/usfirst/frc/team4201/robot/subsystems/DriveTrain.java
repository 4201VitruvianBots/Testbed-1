package org.usfirst.frc.team4201.robot.subsystems;

import org.usfirst.frc.team4201.robot.RobotMap;

import com.ctre.CANTalon;
import com.ctre.CANTalon.TalonControlMode;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {
	CANTalon[] leftMotors = {
			new CANTalon(RobotMap.driveTrainMotorLeftFront),
			new CANTalon(RobotMap.driveTrainMotorLeftRear),
	};
	CANTalon[] rightMotors = {
			new CANTalon(RobotMap.driveTrainMotorRightFront),
			new CANTalon(RobotMap.driveTrainMotorRightRear),
	};
	RobotDrive robotDrive = new RobotDrive(leftMotors[0], leftMotors[1], rightMotors[0], rightMotors[1]);
	
	public DriveTrain() {
		super();
			
	leftMotors[0].changeControlMode(TalonControlMode.PercentVbus);
	leftMotors[1].changeControlMode(TalonControlMode.PercentVbus);
	leftMotors[1].set(leftMotors[0].getDeviceID());
	rightMotors[0].changeControlMode(TalonControlMode.PercentVbus);
	rightMotors[1].changeControlMode(TalonControlMode.PercentVbus);
	rightMotors[1].set(rightMotors[0].getDeviceID());
		}
}
