package ui;

import java.util.Scanner;
import model.*;

public class Main {
	
	//Constructor method
	
	public Main() {
		this.number = 0;
		this.initP = 2;
		this.position = 0;
	}
	
	//Attributes
	
		private Scanner entrie;
		private Scanner entrie2;
		private Scanner entrie1;
		private int number;
		private int initP;
		private int position;
		
		/*
		 * This method is to get a position of Main
		 * @pre: Main != null;
		 * @param: empty
		 * @return: a int position of Main
		 * @post: got a position of Main
		 */
		
		public int getPosition() {
			return position;
		}
		
		/*
		 * This method is to set a position of Main
		 * @pre: Main != null;
		 * @param: int position
		 * @return: void
		 * @post: set a number of Main
		 */

		public void setPosition(int position) {
			this.position = position;
		}

		//Relations
		private Company control;
		
		public static void main(String[] args) {
			Main program = new Main();
			program.start();

		}
		
		/*
		 * This method is to get a number of Main
		 * @pre: Main != null;
		 * @param: empty
		 * @return: a int number of Main
		 * @post: got a number of Main
		 */
		
		public int getNumber() {
			return number;
		}
		
		/*
		 * This method is to set a number of Main
		 * @pre: Main != null;
		 * @param: int number
		 * @return: void
		 * @post: set a number of Main
		 */

		public void setNumber(int number) {
			this.number = number;
		}
		
		/*
		 * This method is to get a initP of Main
		 * @pre: Main != null;
		 * @param: empty
		 * @return: a int initP of Main
		 * @post: got a initP of Main
		 */
		
		public int getInitP() {
			return initP;
		}
		
		/*
		 * This method is to get a initP of Main
		 * @pre: Main != null;
		 * @param: int initP
		 * @return: void
		 * @post: set a initP of Main
		 */

		public void setInitP(int initP) {
			this.initP = initP;
		}
		
		/*
		 * This method is to initialize the relations
		 * @pre: Main != null;
		 * @param: empty
		 * @return: void
		 * @post: initialize the relations
		 */
		
		public void start() {
			entrie1 = new Scanner(System.in);
			System.out.println("Before to start, please give me a number of Waste's"
					+ "that do you like create");
			int count = entrie1.nextInt();
			setNumber(count);
			control = new Company("Reciclemos", number, initP);
			
			//Init exist product
			
			control.getProductsE()[0] = new Product(100, "Banano", "Fruta");
			control.getProductsE()[1] = new Product(120, "Pera", "Fruta");
			
			
			menu();
			
			
		}
		
		/*
		 * This method is to print a menu
		 * @pre: Main != null;
		 * @param: empty
		 * @return: void
		 * @post: print menu
		 */
		
		public void menu() {
			entrie = new Scanner(System.in);
			entrie2 = new Scanner(System.in);
			System.out.println("         ****************");
			System.out.println("\t ¡WELCOME TO " + control.getName() + ".");
			System.out.println("         ****************");
			System.out.println("-¿What would you like to do??");
			System.out.println("");
			System.out.println("*****************");
			System.out.println("[1]. Create a Waste");
			System.out.println("[2]. Generate report");
			System.out.println("[3]. Create product");
			System.out.println("[4]. Search Waste");
			System.out.println("[5]. List of products");
			System.out.println("[6]. Calculate harmful efect");
			System.out.println("[7]. Determinate if the waste is usable or no");
			System.out.println("[8]. List of waste depends of harmful efect");
			System.out.println("*****************");
			System.out.println("[0]. Exit");
			System.out.println("");
			
			int option = entrie.nextInt();
			if(option == 1) {
				if(number == 0) {
					System.out.println("You cant create more Waste");
					menu();
				}
				number--;
				option1();
				
		}else if(option == 2) {
			option2();
		}else if(option == 3) {
			option3();
		}else if(option == 4) {
			option4();
		}else if(option == 5) {
			option5();
		}else if(option == 6) {
			option6();
		}else if(option == 7) {
			option7();
		}else if(option == 8) {
			option8();
		}else if(option == 0) {
			
		}else {
			System.out.println("Please select a correct option");
			menu();
		}
}

		/*
		 * This method is when the user select a option1 (create a waste)
		 * @pre: Main != null;
		 * @param: empty
		 * @return: void
		 * @post: new waste
		 */
	
