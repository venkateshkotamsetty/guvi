/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int p,key;
	     Scanner sc=new Scanner(System.in);
	     p=sc.nextInt();
	     key=sc.nextInt();
                 int a[]=new int[10];
                 for(int i=0;i<p;i++)
                 {
                 	a[i]=sc.nextInt();
                 }
                 for(int i=0;i<p;i++)
                 {
                 	
                 	 
                 	 if(key==a[i])
                 	 System.out.print(key);
                 }
	}
}
