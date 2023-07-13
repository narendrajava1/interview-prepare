package test;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int arr[] = { 1, 5, 8, 4, 6 ,4};
		int temp = 0;
		int k=0;
		int n=arr.length;
		int[] temparr = new int[n];  
	        for (int i=0; i < n-1; i++){  
	            if (arr[i] != arr[i+1]){  
	                arr[k++] = arr[i];  
	            }  
	        }  
	        arr[k++] = arr[n-1]; 
	        System.out.println(k);
		System.out.println("original"+Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
