/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
	            int num=0,key,count=0;
	            Scanner sc = new Scanner(System.in);
	            num=sc.nextInt();
	            key=sc.nextInt();
	            int a[]=new int[10];
	            for(int i=0;i<num;i++)
	            {
	            	a[i]=sc.nextInt();
	            }
	            for(int i=0;i<num;i++)
	            {
	             if(key==a[i])
	             {

	            System.out.print("yes");
	            break;
	             }
	            if(i==num-1) 
	            System.out.println("no");
	            }
	}
}
