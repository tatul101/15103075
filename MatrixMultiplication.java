/**
 * @author Atul 15103075
 * Write a function to multiply Two matrix
 */

package Atul;

import java.util.Scanner;

public class MatrixMultiplication {

public static void main(String args[])

{
    int N;
    Scanner cin=new Scanner(System.in);
    System.out.println("Enter the dimmensions of square matrix");
    N=cin.nextInt();
    int a[][]=new int[N][N];
    int b[][]=new int[N][N];
    int c[][]=new int[N][N];
    System.out.println("Enter the elements of matrix A");
    for(int i=0;i<N;i++)
		for(int j=0;j<N;j++)
			a[i][j]=cin.nextInt();
    System.out.println("Enter the elements of matrix B");
    for(int i=0;i<N;i++)
		for(int j=0;j<N;j++)
			b[i][j]=cin.nextInt();
    System.out.println("Multiplying the matrices....");
    for(int i=0;i<N;i++)
		for(int j=0;j<N;j++)
			for(int k=0;k<N;k++)
				c[i][j]=c[i][j]+a[i][k]*b[k][j];
    System.out.println("the product of Matrix is:");
    for(int i=0;i<N;i++)
	{
		for(int j=0;j<N;j++)
			System.out.print(c[i][j]+"   ");
		System.out.println();
	}
    
		cin.close();
 }
}
