import java.util.Scanner;


	public class Test {

	    public static void main(String args[]) {

	       System.out.println("Please enter an integer number");
	       Scanner scnr = new Scanner(System.in);
	       String input = scnr.nextLine();
	       
	       int i = Integer.parseInt(input);
	       
	       System.out.println("String converted to int : " + i);
	       
	       System.out.println("Please enter another integer number");
	       
	       String str = scnr.nextLine();
	       
	       
	       int j = Integer.valueOf(str); // can return cached value
	       
	       System.out.println("String to int using valueOf() : " + j);
	        
	    }

	    
	    
	}




