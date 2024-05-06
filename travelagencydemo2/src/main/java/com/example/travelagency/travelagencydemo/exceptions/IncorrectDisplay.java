package com.example.travelagency.travelagencydemo.exceptions;

public class IncorrectDisplay extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IncorrectDisplay() {
		super("invalid id");
	}
}
