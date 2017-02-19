package com.javandotherthings.java.hackerrank;

import java.util.Scanner;

public class BonEat 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
        int k = in.nextInt();
        
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        int charged = in.nextInt();
        
        int actualCharged = 0;
        
        for(int i=0;i <n; i++)
        {
        	if(i == k)
        		continue;
        	
        	actualCharged += a[i];
        }
        
        if(charged == actualCharged/2)
        	System.out.println("Bon Appetit");
        else
        	System.out.println(charged-(actualCharged/2));
	}
}
