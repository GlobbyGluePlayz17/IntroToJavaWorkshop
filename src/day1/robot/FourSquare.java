package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot globbyglue = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
globbyglue.setSpeed(10);
		// 5. Set the pen width to 5
globbyglue.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
for (int i = 0; i < 4; i++) {

			// 7. Set the pen color to random
globbyglue.setRandomPenColor();
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right
globbyglue.turn(90);
	}
}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "Yay! You called the drawSquare() method!");
	globbyglue.moveTo(500, 500);
	globbyglue.penDown();
	globbyglue.move(200);
	globbyglue.turn(90);
	globbyglue.move(200);
	globbyglue.turn(90);
	globbyglue.move(200);
	globbyglue.turn(90);
	globbyglue.move(200);
	globbyglue.turn(90);
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
