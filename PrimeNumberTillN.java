/**
 * @author Atul 15103075
 * Write a Java program that prompts the user for an integer and then prints out all prime numbers up to that integer.
 */
package Atul;

import java.util.Scanner;

public class PrimeNumberTillN
{
	public static void main(String[] args)
		{
			int N;
			boolean flag=false;
			Scanner cin=new Scanner(System.in);
			System.out.println("Enter Number upto which number prime numbers are to be printed : ");
			N=cin.nextInt();
			for(int i=2;i<N;i++)
			{
				flag=false;
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					{
						flag=true;
						break;
					}
				}
				if(flag==false)
				System.out.println(i);
					
			}
			cin.close();
		}
	}
}

