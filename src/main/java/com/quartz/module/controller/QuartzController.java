package com.quartz.module.controller;

import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;

import com.quartz.module.exception.QuartzModuleException;


public class QuartzController {

	private static final QuartzController controller = new QuartzController();
	private Scheduler scheduler;
	private QuartzController(){}
	
	public static QuartzController getInstance(){
		return controller;
	}
	
	public void initialize(){
		try {
			SchedulerFactory factory = new StdSchedulerFactory("quartz.properties");
			scheduler = factory.getScheduler();
			scheduler.start();
		} catch (Exception e) {
			throw new QuartzModuleException(e.getMessage(), e.getCause());
		}
	}
}
