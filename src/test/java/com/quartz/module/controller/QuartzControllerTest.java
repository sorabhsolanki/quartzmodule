package com.quartz.module.controller;

import org.junit.Before;
import org.junit.Test;


public class QuartzControllerTest {

	private static QuartzController controller;
	
	@Before
	public void initialize(){
		controller = QuartzController.getInstance();
	}
	
	@Test
	public void testFileListenerJob(){
		controller.initialize();
	}
	
	
}
