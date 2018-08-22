/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num,sum=0;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		sum=num*2;
		if(sum%2==0)
		System.out.println(sum);
	}
}
