/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
	            String str2="";
 
	for(int i=str.length()-1;i>=0;--i){
	str2 +=str.charAt(i);
		}
 
	if(str2.equalsIgnoreCase(str))
	System.out.println("yes");
	
	else
		System.out.println("no");
	}
}
