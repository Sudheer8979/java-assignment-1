package assignment1.assign;

import org.junit.Test;

import junit.framework.Assert;

public class GcdTest {

	@Test
	public void Gcdtest() {
		Assert.assertEquals(10, Gcd.getGcd(50, 120));
	}

}
