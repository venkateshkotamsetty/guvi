/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int k,sum=1,n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
		while(k>0)
		{
		sum=sum*n;
		k--;
		}
		System.out.print(sum);
		
	}
}
