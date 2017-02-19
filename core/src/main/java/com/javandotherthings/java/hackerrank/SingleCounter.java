package com.javandotherthings.java.hackerrank;

import java.util.Scanner;

public class SingleCounter {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        int power = 0;
        
        while(Math.round(t/(3*Math.pow(2, power))) != 0)
        {
        	power++;
        }
        
        long reminder = Math.round(t%(3*Math.pow(2, power-2)));
        
        double timer = (3*Math.pow(2, power-1)) - reminder+1;
        
        System.out.println(timer);
	}

}
