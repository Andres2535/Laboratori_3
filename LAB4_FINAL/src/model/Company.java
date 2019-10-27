	package model;

public class Company {
	
	/**
	 * Implements the class Company
	 * @author Andres Cruz
	 * @version 1.0
	 */

	//Attributes
	
	private String name;
	
	//Relations
	
	private Waste[] wastes;
	private Product[] productsE;
	private Product[] productsR;
	private Waste waste;
	
	//Constructor method
	
		/*
		 * This is a constructor method of Company
		 */

	public Company(String name, int i, int j){
		this.name=name;
		wastes = new Waste[i];
		productsE = new Product[j];
	}
	
	//Getter and setter
	
	/*
	 * This method is to get a products init of waste
	 * @pre: Object of Company != null; productsR != null;
	 * @param: empty
	 * @return: a array of Products
	 * @post: got a array of Products
	 */
	
		public Product[] getProductsR() {
			return productsR;
		}
		
		/*
		 * This method is to set a products init of waste
		 * @pre: Object of Company != null; productsR != null;
		 * @param: Products[] productsR
		 * @return: void
		 * @post: set a array of Products
		 */

		public void setProductsR(Product[] productsR) {
			this.productsR = productsR;
		}
		
		/*
		 * This method is to get a waste
		 * @pre: Object of Company != null; waste != null;
		 * @param: empty
		 * @return: a waste
		 * @post: got a array of Products
		 */
		
		public Waste getWaste() {
			return waste;
		}
		
		/*
		 * This method is to set a waste
		 * @pre: Object of Company != null; waste != null;
		 * @param: Waste waste
		 * @return: void
		 * @post: set a array of Products
		 */

		public void setWaste(Waste waste) {
			this.waste = waste;
		}
		
		/*
		 * This method is to get a list of create products
		 * @pre: Object of Company != null; productsE != null;
		 * @param: empty
		 * @return: Product[]
		 * @post: got a array of Products
		 */
		
		public Product[] getProductsE() {
			return productsE;
		}
		
		/*
		 * This method is to set a list of create products
		 * @pre: Object of Company != null; productsE != null;
		 * @param: Products[] productsE
		 * @return: void
		 * @post: set a array of Products
		 */

		public void setProductsE(Product[] productsE) {
			this.productsE = productsE;
		}
		
		/*
		 * This method is to get a name of Company
		 * @pre: Object of Company != null;
		 * @param: empty
		 * @return: String name
		 * @post: got a name of Company
		 */
		
		public String getName() {
			return name;
		}
		
		/*
		 * This method is to set a name of Company
		 * @pre: Object of Company != null;
		 * @param: String name 
		 * @return: void
		 * @post: set a name of Company
		 */
		
		

		public void setName(String name) {
			this.name = name;
		}
		
		/*
		 * This method is to get a list of Waste
		 * @pre: Object of Company != null; wastes != null;
		 * @param: empty
		 * @return: Waste[]
		 * @post: got a list of wastes
		 */

		public Waste[] getWastes() {
			return wastes;
		}
		
		/*
		 * This method is to set a list of Waste
		 * @pre: Object of Company != null; wastes != null;
		 * @param: Waste[] wastes
		 * @return: void
		 * @post: set a list of wastes
		 */

		public void setWastes(Waste[] wastes) {
			this.wastes = wastes;
		}
		
		// Methods that helps to resolve the problems
		
		/*
		 * This method is to init the array productsR
		 * @pre: Object of Company != null;
		 * @param: ini i
		 * @return: void
		 * @post: array initialize
		 */
	
	public void init(int i) {
		productsR = new Product[i];
	}
	
	/*
	 * This method is to search a waste by name
	 * @pre: Object of Company != null; wastes != null;
	 * @param: String name
	 * @return: Waste
	 * @post: Waste found
	 */
	
	public Waste searchN(String name) {
		for (int i = 0; i < wastes.length; i++) {
			if(wastes[i].getName().equals(name)) {
				return wastes[i];
			}
		}
		return null;
	}
	
