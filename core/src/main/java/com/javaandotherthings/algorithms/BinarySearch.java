package com.javaandotherthings.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {
	
	private static final List<Integer> inputList = new ArrayList<>();

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("Please enter length of String array"); 
		int length = sc.nextInt();

		System.out.print("Please enter array elements: ");
		for (int i = 0; i < length; i++) {
		  inputList.add(sc.nextInt());
		}
		
		System.out.print("Enter the element to be searched: ");
		int search =sc.nextInt();
		
		Collections.sort(inputList);
		
		int start =0;
		int end =inputList.size()-1;
		int result= -1;
		
		while(start <= end) {
			int mid = (start + end)/2;
			
			if(inputList.get(mid) == search) {
				result = mid;
				break;
			} else if(inputList.get(mid) > search) {
				end = mid -1;
			} else if(inputList.get(mid) < search) {
				start = mid +1;
			}
		}
		if(result != -1) {
			System.out.println("Found index in sorted array is: "+result);
		} else {
			System.out.println("Element not found in array");
		}
		sc.close();
	}

}
