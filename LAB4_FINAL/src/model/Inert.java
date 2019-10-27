package model;

public class Inert extends Waste {
	
	/**
	 * Implements the class Inert
	 * @author Andres Cruz
	 * @version 1.0
	 */
	
	//Attributes
	
	private String advice;
	
	//Constructor method
	
	/*
	 * This is a constructor method of Inert
	 */
	
	public Inert(int id, String name, int origin, String color, int timeD, Product product, String advice) {
		super(id,name,origin,color,timeD,product);
		this.advice = advice;
	}
	
	//Getters and setter
	
	/*
	 * This method is to get a advice of waste Inert
	 * @pre: Object of Company != null; waste != null;
	 * @param: empty
	 * @return: String
	 * @post: got a advice of Waste Inert
	 */

	public String getAdvice() {
		return advice;
	}
	
	/*
	 * This method is to set a advice of waste Inert
	 * @pre: Object of Company != null; waste != null;
	 * @param: String advice
	 * @return: void
	 * @post: set a advice of Waste Inert
	 */

	public void setAdvice(String advice) {
		this.advice = advice;
	}
	
	
}
