package com.day14;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
  	Difference(int[] elements){
  		this.elements = elements;
  	}
  	
  	void computeDifference() {
  		
  		ArrayList<Integer> absList = new ArrayList();
  		int diff = 0;
  		
  		for(int i = 0; i < elements.length - 1;i++) {
  			
  			for(int j = i+1; j < elements.length ; j++) {
  				
  				diff = Math.abs(elements[i] - elements[j]);
  				absList.add(diff);
  			}
  		}
  		
  		diff = absList.get(0);
  		
  		for(int k = 1 ; k < absList.size();k++) {
  			if(absList.get(k) > diff)
  				diff = absList.get(k);
  			
  		}
  		
  		maximumDifference = diff;
  	}

} 

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
