
public class extra {
	public static void printPattern(int n) {
		if (n<1)throw new IllegalArgumentException("Negative number");
		
		if (n==1)  System.out.println(printSpaces(n+(n-1)) + "1" + printSpaces(n+(n-1)));
		
		
		
		else {
			System.out.println(printSpaces(n+(n-1)) + n + printSpaces(n+(n-1)));
			printPattern(n+1);
		}
		
		
	}
	

	  
	private static String printSpaces(int n) {
		if (n==1) return "     ";
		else return " "+printSpaces(n-1);
		

	}
}
