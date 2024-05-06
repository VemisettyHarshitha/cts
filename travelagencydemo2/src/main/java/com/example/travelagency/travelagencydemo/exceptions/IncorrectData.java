package com.example.travelagency.travelagencydemo.exceptions;

public class IncorrectData extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IncorrectData() {
		super("given data is incorrect");
	}

}
