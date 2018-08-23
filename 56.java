/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
	            int num,v=0,u=0,sum=0;
	            Scanner sc = new Scanner(System.in);
	            String s1;
	            s1=sc.next();
	            char a[]=s1.toCharArray();
	            for(int i=0;i<s1.length();i++)
	            {
	            	if((a[i]>='A'&&a[i]<='Z')||(a[i]>='a'&&a[i]<='z'))
	            	v=1;
	            	else if(a[i]>='0'&&a[i]<='9')
	            	u=1;
	            }
	            sum=v+u;
	            if(sum==2)
	            System.out.println("yes");
	            else
	            System.out.println("no");
	            
	
	}
}
