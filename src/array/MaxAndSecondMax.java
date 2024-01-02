package array;

// Link: https://www.geeksforgeeks.org/batch/placement-100-2019/track/DSASP-Arrays/problem/max-and-second-max

//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

//} Driver Code Ends

//Solution class to implement function largestAndSecondLargest
class MaxAndSecondMaxSolution {

	// Function to find largest and second largest element in the array
	public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[]) {
		int largest = -1, secondLargest = -1;
		for(int ele : arr) {
			if(ele > largest) {
				secondLargest = largest;
				largest = ele;
			} else if(ele > secondLargest && ele != largest) {
				secondLargest = ele;
			}
		}
		return new ArrayList<>(Arrays.asList(largest, secondLargest));
	}
}

//{ Driver Code Starts.

//Driver class
class MaxAndSecondMax {

	// Driver code
	public static void main(String[] args) throws IOException {
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testcases = Integer.parseInt(br.readLine());

		// looping through all testcases
		while (testcases-- > 0) {
			int sizeOfArray = Integer.parseInt(br.readLine());

			int arr[] = new int[sizeOfArray];

			String line = br.readLine();
			String[] elements = line.trim().split("\\s+");

			for (int index = 0; index < sizeOfArray; index++) {
				arr[index] = Integer.parseInt(elements[index]);
			}

			MaxAndSecondMaxSolution obj = new MaxAndSecondMaxSolution();
			ArrayList<Integer> res = new ArrayList<Integer>();
			res = obj.largestAndSecondLargest(sizeOfArray, arr);
			System.out.println(res.get(0) + " " + res.get(1));
		}
	}
}
//} Driver Code Ends