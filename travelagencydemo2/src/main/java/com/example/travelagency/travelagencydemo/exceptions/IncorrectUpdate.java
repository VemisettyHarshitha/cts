package com.example.travelagency.travelagencydemo.exceptions;

public class IncorrectUpdate extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IncorrectUpdate() {
		super("update is incorrect");
	}

}
