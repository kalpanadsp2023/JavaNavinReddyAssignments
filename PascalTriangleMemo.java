import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangleMemo {

	public static void main(String[] args) {
		// Get the value from the user for the number of lines to display.
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the number of lines to be generated in the pasacal triangles.");
		int nLines = in.nextInt();
		// Create an 2D ArrayList to store the elements
		ArrayList<ArrayList<Integer>> arrList = new ArrayList<>(nLines);
		for (int i = 0; i < nLines; i++)
			arrList.add(new ArrayList<>());
		// Iterative loop to generate the values in each line
		for (int i = 0; i < nLines; i++)
		{
			// Find the number of unique values that will be generated in each line
			// Assign that unique count to mid
			int mid = 0;
			if((i+1) % 2 != 0)
				mid = i/2 + 1;
			else
				mid = (i+1)/2;
			// Generate the unique values in each line
			for (int j = 0; j <= mid; j++)
			{
				if (j == 0 || j == i)
					arrList.get(i).add(j,1);
				else 
					arrList.get(i).add(j, arrList.get(i-1).get(j-1) + arrList.get(i-1).get(j));
				// Special condition for line1
				if (i == 0)
					j++;
			}
			// Copy already generated unique values to the rest of the array in the line
			for(int k = mid+1; k <= i; k++)
				arrList.get(i).add(k, arrList.get(i).get(i-k));
			System.out.println(arrList.get(i));
		}

		if (in != null)
			in.close();
	}

}
