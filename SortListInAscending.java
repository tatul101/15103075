/**
 * @author Atul 15103075
 */

package Atul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortListInAscending{

	
	public static void main(String[] args) throws IOException
    {
            BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter The number of Names :");
            int N= Integer.parseInt(br.readLine());
            String Names[] = new String[n];
            System.out.println();
			System.out.print("Enter Name " + i + ":");
            for (int i = 1; i <= N; i++)
                Names[i-1] = buff.readLine();
            System.out.println("Names in Ascending Order are :");
            System.out.println();
            for (int j = 0; j < Names.length; j++)
            {
                for (int i = j + 1; i < Names.length; i++)
                {
                    if (Names[i].compareToIgnoreCase(Names[j]) < 0)
                    {
                        String temp = Names[j];
                        Names[j] = Names[i];
                        Names[i] = temp;
                    }
                }
                System.out.println(names[j]);
            }
    }

	
}
