package assignment1.assign;

public class Gcd {
	public static int getGcd(int number1, int number2) {
		int gcd = 1;
		for (int i = 1; i <= number1 && i <= number2; i++) {
			if (number1 % i == 0 && number2 % i == 0) {
				gcd = i;
			}
		}
		return gcd;

	
}
}
