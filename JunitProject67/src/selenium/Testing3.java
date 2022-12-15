package selenium;



import static org.junit.Assert.assertArrayEquals;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class Testing3 {

	@Rule
	public ErrorCollector err = new ErrorCollector();
	
	@Test
	public void test6() {
		String expected = "abc";
		String actual = "abc1";
		System.out.println("before assert");
		Assert.assertEquals(expected, actual);
		System.out.println("After first assert");
		Assert.assertTrue("Verify 2>3", 2>3);
		System.out.println("After second assert");
	}
	@Test
	public void test7() {
		String expected = "abc";
		String actual = "abc1";
		System.out.println("before assert");
		try {
		Assert.assertEquals(expected, actual);
		}
		catch(Throwable t)
		{
			System.out.println("I m in first catch");
			err.addError(t);
		}
		System.out.println("After first assert");
		try 
		{
			Assert.assertTrue("Verify 2>3", 2>3);
		}
		catch(Throwable t)
		{
			System.out.println("I am in second catch");
			err.addError(t);
		}
		System.out.println("After second assert");
	}
	

}
