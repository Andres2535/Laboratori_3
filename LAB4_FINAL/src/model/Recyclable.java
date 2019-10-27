package model;

public class Recyclable extends Waste implements Usable{
	
	/**
	 * Implements the class Recyclable
	 * @author Andres Cruz
	 * @version 1.0
	 */
	
	//Attributes
	
	private String description;
	
	//Constructor method
	
		/*
		 * This is a constructor method of Recyclable
		 */
	
	public Recyclable(int id, String name, int origin, String color, int timeD, Product product, String description) {
		super(id,name,origin,color,timeD,product);
		this.description = description;
	}
	
	//Getters and setter
	
	/*
	 * This method is to get a description of waste Recyclable
	 * @pre: Object of Company != null; waste != null;
	 * @param: empty
	 * @return: String
	 * @post: got a description of Waste Inert
	 */
	
	public String getDescription() {
		return description;
	}
	
	/*
	 * This method is to set a description of waste Recyclable
	 * @pre: Object of Company != null; waste != null;
	 * @param: String description
	 * @return: void
	 * @post: set a description of Waste Inert
	 */

	public void setDescription(String description) {
		this.description = description;
	}
	
	/*
	 * This method is to know if the waste is usable
	 * @pre: Object of Company != null; waste != null;
	 * @param: empty
	 * @return: boolean
	 * @post: Waste is usable
	 */

	public boolean isUsable() {
		boolean isUsable = false;
		if(description != null) {
			isUsable = true;
		}
		return isUsable;
	}
}
