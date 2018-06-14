package _00_IntroToArrays;

import java.lang.reflect.Array;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] items = new String[5];
		// 2. print the third element in the array
		System.out.println(items[3]);
		// 3. set the third element to a different value
		items[3] = "HI!";
		System.out.println("-BREAK-");
		// 4. print the third element again
		System.out.println(items[3]);
		System.out.println("-BREAK-");
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice
		for (int i = 0; i < items.length; i++) {
			items[i] = "HELLO.";
		}

		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < items.length; i++) {
			System.out.println(items[i]);
		}
		// 7. make an array of 50 integers
		int[] nums = new int[50];
		// 8. use a for loop to make every value of the integer array a random number
		Random r = new Random();
		for (int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(100);
		}
		// 9. without printing the entire array, print only the smallest number on the
		// array
		System.out.println("-BREAK-");
		int saver = nums[0];
		for (int i = 0; i < nums.length - 1; i++) {
			if (saver > nums[i]) {
				saver = nums[i];
			}

		}
		System.out.println(saver);
	
		System.out.println("-BREAK-");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		// 10 print the entire array to see if step 8 was correct
		// Above
		// 11. print the largest number in the array.
		System.out.println("-BREAK-");
		for (int i = 0; i < nums.length - 1; i++) {
			if (saver < nums[i]) {
				saver = nums[i];
			}

		}
		System.out.println(saver);

		// 12. print only the last element in the array
		System.out.println("-BREAK-");
		System.out.println(nums[nums.length-1]);
	}
}
