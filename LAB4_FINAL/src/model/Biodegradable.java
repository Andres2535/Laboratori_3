package model;

public class Biodegradable extends Waste implements Usable{
	
	/**
	 * Implements the class Biodegradable
	 * @author Andres Cruz
	 * @version 1.0
	 */
	
	//Attributes
	
	private boolean composting;
	
	//Constructor method
	
			/*
			 * This is a constructor method of Biodegradable
			 */
	
	public Biodegradable(int id, String name, int origin, String color, int timeD, Product product, boolean composting) {
		super(id,name,origin,color,timeD,product);
		this.composting = composting;
	}
	
	//Getters and setter
	
	/*
	 * This method is to get a composting of waste Biodegradable
	 * @pre: Object of Company != null; waste != null;
	 * @param: empty
	 * @return: boolean
	 * @post: got a composting of Waste Biodegradable
	 */
	
	public boolean getComposting() {
		return composting;
	}
	
	/*
	 * This method is to set a composting of waste Biodegradable
	 * @pre: Object of Company != null; waste != null;
	 * @param: boolean composting
	 * @return: empty
	 * @post: set a composting of Waste Biodegradable
	 */

	public void setComposting(boolean composting) {
		this.composting = composting;
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
		if(getComposting() == true && getTimeD()< 360) {
			isUsable = true;
		}else {
			isUsable = false;
		}
		return isUsable;
	}

	

	

	
}
