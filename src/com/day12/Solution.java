package com.day12;
import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{


	
	private int[] testScores;
	
	Student(String firstName, String lastName, int idNumber,int[] testScores) {
		super(firstName, lastName, idNumber);
		
		this.testScores = testScores;
	}

	
	char calculate() {
		char grade = ' ';
		float sum = 0;
		float grader =  0;
		
		for(int i = 0; i < testScores.length ; i++) {
			sum += testScores[i];
		}
		
		grader = (float)(sum/testScores.length) ;
		
		if(grader >= 90)
			grade = 'O';
		
		
		else if(grader >= 80)
			grade = 'E';
		
		else if(grader >= 70)
			grade = 'A';
		
		else if(grader >= 55)
			grade = 'P';
		
		else if(grader >= 40)
			grade = 'D';
		
		else
			grade = 'T';
		
		
		
		
		
		return grade;
	}


}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}