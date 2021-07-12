package com.day10;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
	
	
	 private ArrayList<Integer>  returnBinary (int num){
		
		ArrayList<Integer> binaryList = new ArrayList();
		
		while(true) {
			
			binaryList.add(num%2);
			num = num/2;
			
			if(num == 1 ){
				
				binaryList.add(1);
				break;
			}
			
			else if(num == 0 ){
				
				binaryList.add(0);
				break;
			}
			
		}
		
		ArrayList revList = new ArrayList();
		
		for( int i = binaryList.size() - 1; i >= 0 ; i--) {
			 revList.add(binaryList.get(i));
		}
		
		
		return revList;
	}
	
	 
	 private int noOfOnes(ArrayList<Integer> list) {
		 
		 int maxOne = 0;
		 int countOne = 0;
		 for(int i = 0; i < list.size();i++) {
			 
			 if(list.get(i) == 1) {
				 countOne++;
			 
				 if(i == list.size() - 1) {
					 
					 if(countOne > maxOne) {
						 maxOne = countOne;
					 }
				 }
			 }
			 
			 
				 
			 else{
				 if(countOne > maxOne) {
					 maxOne = countOne;
				 }
				 
				 countOne = 0;
			 }
			 
		 }
		 
		 return maxOne;
	 }
	
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        Solution S1 = new Solution();
        
        ArrayList List = S1.returnBinary(n);
        
        int answer = S1.noOfOnes(List);
        System.out.println(answer);
    }
}