	public void option1() {
		System.out.println("Do you like create a new Waste with a exist product or new product?");
		System.out.println("Options: [1] New product or [2] Exist product");
		int option = entrie.nextInt();
		if(option == 1) {
			System.out.println("Give me a id of product");
			int id = entrie.nextInt();
			System.out.println("Give me a name of Product");
			String name = entrie2.nextLine();
			System.out.println("Give me ea description of Product");
			String description = entrie2.nextLine();
			
			Product current = new Product(id,name,description);
			
			System.out.println("Give a type of Waste");
			System.out.println("[1]. Biodegradable \n [2]. Recycble \n [3]. Inert");
			int optionT = entrie.nextInt();
			if(optionT == 1) {
				System.out.println("You choose Biodegradble Waste");
				System.out.println("Give me a ID of waste");
				int id1 = entrie.nextInt();
				System.out.println("Give me a Waste name");
				String name1 = entrie2.nextLine();
				System.out.println("Give me a Waste origin");
				System.out.println("[1] Industrial \n [2] Domiciliary \n [3] Munical \n [4] Building \n [5] Hospital");
				int origin = entrie.nextInt();
				System.out.println("Give me a Waste color");
				String color = entrie2.nextLine();
				System.out.println("Give me a time of descomposition (Days)");
				int timeD = entrie.nextInt();
				System.out.println("The waste is composting?");
				System.out.println("[1] Yes         [2] No");
				int isComposting = entrie.nextInt();
				boolean a = false;
				if(isComposting == 1) {
					a = true;
				}else {
					a = false;
				}
				control.getWastes()[position] = new Biodegradable(id1, name1, origin, color, timeD, current, a);
				setPosition(position++);
				menu();
				
				
			}else if(optionT == 2) {
				
				System.out.println("You choose Recyclable Waste");
				System.out.println("Give me a type of Waste Recyclable");
				System.out.println("[1] Plastic \n [2] Paper \n [3] Metal \n [4] Glass \n [5] CardBoard");
				int type = entrie.nextInt();
				if(type == 1) {
					System.out.println("You choose Recyclable Waste of Plastic");
					System.out.println("Give me a ID of waste");
					int id1 = entrie.nextInt();
					System.out.println("Give me a Waste name");
					String name1 = entrie2.nextLine();
					System.out.println("Give me a Waste origin");
					System.out.println("[1] Industrial \n [2] Domiciliary \n [3] Munical \n [4] Building \n [5] Hospital");
					int origin = entrie.nextInt();
					System.out.println("Give me a Waste color");
					String color = entrie2.nextLine();
					System.out.println("Give me a time of descomposition (Days)");
					int timeD = entrie.nextInt();
					System.out.println("Give me a description");
					String description1 = entrie2.nextLine();
					control.getWastes()[position] = new Plastic(id1, name1, origin, color, timeD, current, description1);
					setPosition(position++);
					menu();
					
				}else if(type == 2) {
					System.out.println("You choose Recyclable Waste of Paper");
					System.out.println("Give me a ID of waste");
					int id1 = entrie.nextInt();
					System.out.println("Give me a Waste name");
					String name1 = entrie2.nextLine();
					System.out.println("Give me a Waste origin");
					System.out.println("[1] Industrial \n [2] Domiciliary \n [3] Munical \n [4] Building \n [5] Hospital");
					int origin = entrie.nextInt();
					System.out.println("Give me a Waste color");
					String color = entrie2.nextLine();
					System.out.println("Give me a time of descomposition (Days)");
					int timeD = entrie.nextInt();
					System.out.println("Give me a description");
					String description1 = entrie2.nextLine();
					control.getWastes()[position] = new Paper(id1, name1, origin, color, timeD, current, description1);
					setPosition(position++);
					menu();
					
				}else if(type == 3) {
					System.out.println("You choose Recyclable Waste of Metal");
					System.out.println("Give me a ID of waste");
					int id1 = entrie.nextInt();
					System.out.println("Give me a Waste name");
					String name1 = entrie2.nextLine();
					System.out.println("Give me a Waste origin");
					System.out.println("[1] Industrial \n [2] Domiciliary \n [3] Munical \n [4] Building \n [5] Hospital");
					int origin = entrie.nextInt();
					System.out.println("Give me a Waste color");
					String color = entrie2.nextLine();
					System.out.println("Give me a time of descomposition (Days)");
					int timeD = entrie.nextInt();
					System.out.println("Give me a description");
					String description1 = entrie2.nextLine();
					control.getWastes()[position] = new Metal(id1, name1, origin, color, timeD, current, description1);
					setPosition(position++);
					menu();
					
				}else if(type == 4) {
					System.out.println("You choose Recyclable Waste of Glass");
					System.out.println("Give me a ID of waste");
					int id1 = entrie.nextInt();
					System.out.println("Give me a Waste name");
					String name1 = entrie2.nextLine();
					System.out.println("Give me a Waste origin");
					System.out.println("[1] Industrial \n [2] Domiciliary \n [3] Munical \n [4] Building \n [5] Hospital");
					int origin = entrie.nextInt();
					System.out.println("Give me a Waste color");
					String color = entrie2.nextLine();
					System.out.println("Give me a time of descomposition (Days)");
					int timeD = entrie.nextInt();
					System.out.println("Give me a description");
					String description1 = entrie2.nextLine();
					control.getWastes()[position] = new Glass(id1, name1, origin, color, timeD, current, description1);
					setPosition(position++);
					menu();
					
				}else if(type == 5) {
					System.out.println("You choose Recyclable Waste of CardBoard");
					System.out.println("Give me a ID of waste");
					int id1 = entrie.nextInt();
					System.out.println("Give me a Waste name");
					String name1 = entrie2.nextLine();
					System.out.println("Give me a Waste origin");
					System.out.println("[1] Industrial \n [2] Domiciliary \n [3] Munical \n [4] Building \n [5] Hospital");
					int origin = entrie.nextInt();
					System.out.println("Give me a Waste color");
					String color = entrie2.nextLine();
					System.out.println("Give me a time of descomposition (Days)");
					int timeD = entrie.nextInt();
					System.out.println("Give me a description");
					String description1 = entrie2.nextLine();
					control.getWastes()[position] = new Plastic(id1, name1, origin, color, timeD, current, description);
					setPosition(position++);
					menu();
				}
			
				
			}else if(optionT == 3) {
				
				System.out.println("You choose Inert Waste");
				System.out.println("Give me a ID of waste");
				int id1 = entrie.nextInt();
				System.out.println("Give me a Waste name");
				String name1 = entrie2.nextLine();
				System.out.println("Give me a Waste origin");
				System.out.println("[1] Industrial \n [2] Domiciliary \n [3] Munical \n [4] Building \n [5] Hospital");
				int origin = entrie.nextInt();
				System.out.println("Give me a Waste color");
				String color = entrie2.nextLine();
				System.out.println("Give me a time of descomposition (Days)");
				int timeD = entrie.nextInt();
				System.out.println("Give me a advice to this Waste");
				String advice = entrie.nextLine();
				control.getWastes()[position] = new Inert(id1, name1, origin, color, timeD, current, advice);
				setPosition(position++);
				menu();
				
			}
			
			
		}else if(option == 2) {
			System.out.println("List of products");
			System.out.println(control.listProductsE());
			System.out.println("What do you like choose");
			int pofList = entrie.nextInt();
			System.out.println("Give a type of Waste");
			System.out.println("[1]. Biodegradable \n [2]. Recycble \n [3]. Inert");
			int optionT = entrie.nextInt();
			if(optionT == 1) {
				System.out.println("You choose Biodegradble Waste");
				System.out.println("Give me a ID of waste");
				int id = entrie.nextInt();
				System.out.println("Give me a Waste name");
				String name = entrie2.nextLine();
				System.out.println("Give me a Waste origin");
				System.out.println("[1] Industrial \n [2] Domiciliary \n [3] Munical \n [4] Building \n [5] Hospital");
				int origin = entrie.nextInt();
				System.out.println("Give me a Waste color");
				String color = entrie2.nextLine();
				System.out.println("Give me a time of descomposition (Days)");
				int timeD = entrie.nextInt();
				System.out.println("The waste is composting?");
				System.out.println("[1] Yes         [2] No");
				int isComposting = entrie.nextInt();
				boolean a = false;
				if(isComposting == 1) {
					a = true;
				}else {
					a = false;
				}
				control.getWastes()[position] = new Biodegradable(id, name, origin, color, timeD, control.getProductsE()[pofList], a);
				int z = position + 1;
				setPosition(z);
				menu();
				
				
			}else if(optionT == 2) {
				
				System.out.println("You choose Recyclable Waste");
				System.out.println("Give me a type of Waste Recyclable");
				System.out.println("[1] Plastic \n [2] Paper \n [3] Metal \n [4] Glass \n [5] CardBoard");
				int type = entrie.nextInt();
				if(type == 1) {
					System.out.println("You choose Recyclable Waste of Plastic");
					System.out.println("Give me a ID of waste");
					int id = entrie.nextInt();
					System.out.println("Give me a Waste name");
					String name = entrie2.nextLine();
					System.out.println("Give me a Waste origin");
					System.out.println("[1] Industrial \n [2] Domiciliary \n [3] Munical \n [4] Building \n [5] Hospital");
					int origin = entrie.nextInt();
					System.out.println("Give me a Waste color");
					String color = entrie2.nextLine();
					System.out.println("Give me a time of descomposition (Days)");
					int timeD = entrie.nextInt();
					System.out.println("Give me a description");
					String description = entrie2.nextLine();
					control.getWastes()[position] = new Plastic(id, name, origin, color, timeD, control.getProductsE()[pofList], description);
					int z = position + 1;
					setPosition(z);
					menu();
					
				}else if(type == 2) {
					System.out.println("You choose Recyclable Waste of Paper");
					System.out.println("Give me a ID of waste");
					int id = entrie.nextInt();
					System.out.println("Give me a Waste name");
					String name = entrie2.nextLine();
					System.out.println("Give me a Waste origin");
					System.out.println("[1] Industrial \n [2] Domiciliary \n [3] Munical \n [4] Building \n [5] Hospital");
					int origin = entrie.nextInt();
					System.out.println("Give me a Waste color");
					String color = entrie2.nextLine();
					System.out.println("Give me a time of descomposition (Days)");
					int timeD = entrie.nextInt();
					System.out.println("Give me a description");
					String description = entrie2.nextLine();
					control.getWastes()[position] = new Paper(id, name, origin, color, timeD, control.getProductsE()[pofList], description);
					int z = position + 1;
					setPosition(z);
					menu();
					
				}else if(type == 3) {
					System.out.println("You choose Recyclable Waste of Metal");
					System.out.println("Give me a ID of waste");
					int id = entrie.nextInt();
					System.out.println("Give me a Waste name");
					String name = entrie2.nextLine();
					System.out.println("Give me a Waste origin");
					System.out.println("[1] Industrial \n [2] Domiciliary \n [3] Munical \n [4] Building \n [5] Hospital");
					int origin = entrie.nextInt();
					System.out.println("Give me a Waste color");
					String color = entrie2.nextLine();
					System.out.println("Give me a time of descomposition (Days)");
					int timeD = entrie.nextInt();
					System.out.println("Give me a description");
					String description = entrie2.nextLine();
					control.getWastes()[position] = new Metal(id, name, origin, color, timeD, control.getProductsE()[pofList], description);
					int z = position + 1;
					setPosition(z);
					menu();
					
				}else if(type == 4) {
					System.out.println("You choose Recyclable Waste of Glass");
					System.out.println("Give me a ID of waste");
					int id = entrie.nextInt();
					System.out.println("Give me a Waste name");
					String name = entrie2.nextLine();
					System.out.println("Give me a Waste origin");
					System.out.println("[1] Industrial \n [2] Domiciliary \n [3] Munical \n [4] Building \n [5] Hospital");
					int origin = entrie.nextInt();
					System.out.println("Give me a Waste color");
					String color = entrie2.nextLine();
					System.out.println("Give me a time of descomposition (Days)");
					int timeD = entrie.nextInt();
					System.out.println("Give me a description");
					String description = entrie2.nextLine();
					control.getWastes()[position] = new Glass(id, name, origin, color, timeD, control.getProductsE()[pofList], description);
					int z = position + 1;
					setPosition(z);
					menu();
					
				}else if(type == 5) {
					System.out.println("You choose Recyclable Waste of CardBoard");
					System.out.println("Give me a ID of waste");
					int id = entrie.nextInt();
					System.out.println("Give me a Waste name");
					String name = entrie2.nextLine();
					System.out.println("Give me a Waste origin");
					System.out.println("[1] Industrial \n [2] Domiciliary \n [3] Munical \n [4] Building \n [5] Hospital");
					int origin = entrie.nextInt();
					System.out.println("Give me a Waste color");
					String color = entrie2.nextLine();
					System.out.println("Give me a time of descomposition (Days)");
					int timeD = entrie.nextInt();
					System.out.println("Give me a description");
					String description = entrie2.nextLine();
					control.getWastes()[position] = new Plastic(id, name, origin, color, timeD, control.getProductsE()[pofList], description);
					int z = position + 1;
					setPosition(z);
					menu();
				}
			
				
			}else if(optionT == 3) {
				
				System.out.println("You choose Inert Waste");
				System.out.println("Give me a ID of waste");
				int id = entrie.nextInt();
				System.out.println("Give me a Waste name");
				String name = entrie2.nextLine();
				System.out.println("Give me a Waste origin");
				System.out.println("[1] Industrial \n [2] Domiciliary \n [3] Munical \n [4] Building \n [5] Hospital");
				int origin = entrie.nextInt();
				System.out.println("Give me a Waste color");
				String color = entrie2.nextLine();
				System.out.println("Give me a time of descomposition (Days)");
				int timeD = entrie.nextInt();
				System.out.println("Give me a advice to this Waste");
				String advice = entrie.nextLine();
				control.getWastes()[position] = new Inert(id, name, origin, color, timeD, control.getProductsE()[pofList], advice);
				int z = position + 1;
				setPosition(z);
				menu();
				
			}
		}else {
			System.out.println("Select a correct option");
			menu();
		}
	}
	
