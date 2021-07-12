package com.day8;
import java.util.*;
import java.io.*;

public class Solution {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        Map<String , Integer> phoneBook = new HashMap<>();
        
        for(int i = 0; i < n; i++){
        	
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name,phone);   
            
        }
        
        
        
        System.out.println(phoneBook);
        
        while(in.hasNext()){
            String s = in.next();
            if(phoneBook.get(s) == null)
                System.out.println("Not found");
            else {
                System.out.println(s + "=" + phoneBook.get(s));
            }
        }
        in.close();
    }
}
