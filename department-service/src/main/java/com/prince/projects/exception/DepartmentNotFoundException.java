package com.prince.projects.exception;

@SuppressWarnings("serial")
public class DepartmentNotFoundException extends RuntimeException
{
	 public DepartmentNotFoundException(String msg) {
	        super(msg);
	    }
}
