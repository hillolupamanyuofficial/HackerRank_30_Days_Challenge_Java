package com.day11;

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
	
	
	private ArrayList<Integer> sumOfHourGlass (List<List<Integer>>  arr) {
		
		
		ArrayList<Integer> sumList = new ArrayList();
		
		for(int i = 0 ; i < 4 ; i++) {
			
			
			for(int j = 0 ; j < 4 ; j++) {
				
				int sum = 0;
				
				//Hour Glass
				for(int k = j ; k <= j+2 ; k++) {
					
					if(k == j) {
						sum = sum + arr.get(i+1).get(k+1);
					}
					sum = sum + arr.get(i).get(k);
					sum = sum + arr.get(i+2).get(k);
				}
				
				sumList.add(sum);
				
			}
			
		}

		return sumList;
	}
	
	
	private int largest(ArrayList<Integer> list) {
		int max = list.get(0);
		
		for(Integer n : list) {
			if(n > max)
				max = n;
		}
		
		return max;
	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        
        Solution S1 = new Solution();
        
        ArrayList List = S1.sumOfHourGlass(arr);
        
        int maxSum = S1.largest(List);
        
        System.out.println(maxSum);
        
    }
}