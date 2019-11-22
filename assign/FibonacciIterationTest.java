package assignment1.assign;
import org.junit.Test;

import junit.framework.Assert;

public class FibonacciIterationTest {

	@Test
	public void test() {
	Assert.assertEquals(13, FibonacciIteration.fibonacci(8));
	}

}