	/*
	 * This method is when the user select a option2 (Generate a report)
	 * @pre: Main != null;
	 * @param: empty
	 * @return: void
	 * @post: Generate a report
	 */
	
	public void option2() {
		System.out.println("Report");
		
		System.out.println(control.report());
		
		menu();
	}
	
	/*
	 * This method is when the user select a option3 (create a new product)
	 * @pre: Main != null;
	 * @param: empty
	 * @return: void
	 * @post: new product
	 */
	
	public void option3() {
		int a = 0;
		System.out.println("¿How many products would you like add?");
		int amountP = entrie.nextInt();
		control.init(amountP);
		for (int i = 0; i < amountP; i++) {
			System.out.println("Product:" + " " + a);
			System.out.println("Give me a id of product");
			int id = entrie.nextInt();
			System.out.println("Give me a name of Product");
			String name = entrie2.nextLine();
			System.out.println("Give me ea description of Product");
			String description = entrie2.nextLine();
			
			Product current = new Product(id,name,description);
			
			control.getProductsR()[i] = current;
			
			a = a+1;
		}
		menu();
	}
	
	/*
	 * This method is when the user select a option4 (Search a waste by Name of Product id)
	 * @pre: Main != null;
	 * @param: empty
	 * @return: void
	 * @post: Waste found
	 */
	
