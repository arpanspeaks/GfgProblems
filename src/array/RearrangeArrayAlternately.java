package array;

//{ Driver Code Starts

//https://www.geeksforgeeks.org/batch/placement-100-2019/track/DSASP-Arrays/problem/-rearrange-array-alternately-1587115620

import java.util.*;
import java.lang.*;
import java.io.*;

class RearrangeArrayAlternately {
	public static void main(String[] args) throws IOException {

//		Scanner in = new Scanner(System.in);

//		int t = in.nextInt();
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

		// testcases
		int t = Integer.parseInt(read.readLine());

		while (t-- > 0) {
			// size of array
			int n = Integer.parseInt(read.readLine());
			long[] arr = new long[n];

			String str[] = read.readLine().trim().split(" ");

			// adding elements to the array
			for (int i = 0; i < n; i++)
				arr[i] = Long.parseLong(str[i]);

			// StringBuffer sb = new StringBuffer();

			RearrangeArrayAlternatelySolution ob = new RearrangeArrayAlternatelySolution();

			// calling rearrange() function
			ob.rearrange(arr, n);
			StringBuffer sb = new StringBuffer();

			// appending and printing the elements
			for (int i = 0; i < n; i++)
				sb.append(arr[i] + " ");
			System.out.println(sb);
		}
	}
}

//} Driver Code Ends

class RearrangeArrayAlternatelySolution {

	// temp: input array
	// n: size of array

	// Function to rearrange the array elements alternately

	public static void rearrange(long arr[], int n) {

		// Sol #1:
		// ArrayList<Long> aux = new ArrayList<>();
		// int l=0, r=n-1;

		// while(l<=r) {
		// aux.add(arr[r]);
		// r--;
		// aux.add(arr[l]);
		// l++;
		// }

		// for(int i=0; i<n; i++) {
		// arr[i] = aux.get(i);
		// }

		// Sol #2:
		long tmp = arr[n - 1] + 1;
		int l = 0, r = n - 1;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				arr[i] += (arr[r] % tmp) * tmp;
				r--;
			} else {
				arr[i] += (arr[l] % tmp) * tmp;
				l++;
			}
		}

		for (int i = 0; i < n; i++) {
			arr[i] /= tmp;
		}

	}

}