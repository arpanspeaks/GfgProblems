package array;

//{ Driver Code Starts
//Initial Template for Java

//https://www.geeksforgeeks.org/batch/placement-100-2019/track/DSASP-Arrays/problem/rotate-array-by-n-elements-1587115621

import java.util.*;
import java.io.*;
import java.lang.*;

class RotateArray {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		// taking testcases
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			String str = br.readLine();
			String[] starr = str.split(" ");

			// input n and d
			int n = Integer.parseInt(starr[0]);
			int d = Integer.parseInt(starr[1]);

			int[] arr = new int[n];
			String str1 = br.readLine();
			String[] starr1 = str1.split(" ");

			// inserting elements in the array
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(starr1[j]);
			}

			// calling rotateArr() function
			new RotateArraySolution().rotateArr(arr, d, n);
			StringBuffer sb = new StringBuffer();

			// printing the elements of the array
			for (int t1 = 0; t1 < n; t1++)
				sb.append(arr[t1] + " ");
			out.println(sb);
		}
		out.close();
	}
}

//} Driver Code Ends

//User function Template for Java

class RotateArraySolution {
	// Function to rotate an array by d elements in counter-clockwise direction.

	static void rotateArr(int arr[], int d, int n) {
		d = d % n;
		reverse(arr, 0, d - 1);
		reverse(arr, d, n - 1);
		reverse(arr, 0, n - 1);
	}

	static void reverse(int arr[], int l, int r) {
		while (l < r) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
	}
}