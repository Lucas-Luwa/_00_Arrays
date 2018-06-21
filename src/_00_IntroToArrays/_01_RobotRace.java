package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	public static void main(String[] args) {
		// 2. create an array of 5 robots.
		int numofrobs = 0;
		Robot[] rob = new Robot[numofrobs];
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
					JOptionPane.showMessageDialog(null, "Robot " + (i + 1) + " wins!");

				}
			} 
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.//ABOVE
		// 7. declare that robot the winner and throw it a party!
		// 8. try different races with different amounts of robots.
		// Used 2, 7, 6 by chainging numofrobs to different numbers
		// 9. make the robots race around a circular track.
//		int numofrobs2 = 2;
//		Robot[] rob2 = new Robot[numofrobs2];
//		for (int i = 0; i < rob2.length; i++) {
//			rob2[i] = new Robot();
//		Not Finished -- for fast students	
//			
//		}
//		for (int i = 0; i < rob2.length; i++) {
//			rob2[i].setSpeed(20000);
//			rob2[i].setX(350);
//			rob2[i].setY(55 + i * (130));
//			rob2[i].turn(90);
//		}

	}
}
