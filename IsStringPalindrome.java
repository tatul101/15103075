/**
 * @author Atul 15103075
 * Write a function to check whether Given string is a palindrome or not
 */

package Atul;

import java.util.Scanner;

public class IsStringPalindrome{
	public static void main(String args[]) {
        String str ;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter a String to check whether is palindrome or not \n");
        str = cin.nextLine();
		int left=0,right=str.length()-1;
		boolean flag=true;
		while(left<right)
		{
			if(str.charAt(left)!=str.charAt(right))
			{
				flag=false;
				break;
			}
			left++;
			right--;
		}
        if (flag==true) {
            System.out.println("The Given String is Palindrome");
        } else {
            System.out.println("The Given String is not a Palindrome");
        }
       cin.close();
    }
}

