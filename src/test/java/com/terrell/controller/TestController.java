package com.terrell.controller;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestController {

	@Test
	public void testMyFavoriteNumber() {
		
		//This test ensures the favorite number is correct
		
		MyController controller = new MyController();
		
		int myNumber = controller.myFavoriteNumber();
		
		assertEquals(myNumber,24);
	}
	
	@Test
	public void testMyFavoriteColor() {
		
		MyController contr = new MyController();
		
		String color = contr.myFavoriteColor();
		
		assertEquals(color,"Blue");
	}

}
