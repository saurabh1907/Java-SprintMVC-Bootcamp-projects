package assertion;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestAssertionTest {

	@Test
	public void test() {
		String s1= new String("hello world");
		String s2="hello world";
		String s3="hello world";
		String s4="world hello";
		//Assert.assertSame(s1, s2);
		//Assert.assertSame(s3, s4);
		//assertEquals(s1,s2);
		if(s1.equals(s2))System.out.println("true");
		
		

}
}
