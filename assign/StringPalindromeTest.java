package assignment1.assign;

import org.junit.Test;

import junit.framework.Assert;

public class StringPalindromeTest {

	@Test
	public void test() {
		Assert.assertEquals(true, StringPalindrome.isPalindrome("amma".toUpperCase()));
	}

}
