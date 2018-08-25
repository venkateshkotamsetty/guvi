/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int n,k=0,s;
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     while(n>0)
     {
     	s=n%10;
     	k=k*10+s;
     	n=n/10;
     	
     }
     System.out.print(k);
	}
}