	/*
	 * This method is to search a waste by ID Of product
	 * @pre: Object of Company != null; wastes != null; 
	 * @param: int IDP
	 * @return: Waste
	 * @post: Waste found
	 */
	
	public Waste searchIP(int IDP) {
		for (int i = 0; i < wastes.length; i++) {
			if(wastes[i].getProduct().getId() == IDP) {
				return wastes[i];
			}
		}
		return null;
	}
	
	/*
	 * This method is to search a wastes with the same name Of product and compare with harmful
	 * @pre: Object of Company != null; wastes != null; 
	 * @param: String NP
	 * @return: Waste[]
	 * @post: array of Wastes found
	 */
	
	public Waste[] searchNP(String NP) {
		int count = 0;
		for (int i = 0; i < wastes.length; i++) {
			if(wastes[i].getProduct().getName() == NP) {
				count++;
			}
		}
		
		
		
		Waste[] list = new Waste[count];
		
		for (int i = 0; i < wastes.length; i++) {
			if(wastes[i].getProduct().getName() == NP) {
				list[i] = wastes[i];
			}
		}
		
		if(count >= 2) {
		
		Waste temp;
        for(int i=1;i < list.length;i++){
            for (int j=0 ; j < list.length- 1; j++){
                if (efectTotal(list[j]) < efectTotal(list[j+1])){
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
    
	}
		
		return list;
	}
	
	/*
	 * This method is to print the array
	 * @pre: Object of Company != null; wastes != null; 
	 * @param: Waste[] a
	 * @return: String
	 * @post: Array print
	 */
	
	public String efectUp(Waste[] a) {
		
		String b = "";
		
		for (int i = 0; i < a.length; i++) {
			b += a[i].getName() + "";
		}
		return b;
	}
	
	/*
	 * This method is to generate the report of Wastes
	 * @pre: Object of Company != null; wastes != null; 
	 * @param: empty
	 * @return: String
	 * @post: Report succesfull
	 */
	
	public String report() {
		String report = "";
		String msg1 = "Biodegradable: \n";
		String msg2 = "Recyclable: \n";
		String msg3 = "Inert: \n";
		String error = "";
		for (int i = 0; i < wastes.length; i++) {
			if(getWastes()[i] instanceof Biodegradable) {
				msg1 += "* " + getWastes()[i].infoData() + " - " +getWastes()[i].getProduct().infoDataP() + "\n";
			}else if(getWastes()[i] instanceof Recyclable) {
				msg2 += "* " + getWastes()[i].infoData() + " - " +getWastes()[i].getProduct().infoDataP() + "\n";
			}else if(getWastes()[i] instanceof Inert) {
				msg3 += "* " + getWastes()[i].infoData() + " - " +getWastes()[i].getProduct().infoDataP() + "\n";
			}else {
				error += "Error";
			}
		}
		
		report += msg1 + msg2 + msg3 + error;
		return report;
	}
	
	/*
	 * This method is to calculate the total efect of waste
	 * @pre: Object of Company != null; wastes != null; 
	 * @param: Waste a
	 * @return: double 
	 * @post: Efect total
	 */
	
	public double efectTotal(Waste a) {
		Waste current = a;
		double factor = current.harmfulEfect();
		double efect = 0;
		if(current instanceof Recyclable) {
			efect = factor - (factor*0.02);
		}else if((current instanceof Biodegradable)) {
			efect = factor - (factor * 0.01);
		}
		return efect;
	}

	
	/*
	 * This method is to print a array
	 * @pre: Object of Company != null; wastes != null; 
	 * @param: empty
	 * @return: String
	 * @post: array print
	 */
	
	
	public String listProductsE() {
		String lista = "";
		for (int I = 0; I < productsE.length; I++) {
			lista += I + ". " + productsE[I].getName() + "\n";
		}
		if(productsR != null) {
		for (int i = 0; i < productsR.length; i++) {
			lista += i + ". " + productsE[i].getName() + "\n";
		}
		}else {
			
		}
		return lista;
	}
	
	

	
	
	
}
