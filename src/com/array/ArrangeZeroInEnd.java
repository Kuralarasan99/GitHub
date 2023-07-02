package com.array;

import java.util.Arrays;

public class ArrangeZeroInEnd {
	public static void rearrangeArray(int[] arr) {
	    int n = arr.length;
	    int j = 0;
	    for (int i = 0; i < n; i++) {
	        if (arr[i] != 0) {
	            arr[j] = arr[i];
	            j++;
	        }
	    }
	    while (j < n) {
	        arr[j] = 0;
	        j++;
	    }
	}
	

	public static void main(String[] args) {
	    int[] arr = {23, 0, 3, 0, 26, 0, 1, 0};
	    System.out.println("Input Array: " + Arrays.toString(arr));
	    rearrangeArray(arr);
	    System.out.println("Output Array: " + Arrays.toString(arr));
	}


}
