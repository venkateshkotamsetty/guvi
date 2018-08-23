/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int r,s=0;
	            int num;
	            Scanner sc = new Scanner(System.in);
	            num=sc.nextInt();
		int a[]=new int[10];
		while(num>0)
		{
			r=num%10;
			a[s]=r;
			s++;
			num=num/10;
		
		}
		for(int i=s-1;i>=0;i--)
		{
			if(i==0)
			System.out.print(a[i]);
			else
			System.out.print(a[i]+" ");
		}

	
	}
}
