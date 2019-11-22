package assignment1.assign;

public class PowerUsingRecursion {
	public static int numberPower(int number, int power) {
		if (power == 0) {
			return 1;
		}
		return number * numberPower(number, power - 1);
	}

}

