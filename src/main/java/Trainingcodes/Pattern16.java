package Trainingcodes;

import java.util.Scanner;

public class Pattern16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		if (age<18) {
			System.out.println("You are still a minor.Please grow up!!!");
		}
		else if(age>65) {
			System.out.println("You are a senior citizen.Stop over expectation");
		}
		else {
			System.out.println(" Congratulations you are in the list of most eligible grooms");
		}
	}
		

}
