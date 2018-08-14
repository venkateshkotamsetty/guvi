/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a1=1,a2=1,a3,i,count;
		System.out.println(a1);
		System.out.println(a2);	
		Scanner s = new Scanner(System.in);
		count = s.nextInt();
		for(i=2;i<count;i++)
		{
			a3 = a1+a2;
			System.out.println(a3);
			a1=a2;
			a2=a3;		
		}
	}
}
