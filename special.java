/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int count=0,i;
		char c;
		String s1;
		Scanner s=new Scanner(System.in);
		s1=s.nextLine();
		for(i=0;i<s1.length();i++)
		{
			c=s1.charAt(i);
			if(Character.isDigit(c));
			else if(Character.isLetter(c));
			else if(c==' ');
			else
			count++;
			
		}
		
	
	
	System.out.println(count);
}
	
}
