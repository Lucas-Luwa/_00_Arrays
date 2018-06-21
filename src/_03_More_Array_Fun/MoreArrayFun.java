package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.

	public static void main(String[] args) {
		String[] words = { "Hi!", "My", "Name", "Is", "Lucas!" };
		printer(words);
		reverse(words);
		everyother(words);
	}

	 // 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	static void printer(String[] values) {
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		System.out.println("-Break-");
	}

	static // 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	void reverse(String[] values) {
		for (int i = values.length-1; i >= 0; i--) {
			System.out.println(values[i]);	
		}
		System.out.println("-Break-");
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	static void everyother(String[] values) {
		for (int i = 0; i < values.length; i+=2) {
			System.out.println(values[i]);	
		}
		System.out.println("-Break-");
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	void random(String[] values) {
		for (int i = 0; i < values.length; i++) {
		}
	}
}
