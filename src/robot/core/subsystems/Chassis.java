/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package robot.core.subsystems;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import robot.core.OI;
import robot.core.RobotMap;

/**
 *
 * @author Corey Mason
 */
public class Chassis extends Subsystem {

    public RobotDrive drive;
    private Jaguar frontRightJag, backRightJag, frontLeftJag, backLeftJag;
    
    public Chassis() {
        initJag();
        drive = new RobotDrive(frontLeftJag, backLeftJag, frontRightJag, backRightJag);
        drive.setSafetyEnabled(false);
    }
    private void initJag() {
        frontRightJag = new Jaguar(RobotMap.JAGUAR_PORT_FRONT_RIGHT);
        backRightJag = new Jaguar(RobotMap.JAGUAR_PORT_BACK_RIGHT);
        frontLeftJag = new Jaguar(RobotMap.JAGUAR_PORT_FRONT_RIGHT);
        backLeftJag = new Jaguar(RobotMap.JAGUAR_PORT_BACK_RIGHT);
    }
    public void driveWithJoyStick(Joystick stick) {
        drive.arcadeDrive(stick);
    }
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
