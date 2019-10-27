package model;

public class Waste {
	
	/**
	 * Implements the class Waste
	 * @author Andres Cruz
	 * @version 1.0
	 */
	
	//Attributes
	
	private int id;
	private String name;
	private int origin;
	private String color;
	private int timeD;
	
	//Constants
	
	public final static int O_INDUSTRIAL = 1;
	public final static int O_DOMICILIARY = 2;
	public final static int O_MUNICIPAL = 3;
	public final static int O_BUILDING = 4;
	public final static int O_HOSPITAL = 5;
	
	//Relation
	
	private Product product;
	
	//Constructor method
	
			/*
			 * This is a constructor method of Waste
			 */
	

	public Waste(int id, String name, int origin, String color, int timeD, Product product) {
		this.id = id;
		this.name = name;
		this.origin = origin;
		this.color = color;
		this.timeD = timeD;
		this.product = product;
	}
	
	//Getters and setter
	
	/*
	 * This method is to get a id of waste
	 * @pre: Object of Company != null; waste != null;
	 * @param: empty
	 * @return: int
	 * @post: got a id of waste
	 */
	
	public int getId() {
		return id;
	}
	
	/*
	 * This method is to set a id of waste
	 * @pre: Object of Company != null; waste != null;
	 * @param: int id
	 * @return: void
	 * @post: set a id of waste
	 */

	public void setId(int id) {
		this.id = id;
	}
	
	/*
	 * This method is to get a name of waste
	 * @pre: Object of Company != null; waste != null;
	 * @param: empty
	 * @return: String
	 * @post: got a name of waste
	 */

	public String getName() {
		return name;
	}
	
	/*
	 * This method is to set a name of waste
	 * @pre: Object of Company != null; waste != null;
	 * @param: String name
	 * @return: void
	 * @post: set a name of waste
	 */

	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * This method is to get a origin of waste
	 * @pre: Object of Company != null; waste != null;
	 * @param: empty
	 * @return: int
	 * @post: got a origin of waste
	 */

	public int getOrigin() {
		return origin;
	}
	
	/*
	 * This method is to set a origin of waste
	 * @pre: Object of Company != null; waste != null;
	 * @param: int origin
	 * @return: void
	 * @post: set a origin of waste
	 */

	public void setOrigin(int origin) {
		this.origin = origin;
	}
	
	/*
	 * This method is to get a color of waste
	 * @pre: Object of Company != null; waste != null;
	 * @param: empty
	 * @return: String
	 * @post: got a color of waste
	 */

	public String getColor() {
		return color;
	}
	
	/*
	 * This method is to set a color of waste
	 * @pre: Object of Company != null; waste != null;
	 * @param: String color
	 * @return: void
	 * @post: set a color of waste
	 */

	public void setColor(String color) {
		this.color = color;
	}
	
	/*
	 * This method is to get a timeD of waste
	 * @pre: Object of Company != null; waste != null;
	 * @param: empty
	 * @return: int
	 * @post: got a timeD of waste
	 */

	public int getTimeD() {
		return timeD;
	}
	/*
	 * This method is to set a timeD of waste
	 * @pre: Object of Company != null; waste != null;
	 * @param: int timeD
	 * @return: void
	 * @post: set a timeD of waste
	 */
	

	public void setTimeD(int timeD) {
		this.timeD = timeD;
	}
	
	/*
	 * This method is to get a product of waste
	 * @pre: Object of Company != null; waste != null;
	 * @param: empty
	 * @return: Product
	 * @post: got a product of waste
	 */

	public Product getProduct() {
		return product;
	}
	
	/*
	 * This method is to set a product of waste
	 * @pre: Object of Company != null; waste != null;
	 * @param: Product product
	 * @return: void
	 * @post: set a product of waste
	 */

	public void setProduct(Product product) {
		this.product = product;
	}
	
	// Methods that helps to resolve the problems
	
	
	/*
	 * This method is to calculate the harmful efect
	 * @pre: Object of Company != null; waste != null;
	 * @param: empty
	 * @return: double
	 * @post: harmful of waste
	 */
	
	
	public double harmfulEfect() {
		double factor = 0;
		if(getOrigin() == O_INDUSTRIAL) {
			factor = timeD * 0.1;
		}else if(getOrigin() == O_DOMICILIARY) {
			factor = timeD * 0.05;
		}else if(getOrigin() == O_BUILDING) {
			factor = timeD * 0.08;
		}else if(getOrigin() == O_MUNICIPAL) {
			factor = timeD * 0.12;
		}else if(getOrigin() == O_HOSPITAL) {
			factor = timeD * 0.15;
		}else {
		}
		return factor;
	}
	
	/*
	 * This method is to print the data of waste
	 * @pre: Object of Company != null; waste != null;
	 * @param: empty
	 * @return: String
	 * @post: Data about waste
	 */
	
	public String infoData() {
		String originT = "";
		if(origin == 1) {
			originT = "Industrial";
		}else if(origin == 2) {
			originT = "Domiciliary";
		}else if(origin == 3) {
			originT = "Building";
		}else if(origin == 4) {
			originT = "Municipal";
		}else if(origin == 5) {
			originT = "Hospital";
		}else {
			
		}
		
		String msg = getName() + " - " + originT + " - " + getColor() + " - " + getTimeD();
		
		return msg;
		
	}

	
	
	
}
