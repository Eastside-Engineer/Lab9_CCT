package lab9;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CynnieMarket {
	private static Map<String, Double> menu = new TreeMap<>();

	public static void main(String[] args) {
		populateMenu();
		printMenu();
	}
	
	private static void populateMenu() {
		menu.put("apple", 0.99);
		menu.put("banana", 0.59);
		menu.put("cauliflower", 1.59);
	}
	
	private static void printMenu() {
		for (String name : menu.keySet()) {
			System.out.println(name + "\t" + menu.get(name));
		}
	}

}
//	public static void main(String[] args) {
//		Map<String, Double> menu;
//		List<String> cartGroceries;
//		List<Double> cartPrices;
//mport java.util.List;
//import java.util.Map;
//import java.util.*;

   
    public static Hashtable items = new Hashtable(); //Declaring Hastable Items
//   public static Hashtable<String, double> items =  new Hashtable<String, double>();
  //  public static Hashtable<String, double> items =  new Hashtable();
    public static void main(String[] args) {
        // TODO code application logic here
        
        addItems(); // add items to your hashtable thats created already 
        Scanner scnr = new Scanner(System.in); // input line
        int counter =0; // Keep track of how many items that was ordered 
        String line= ""; //using to capture what item the user wants to order
        double moneyArray[] = new double[99];
        String ItemArray[] = new String[99]; 
        System.out.println("Welcome to Guenther's Market!"); //print out whos market 
        
        String userInput = "y"; // probably should be blank, 
        
        while(userInput == "y")
        {
            displayMenu(); // Prints out Item and Price 
            System.out.println(""); // just printing a blank line for look and feel
            System.out.print("What Item Would you like to order: ");
            line = scnr.nextLine();
            if(validateItemExist(line))
            {
                ItemArray[counter] = line; 
//                moneyArray[counter] = items.get(line);
                counter++; // New item to add
                System.out.print("Would you like to order anything else (y/n)? ");
                userInput = scnr.nextLine();
            }
            else // print out error message 
            {
                System.out.println("Sorry, We dont have those Please try again.");
                System.out.println("");
            }
        }
        
        
//        Map<String, Double> menu;
//        List<String> cartGroceries;
//        List<Double> cartPrices;
     
    }
    
    	public static void displayMenu() 
        {
	        System.out.printf("%-10s %-10s\n", "Item", "Price");
	        String pads = String.format("%20s", "").replace(' ', '=');
	        System.out.printf("%-20s\n", pads);
	        displayItems();
	        
	 }
    public static void displayItems() 
    {
        String names = items.keySet().toString();
        names = names.substring(1);
        names = names.substring(0, names.length()-1);
        String[] name = names.split(", ");
        int j = 0;        
//        for(double i:items.values()) 
//        {
//            System.out.printf("%-10s $%-10s\n", name[j], i);
//            j++;
//	}
    }
    
    //  marks.put("krantz", new Double(245.78)); 
    public static void addItems() 
    {
        items.put("apple" , new Double(0.99));
        items.put("eggs", new Double(2.50));
        items.put("bacon", new Double(3.79));
        items.put("grapes", new Double(4.40));
        items.put("oranges", new Double(2.38));
        items.put("milk", new Double(2.99));
        items.put("cherries", new Double(4.29));
        items.put("cheese", new Double(2.79));
    }
    
    /*
    validateItemExist - 
    being use to validate if an item exist in the hashtable 
    and just returning true or false if that happens 
    */
    public static boolean validateItemExist(String shoppingItem)
    {
        if(items.contains(shoppingItem))
        {
            return true; 
        }
        else
        {
            return false; 
        }
    }
    //print average 
    public static void PrintAverage()
    {
        
    }
    
}



