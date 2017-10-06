import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
      Scanner input = new Scanner(System.in);
      int numericValue = input.nextInt();
if(numericValue > 0) 
{comapre(numericValue);
}
      

else if(numericValue < 0)
{      numericvalue *= -1;
       comapre(numericValue);       }
}
public void compare(numericValue) 
{              
            int numeric = numericValue % 2; 
            if(numeric == 0 && numeric != numericValue)
              System.out.println("even");
            else if(numeric == 1)
              System.out.println("odd");
            else
              System.out.println("Neither odd nor even :Zero"); 
}	}
   }
}