	public void option4() {
		System.out.println("How would like search");
		System.out.println("By: [1] Name of Waste or [2] Id of product");
		int search = entrie.nextInt();
		if(search == 1) {
			System.out.println("Write the name of Waste");
			String nameW = entrie2.nextLine();
			Waste current = control.searchN(nameW);
			if(current.infoData() == null) {
				System.out.println("The waste doesnt exist");
			}else {
				System.out.println(current.infoData());
			}
			
		}else if(search == 2) {
			System.out.println("Write the id of product");
			int idP = entrie.nextInt();
			Waste current = control.searchIP(idP);
			if(current.infoData() == null) {
				System.out.println("The waste doesnt exist");
			}else {
				System.out.println(current.infoData());
			}
		}else {
			
		}
		menu();
		
	}
	
	/*
	 * This method is when the user select a option5 (List of products)
	 * @pre: Main != null;
	 * @param: empty
	 * @return: void
	 * @post: list of products
	 */
	
	public void option5() {
		System.out.println(control.listProductsE());
		menu();
	}
	
	/*
	 * This method is when the user select a option6 (Calculate the harmful)
	 * @pre: Main != null;
	 * @param: empty
	 * @return: void
	 * @post: Calculate the harmful of waste
	 */
	
	public void option6() {
		System.out.println("What waste do you like search?");
		String name = entrie2.nextLine();
		if(control.searchN(name) == null) {
			System.out.println("The waste doesnt exist");
		}else {
			System.out.println(control.efectTotal(control.searchN(name)));
		}
		
		menu();
	}
	
	/*
	 * This method is when the user select a option7 (Determinate if a waste is usable)
	 * @pre: Main != null;
	 * @param: empty
	 * @return: void
	 * @post: Waste is usable
	 */
	
	public void option7() {
		System.out.println("Please give me a name of biodegradable waste or recyclable to know if is Usable ");
		String name = entrie2.nextLine();
		if(control.searchN(name) instanceof Biodegradable || control.searchN(name) instanceof Recyclable) {
				System.out.println("The waste is usable");
			}else {
				System.out.println("The waste is not usable");
			}
		menu();
		
	}
	
	/*
	 * This method is when the user select a option8 (List of waste depends of harmful)
	 * @pre: Main != null;
	 * @param: empty
	 * @return: void
	 * @post: list
	 */
	
	public void option8() {
		System.out.println("Give me a name of product");
		String nameP = entrie2.nextLine();
		System.out.println(control.efectUp(control.searchNP(nameP)));
		menu();
		
	}

	
}
