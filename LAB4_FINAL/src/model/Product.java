package model;

public class Product {
	
	/**
	 * Implements the class Product
	 * @author Andres Cruz
	 * @version 1.0
	 */
	
	//Attributes
	
	private int id;
	private String name;
	private String description;
	
	//Constructor method
	
	/*
	 * This is a constructor method of Product
	 */
	
	public Product(int id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	//Getters and setter
	
	/*
	 * This method is to get a id of Product
	 * @pre: Object of Company != null; waste != null;
	 * @param: empty
	 * @return: int
	 * @post: got a id of product
	 */

	public int getId() {
		return id;
	}
	
	
	
	/*
	 * This method is to set a id of Product
	 * @pre: Object of Company != null; waste != null;
	 * @param: int id
	 * @return: void
	 * @post: set a id of product
	 */

	public void setId(int id) {
		this.id = id;
	}
	
	/*
	 * This method is to get a name of Product
	 * @pre: Object of Company != null; waste != null;
	 * @param: empty
	 * @return: String
	 * @post: got a name of product
	 */

	public String getName() {
		return name;
	}
	
	/*
	 * This method is to set a name of Product
	 * @pre: Object of Company != null; waste != null;
	 * @param: String name
	 * @return: void
	 * @post: set a name of product
	 */

	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * This method is to get a description of Product
	 * @pre: Object of Company != null; waste != null;
	 * @param: empty
	 * @return: String
	 * @post: got a description of product
	 */

	public String getDescription() {
		return description;
	}
	
	/*
	 * This method is to set a description of Product
	 * @pre: Object of Company != null; waste != null;
	 * @param: String description
	 * @return: void
	 * @post: set a description of product
	 */

	public void setDescription(String description) {
		this.description = description;
	}
	
	/*
	 * This method is to get a infoData of Product
	 * @pre: Object of Company != null; waste != null;
	 * @param: empty
	 * @return: String
	 * @post: got a infoData of product
	 */
	
	public String infoDataP() {
		String msg = getName() + " " + "(Indicador - " + getId() + " -  descripción - " + getDescription() + ")";
		return msg;
	}
	
	
}
