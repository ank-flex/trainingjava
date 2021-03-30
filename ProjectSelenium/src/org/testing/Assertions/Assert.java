package org.testing.Assertions;

public class Assert {

	public static void Assert_1(String actual, String expected)
	{
		if((actual.equals(expected)))
		{
			System.out.println("Assertion is passed");
			
		}
		else
			System.out.println("Assertion is failed");
	}
}
