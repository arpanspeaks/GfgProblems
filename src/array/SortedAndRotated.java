package array;

// link: https://www.geeksforgeeks.org/batch/placement-100-2019/track/DSASP-Arrays/problem/check-if-array-is-sorted-and-rotated-clockwise-1587115620

//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

//} Driver Code Ends

class SortedAndRotatedSolution {

	// arr[]: input array
	// num: size of array
	// Function to check if array is sorted and rotated
	public static boolean checkRotatedAndSorted(int arr[], int num) {

		// Your code here

		int incr = 0, decr = 0;
        for(int i=0; i<num-1; i++) {
            if(arr[i] < arr[i+1]) incr++;
            else if(arr[i] > arr[i+1]) decr++;
        }
        if(incr == 0 || decr == 0) return false;
        if(arr[0] > arr[num-1]) incr++;
        else decr++;
        return incr == 1 || decr == 1;

	}

}

//{ Driver Code Starts.

class SortedAndRotated {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine()); // input size of array
			int arr[] = new int[n];
			String inputLine[] = br.readLine().trim().split("\\s+");
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
			}

			SortedAndRotatedSolution obj = new SortedAndRotatedSolution();

			if (!(obj.checkRotatedAndSorted(arr, n)))
				System.out.println("No"); // print the result
			else
				System.out.println("Yes");
		}
	}
}

//} Driver Code Ends
