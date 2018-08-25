/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,k=1,s;
		Scanner s1 = new Scanner(System.in);
		n=s1.nextInt();
		while(n>0)
		{
			s=n%10;
			k=s*k;
			n=n/10;
		}
		System.out.print(k);
	}
}
