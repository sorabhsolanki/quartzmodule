package com.quartz.module.exception;

public class QuartzModuleException extends RuntimeException{
	
	public QuartzModuleException(){
		super();
	}
	
	public QuartzModuleException(String message){
		super(message);
	}
	
	public QuartzModuleException(String message, Throwable cause){
		super(message, cause);
	}
}
