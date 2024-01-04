package array;

// link: https://www.geeksforgeeks.org/batch/placement-100-2019/track/DSASP-Arrays/video/MTE1OA%3D%3D

//{ Driver Code Starts
//Initial Template for Java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReverseInGroups {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases

		// while testcases exist
		while (t-- > 0) {

			String inputLine1[] = br.readLine().trim().split(" ");
			int n = Integer.parseInt(inputLine1[0]);
			int k = Integer.parseInt(inputLine1[1]);

			ArrayList<Integer> arr = new ArrayList<>();
			String inputLine2[] = br.readLine().trim().split(" ");
			for (int i = 0; i < n; i++) {
				arr.add(Integer.parseInt(inputLine2[i]));
			}

			ReverseInGroupsSolution obj = new ReverseInGroupsSolution();
			obj.reverseInGroups(arr, n, k);

			StringBuffer str = new StringBuffer();
			for (int i = 0; i < n; i++) {
				str.append(arr.get(i) + " ");
			}
			System.out.println(str);
		}
	}
}

//} Driver Code Ends

//User function Template for Java

class ReverseInGroupsSolution {
	// Function to reverse every sub-array group of size k.

	// //Sol #1
	// void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
	// int i=0;
	// for(i=0; i<n; i+=k) {
	// if(i+k-1 < n) {
	// reverse(arr, i, i+k-1);
	// } else {
	// break;
	// }
	// }
	// if(n%k != 0) {
	// reverse(arr, i, n-1);
	// }
	// }

	// Sol #2
	void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
		int i;
		for (i=0; i<n; i+=k) {
			if (i+k-1<n) {
				reverse(arr, i, i+k-1);
			}
		}
		if (n%k!=0) {
			reverse(arr, n-n%k, n-1);
		}
	}

	// Sol #3
	// void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
	// for(int i=0; i<n/k; i++) reverse(arr, i*k, i*k+k-1);
	// if(n%k != 0) reverse(arr, n-n%k, n-1);
	// }

	void reverse(ArrayList<Integer> arr, int l, int r) {
		while (l < r) {
			int temp = arr.get(l);
			arr.set(l, arr.get(r));
			arr.set(r, temp);
			l++;
			r--;
		}
	}
}