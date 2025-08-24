package com.prince.projects.exception;

@SuppressWarnings("serial")
public class TaskNotFoundException extends RuntimeException
{
	 public TaskNotFoundException(String msg) {
	        super(msg);
	    }
}
