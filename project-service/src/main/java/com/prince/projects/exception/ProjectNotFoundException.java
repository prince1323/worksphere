package com.prince.projects.exception;

@SuppressWarnings("serial")
public class ProjectNotFoundException extends RuntimeException
{
	 public ProjectNotFoundException(String msg) {
	        super(msg);
	    }
}
