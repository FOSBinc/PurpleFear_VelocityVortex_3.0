package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;


/**
 * Created by Aakarsh on 1/6/2017.
 */
public class Autonomous1 extends LinearOpMode {

    DcMotor leftfrontMotor;
    DcMotor leftbackMotor;
    DcMotor rightfrontMotor;
    DcMotor rightbackMotor;
    DcMotor shooterLeft;
    DcMotor shooterRight;
    DcMotor tumbler;
    //DcMotor elevator;

    @Override
    public void runOpMode() throws InterruptedException {
        leftfrontMotor = hardwareMap.dcMotor.get("leftfront_motor");     //grab the configure file on the phone
        leftbackMotor = hardwareMap.dcMotor.get("leftback_motor");       //and compare it to the motors/sensors
        rightfrontMotor = hardwareMap.dcMotor.get("rightfront_motor");  //in the code
        rightbackMotor = hardwareMap.dcMotor.get("rightback_motor");
        tumbler = hardwareMap.dcMotor.get("tublr");
        shooterLeft = hardwareMap.dcMotor.get("shooterL");
        shooterRight = hardwareMap.dcMotor.get("shooterR");
        //elevator = hardwareMap.dcMotor.get("elevator");

        waitForStart();

        tankdrive(-0.3, -0.3, 650);
        shooterDrive(-1, 1);
        sleep(1500);
        tumblerDrive(1);
        sleep(2000);
        tumbler.setPower(0);
        tumbler.setPower(0);
        shooterLeft.setPower(0);
        shooterRight.setPower(0);
        tankdrive(-0.35, 0.35, 700);
        tankdrive(-0.3, -0.3, 3000);
        tankdrive(0.05, 0.3, 1500);

    }


    private void tankdrive(double leftY, double rightY, long sleepAmount) throws InterruptedException {

        rightY = -rightY;               //flip the power of the right side

        leftfrontMotor.setPower(leftY); //set the according power to each motor
        leftbackMotor.setPower(leftY);
        rightfrontMotor.setPower(rightY);
        rightbackMotor.setPower(rightY);

        sleep(sleepAmount);

        leftfrontMotor.setPower(0); //set the according power to each motor
        leftbackMotor.setPower(0);
        rightfrontMotor.setPower(0);
        rightbackMotor.setPower(0);
    }

    private void tumblerDrive(double power) throws InterruptedException {
        tumbler.setPower(power);
    }

   // private void elevatorDrive(double power, long sleepAmount) throws InterruptedException {
        //elevator.setPower(power);
        //sleep(sleepAmount);
        //elevator.setPower(0);

   // }





    private void shooterDrive(double leftpower, double rightpower) throws InterruptedException {
        shooterLeft.setPower(leftpower);
        shooterRight.setPower(rightpower);




    }


}

