/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	            int n=1;
	            String s1;
	            Scanner sc = new Scanner(System.in);
	            s1=sc.next();
	            char a[]=s1.toCharArray();
	            for(int i=0;i<s1.length();i++)
	            {
	            	if(a[i]!='0'&&a[i]!='1')
	            	n=0;
	            }
	            if(n==0)
	            System.out.print("no");
	            else
	            System.out.print("yes");
	            
	}
}
