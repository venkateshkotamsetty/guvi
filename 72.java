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
		int i,c=0;
		Scanner s=new Scanner(System.in);
		s1=s.next();
		char b[]=s1.toCharArray();
		for(i=0;i<s1.length();i++)
		{
			
     if((b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u')||(b[i]=='A'||b[i]=='E'||b[i]=='I'||b[i]=='O'||b[i]=='U'))
			c=1;
		}
		if(c==1)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
