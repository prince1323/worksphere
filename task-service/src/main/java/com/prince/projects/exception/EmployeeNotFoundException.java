package com.prince.projects.exception;

@SuppressWarnings("serial")
public class EmployeeNotFoundException extends RuntimeException
{
	 public EmployeeNotFoundException(String msg) {
	        super(msg);
	    }
}
