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
        String s=sc.nextLine();
        String s1="";
        String s2="";
        String sum="";
        String ans="";
        char c[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0 && i<s.length()-1)
            {
                char temp=c[i];
                c[i]=c[i+1];
                c[i+1]=temp;
                s1=Character.toString(c[i]);
                s2=Character.toString(c[i+1]);
                sum=s1.concat(s2);
                ans=ans.concat(sum);
            }
            else if(i==s.length()-1)
            {
                ans=ans.concat(Character.toString(c[i]));
            }
            i++;
        }
        System.out.println(ans);
	}
}
