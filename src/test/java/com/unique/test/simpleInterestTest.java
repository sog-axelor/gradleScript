package com.unique.test;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.unique.*;


public class simpleInterestTest {
	
	@Test
	public void zeroValues()
	{
		int expectResult = 0;
		int generatedResult = new simpleInterest().calsi(0,7,2);
		assertEquals("Assert value zero test", expectResult, generatedResult);	
	}

}

