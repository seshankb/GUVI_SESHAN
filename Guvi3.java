import java.util.*;

class Guvi3
{
	public static void main(String[ ] arg)
	{
	int i=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character : ");
	char charecter=sc.next( ).charAt(0);	 
	
	switch(charecter)
	{
	 case  'a' : 
	 case 'e'  :
	 case 'i'  :
	 case 'o'  :
	 case 'u'  :
	 case  'A' :
	 case 'E'  :
	 case 'I'  :
	 case 'O'  :
	 case 'U'  : i++;
	}
	if(i==1)
	System.out.println("Vowel");
	else 
		if((charecter>='a'&&charecter<='z')||(charecter>='A'&&charecter<='Z'))
		System.out.println("Consonent");
		else
		System.out.println("Not an alphabet");		
	}
}
