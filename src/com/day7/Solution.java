package com.day7;

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
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        bufferedReader.close();
    
        
        int[] a = new int[n];
        
        for(int i = 0; i < n ;i++) {
        	
        	a[i] = arr.get(i);
        }
        
        for(int m = n - 1; m >= 0 ;m--) {
        		System.out.print(a[m] + " ");
        }
        
        
    }
}