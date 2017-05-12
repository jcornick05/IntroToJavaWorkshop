package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE 
Robot Dave= new  Robot();
Dave.setPenWidth(10);
Dave.setSpeed(100);
Dave.turn(-90);
Dave.move(900);
Dave.penDown();
for (int i = 100; i < 100; i++) {
	
}
Dave.turn(180);
Dave.move(100);
Dave.turn(270);
Dave.move(300);
Dave.turn(90);
Dave.move(100);
Dave.turn(90);
Dave.move(300);
Dave.turn(-90);
Dave.move(100);
Dave.turn(-90);
Dave.move(175);
Dave.turn(90);
Dave.move(100);
Dave.turn(90);
Dave.move(175);


	}
}
