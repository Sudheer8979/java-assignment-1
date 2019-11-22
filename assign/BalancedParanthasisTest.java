package assignment1.assign;

import org.junit.Test;

import junit.framework.Assert;

public class BalancedParanthasisTest {

	@Test
	public void test() {
		 char exp[] = {'{','(',')','}','[',']'}; 
		 Assert.assertEquals(true, BalancedParanthasis.areParenthesisBalanced(exp));
		 System.out.println("Balanced");
		 }

}
