package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	public static void main(String[] args) {
		// 2. create an array of 5 robots.
		Robot[] rob = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < rob.length; i++) {
			rob[i] = new Robot();
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		for (int i = 0; i < rob.length; i++) {
			rob[i].setX(50 + i * (130));
			rob[i].setY(550);
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		Random rand = new Random();
		int limit = 61;
		boolean winnerfound = false;
		while (!winnerfound)
			for (int i = 0; i < rob.length; i++) {
				rob[i].setSpeed(500);
				rob[i].move(rand.nextInt(50));
				if (rob[i].getY() < limit) {
					winnerfound = true;
					JOptionPane.showMessageDialog(null, "Yay! Robot ");
				}
			}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.//ABOVE
		// 7. declare that robot the winner and throw it a party!
		
		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.

	}
}
