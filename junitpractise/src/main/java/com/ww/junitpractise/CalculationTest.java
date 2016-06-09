package com.ww.junitpractise;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculationTest {

	Calculation cal = new Calculation();
	int sum = cal.sum(2, 2);
	int testsum = 7;
	
	@Test
	public void test() {
		System.out.println("@Test sum() :" +sum+ "=" +testsum);
		assertEquals(sum, testsum);
		//assertNotEquals(sum, testsum);
	}

}
