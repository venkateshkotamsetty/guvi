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
		String s2="";
		String s3="";
		char a[]=s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
		if(i%2==0)
		s2=s2+a[i];
		else
		s3=s3+a[i];
		}
		System.out.print(s2+" "+s3);
	}
}
