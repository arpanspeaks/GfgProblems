package array;

//link: https://www.geeksforgeeks.org/batch/placement-100-2019/track/DSASP-Arrays/problem/mean-and-median-1587115620

//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class MeanAndMedian {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// testcase
		int T = sc.nextInt();

		// looping testcase
		while (T-- > 0) {
			MeanAndMedianSolution obj = new MeanAndMedianSolution();
			int N;

			// number of elements in array
			N = sc.nextInt();
			int a[] = new int[N];

			// inseting elements in the array
			for (int i = 0; i < N; i++) {
				int x = sc.nextInt();
				a[i] = x;
			}

			// calling mean() and median() functions
			System.out.println(obj.mean(a, N) + " " + obj.median(a, N));

		}

	}
}

//} Driver Code Ends

//User function Template for Java

class MeanAndMedianSolution {
//Function to find median of the array elements.  
	public int median(int A[], int N) {

		Arrays.sort(A);

		// Your code here
		// If median is fraction then convert it to integer and return
		
		return N%2 == 1 ? A[N/2] : (A[N/2] + A[N/2 - 1]) / 2;
		
	}

	// Function to find median of the array elements.
	public int mean(int A[], int N) {
		int total = Arrays.stream(A).reduce(0, (acc, ele) -> acc + ele);
		return total / N;
	}

}