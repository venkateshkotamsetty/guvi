/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s1;
		int k;
		Scanner s=new Scanner(System.in);
		s1=s.next();
		k=s.nextInt();
		int n=s1.length();
		char a[]=s1.toCharArray();
		for(int i=n-k;i<n;i++)
		{
		System.out.print(a[i]);
		}
	}
}
