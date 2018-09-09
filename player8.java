/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String r="";
        char f=s1.charAt(0);
        r=r+Character.toUpperCase(f);
        char a[]=s1.toCharArray();
        for(int i=1;i<s1.length();i++)
        {
            char cur=a[i];
            char pre=a[i-1];
            if(pre==' ')
            {
                r=r+Character.toUpperCase(cur);
            }
            else
            {
                r=r+Character.toString(cur);
            }
        }
        System.out.println(r);
        
	}
}
