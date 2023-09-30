package com.java.javaApp;

import static org.junit.Assert.*;

import org.junit.Test;


public class AppTest {

	@Test
	public void testSquare() {
		App test = new App();
		int output = test.square(5);
		assertEquals(25, output);
	}
	@Test
	   public void test() {
	      assertTrue(true);
	   }

}