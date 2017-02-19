package com.javandotherthings.java.hackerrank;

import java.util.Scanner;

public class PairSum {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        int countOfValidPairs=0;
        
        for(int i=0;i <a.length; i++)
        {
        	int current = a[i];
        	for(int j=i+1; j<a.length; j++)
        	{
        		int next = a[j];
        		
        		if((current+next)%k == 0)
        			countOfValidPairs++;
        	}
        }
        
        System.out.println(countOfValidPairs);
	}

}
