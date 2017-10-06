import java.util.*;

public class Guvi1 {
   public static void main(String[] args)
   { 
      Scanner input = new Scanner(System.in);
      /*error will be generated for other than integer */
         int numericValue = input.nextInt();
              if( numericValue == 0)
                     {
                     System.out.println("zero");
                     }
              else if (numericValue > 0)
                     {
                     System.out.println("positive"); 
                     }
              else if (numericValue < 0 )
                     {
                     System.out.println("negative"); 
                     }
              else
              {
                 System.out.println("InputMismatchException");
              }
  }
                  }
