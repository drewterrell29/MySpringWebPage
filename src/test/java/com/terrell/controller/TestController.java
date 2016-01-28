package com.terrell.controller;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestController {

	@Test
	public void testMyFavoriteNumber() {
		
		
		MyController controller = new MyController();
		
		int myNumber = controller.MyFavoriteNumber();
		
		assertEquals(myNumber,24);
		
	}

}
