package com.javandotherthings.java.hackerrank;

import java.util.Scanner;

public class RepeatedString 
{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        double count = 0;
        
        char[] charArray = s.toCharArray();
        
        for (char c : charArray) 
        {
			if(c == 'a')
				count++;
		}
        
        double repeats = n/s.length();
                
        int leftOver = Math.round(n%s.length());
        
        count *= repeats;
        
        String subString = s.substring(0, leftOver);
        
        char[] charSubArray = subString.toCharArray();
        
        for (char c : charSubArray) 
        {
			if(c == 'a')
				count++;
		}
        
        System.out.println(count);
    }
}
