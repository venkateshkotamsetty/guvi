/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,avg=0,i,sum=0;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int a[]=new int[10];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			sum = sum+a[i];
			avg = (sum / n);
		}
		System.out.println(avg);
		
	}
}
