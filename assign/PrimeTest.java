package assignment1.assign;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class PrimeTest extends TestCase{
	/**
	 * This test is used to test the given number is prime number or not. Time
	 * Complexity: O(n)
	 * 
	 
	 *
	 */

		@Test
		public void primeNumberCheck() {
			Assert.assertEquals(true, Prime.isPrimeNumber(2));
		}

		@Test
		public void testNotPrimeNumber() {
			Assert.assertEquals(false, Prime.isPrimeNumber(9));
		}

	}



