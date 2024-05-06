package com.example.travelagency.travelagencydemo.exceptions;

public class IncorrectDelete extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IncorrectDelete() {
		super("Id is not found to delete");
	}
}
