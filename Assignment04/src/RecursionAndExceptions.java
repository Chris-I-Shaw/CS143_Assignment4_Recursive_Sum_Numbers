/*
 * Chris Shaw
 * CS 143 Java 2
 * 7/31/19
 * Recursion Problems
 */
public class RecursionAndExceptions {
	
	public static void main(String[] args) {
		//Create Array for arraySum()
		int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
		int[] intArray2 = new int[] {};
		
		//Try Catch block to catch exceptions
		try {
		
		//Test for the recursive sum method
		System.out.println(recursiveSum(5));
		
		//Test to throw exception
	//	System.out.println(recursiveSum(-1));		
		
		//Test for the Array Sum Method
		System.out.println(arraySum(intArray));
		
		//Test for array of 0 elements
	//	System.out.println(arraySum(intArray2));
		
		//Test for the Pattern Method
		printPattern(5);
		
		//Test to throw exception
	//	printPattern(-1);
		
		//Catches IllegalArgumentException
		} catch(IllegalArgumentException e ) {
			System.out.println(e.getMessage());
		
	}
		
		
		
	}
	/**
	 * Takes in an integer end recursively adds every integer value below it
	 * @param n Integer value to be recursed
	 * @return returns the integer sum of the function
	 */
	public static int recursiveSum(int n) {
		
		if (n<1)throw new IllegalArgumentException(n + " is a negative number");
		
		if(n==1) {
			
			return 1;
			
		} else {
			return (n + recursiveSum(n-1));
		}
		
	}
	
	
	/**
	 * Accepts an Array And verifies that it is not empty
	 * Then creates an index and passes the array to a private method
	 * 
	 * @param intArray Array specified in main to be added
	 * @return the sum of the array
	 */
	public static int arraySum(int [] intArray) {
		if(intArray.length == 0 )throw new IllegalArgumentException("Empty Array");
		int n=intArray.length;
		return arraySum(intArray, n);
	}
	
	/**
	 * Private method to add the array recursively
	 * @param intArray Array specified in main to be added
	 * @param n the index passed from public method
	 * @return the sum of the array
	 */
	private static int arraySum(int [] intArray, int n) {
		
		if (n<1)return 0;
		
		return  arraySum(intArray, n-1) + intArray[n-1];
		
	}
	

	
	/**
	 * Method to print a pattern using 2 recursive methods
	 * @param n integer value to generate n lines in the pyramid
	 */
	public static void printPattern(int n) {
		 
	       if(n < 1) throw new IllegalArgumentException("Parameter must be greater than 0");
	       
	       printLine(n, 0);
	        
	}
	/**
	 * Method to generate number of spaces needed
	 * @param n value passed from pattern method to be the last digit used to construct pyramid
	 * @param spaces
	 */
	public static void printLine(int n, int spaces) {
	    	
		 if(n==0) return;
	        
	     else {
	        	
	    	 printLine(n - 1, spaces + 1);
	         printChar(n, spaces);
	         System.out.println("");
	            
	     }
	}
	    
	/**
	 * Recursive method to Construct pyramid
	 * @param n value passed from pattern method to be the last digit used to construct pyramid
	 * @param spaces number of spaces to be printed
	 */
	public static void printChar(int n, int spaces) {
	    	
	    if(spaces > 0) {
	        	
	        System.out.print(" ");
	        printChar(n, spaces - 1);
	            
	}
	        
	    else {
	        	
	        if(n==1) System.out.print("1");
	            
	        else {
	           	
	            System.out.print(n);
	            printChar(n - 1, 0);
	            System.out.print(n);
	               
	           }   
	       }
	   }
	

}

