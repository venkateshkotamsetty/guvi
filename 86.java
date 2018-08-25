/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int c=0;
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		char a[]=s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+1;j<s1.length();j++)
			{
				if(a[i]==a[j])
				c=1;
			}
		}
		if(c==0)
		System.out.print("Yes");
		else
		System.out.print("No");
	}
}
