package array;

//{ Driver Code Starts

//link: https://www.geeksforgeeks.org/batch/placement-100-2019/track/DSASP-Arrays/problem/leaders-in-an-array-1587115620

import java.io.*;
import java.util.*;
import java.util.stream.*;

class LeadersInAnArray {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter ot = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases

		while (t-- > 0) {

			// input size of array
			int n = Integer.parseInt(br.readLine().trim());
			int arr[] = new int[n];
			String inputLine[] = br.readLine().trim().split(" ");

			// inserting elements in the array
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(inputLine[i]);
			}

			LeadersInAnArraySolution obj = new LeadersInAnArraySolution();

			StringBuffer str = new StringBuffer();
			ArrayList<Integer> res = new ArrayList<Integer>();

			// calling leaders() function
			res = obj.leaders(arr, n);

			for (int i = 0; i < res.size(); i++) {
				ot.print(res.get(i) + " ");
			}

			ot.println();
		}
		ot.close();

	}
}

//} Driver Code Ends

class LeadersInAnArraySolution {
	// Function to find the leaders in the array.
	static ArrayList<Integer> leaders(int arr[], int n) {
		int[] aux = new int[n];
		aux[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			aux[i] = Math.max(arr[i], aux[i + 1]);
		}
		ArrayList<Integer> res = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (arr[i] >= aux[i]) {
				res.add(arr[i]);
			}
		}
		return res;
	}
}