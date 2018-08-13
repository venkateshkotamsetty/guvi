/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num1,num2;
		Scanner s = new Scanner(System.in);
		num1=s.nextInt();
		num2=s.nextInt();
		num1=num1^num2;
		num2=num1^num2;
		num1=num1^num2;
		System.out.println(num1+" "+num2);
		
	}
}
