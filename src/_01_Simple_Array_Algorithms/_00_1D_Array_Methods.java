package _01_Simple_Array_Algorithms;

public class _00_1D_Array_Methods {
	// 1. Complete the method so that it returns the sum of all
	// of the integers in the array being passed in
	static int sumIntArray(int[] values) {
		int holder = 0;
		for (int i = 0; i < values.length; i++) {
			holder += values[i];
		}
		return holder;
	}

	// 2. Complete the method so that it returns the average of all
	// of the integers in the array being passed in
	static double averageIntArray(int[] values) {
		double holder = 0;
		for (int i = 0; i < values.length; i++) {
			holder += values[i];
		}
		double mean = holder / values.length;
		return mean;
	}

	// 3. Complete the method so that it returns true if the integer
	// array contains the value specified by the second parameter.
	// It should otherwise return false.
	static boolean containsIntValue(int[] array, int value) {
		boolean truth = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				truth = true;
			} else {

			}
		}
		return truth;
	}

	// 4. Complete the method so that it returns the index of the, first instance
	// that the specified value occurs in the array.
	// If the array does not contain the specified value, it should return -1.
	static int getIndex(int[] arr, int value) {
		int index = 0;
		System.out.println(value);
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == value) {
				System.out.println(i);
				index = i;
				break;
			} else {
				index = -1;
			}
		}
		return index;
	}
}
