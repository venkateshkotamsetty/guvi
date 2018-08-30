/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int l,w,h,sum=0,v;
		Scanner s=new Scanner(System.in);
		l=s.nextInt();
		w=s.nextInt();
		h=s.nextInt();
		sum=2*(l*w+w*h+h*l);
		v=l*w*h;
		System.out.print(sum+" "+v);
	}
}
