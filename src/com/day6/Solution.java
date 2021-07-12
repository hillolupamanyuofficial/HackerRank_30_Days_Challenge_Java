package com.day6;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T ; i++) {
			
			String S = sc.next();
			
			String s1 = "";
			String s2 = "";
			
			for(int j = 0 ; j < S.length() ;j++) {
				
				if(j % 2 == 0) {
					
					s1 = s1 + S.charAt(j);
				}
				
				else {
					
					s2 = s2 + S.charAt(j);
				}
				
			}
			
			System.out.println(s1 + " " + s2);
		}
		
		sc.close();
		}

}
