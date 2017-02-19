package com.javandotherthings.java.hackerrank;

import java.util.Scanner;

public class MinDistance {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        int minDistance = Integer.MAX_VALUE;
        
        for(int i=0; i<a.length; i++)
        {
        	int start = a[i];
        	
        	for(int j=i+1; j<a.length; j++)
        	{
        		int compareTo = a[j];
        		
        		if(start == compareTo)
        		{
        			if(minDistance > (j-i))
        				minDistance = (j-i);
        		}
        	}
        }
        
        if(minDistance == Integer.MAX_VALUE)
        	System.out.println(-1);
        else
        	System.out.println(minDistance);
	}

}
