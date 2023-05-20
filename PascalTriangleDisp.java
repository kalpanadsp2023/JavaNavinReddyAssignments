import java.util.Scanner;
import java.util.*;

public class PascalTriangleDisp {

	public static void main(String[] args) {
		
		// Get the value from the user for the number of lines to display.
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the number of lines to be generated in the pasacal triangles.");
		int nLines = in.nextInt();
		// Create an 2D ArrayList to store the elements 
		ArrayList<ArrayList<Integer>> arrList = new ArrayList<>(nLines);
		for (int i = 0; i < nLines; i++)
		{
			arrList.add(new ArrayList<>());
		}
		// Iterative loop to generate the values in each line
		for (int i = 0; i < nLines; i++)
		{			
			for (int j = 0; j <= i; j++)
			{
				if ( i == 0 || j == 0 || i == j)
					arrList.get(i).add(j,1);
				else
					arrList.get(i).add(j, arrList.get(i-1).get(j-1) + arrList.get(i-1).get(j));
			}
			System.out.println(arrList.get(i));
		}
		if (in != null)
			in.close();

	}

}
