package assignment1.assign;

public class Prime {
	//Time Complexity: O(n)
	/**
	 * This class is to check the given number is prime number or not
	 *
	 */
		public static boolean isPrimeNumber(int number) {
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					return false;
				}
			}
			return true;
		}
	}



