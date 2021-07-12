package com.day19;
import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
    	
    	int sum = 0;
    	
    	if( n == 1) {
    		
    		return 1;
    	}
    	
    	else {
    		
    		ArrayList<Integer> divisorList = new ArrayList<>();
    		divisorList.add(1);
    		for(int i = 2 ; i <= n ; i++) {
    			if( n % i == 0) {
    				divisorList.add(i);
    			}
    		}
    		
    		
    		for(Integer a: divisorList) {
    			sum = sum + a;
    		}
    		
    	}
    	
    	
    	
        return sum;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
        
    }
}
