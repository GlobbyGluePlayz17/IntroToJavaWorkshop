package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class MoveRobot {
public static void main(String[] args) {
	Robot globbyglue = new Robot("mini");
	globbyglue.moveTo(500, 500);
	globbyglue.penDown();
	globbyglue.setRandomPenColor();
	globbyglue.setSpeed(5);
	globbyglue.move(250);
	globbyglue.moveTo(250, 500);
	}
}
