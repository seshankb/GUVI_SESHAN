/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


public class Guvi2
{
	
        public static void main (String[] args)
	{
          Scanner input = new Scanner(System.in);
          int numericValue = input.nextInt();
            int numeric = numericValue % 2; 
            
		if(numeric == 0 && numeric != numericValue)
                            System.out.println("even");
                else if(numeric == 1)
                            System.out.println("odd");
                else
                            System.out.println("Zero or negative value"); 
	}	
}

