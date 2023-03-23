package Trainingcodes;

import java.util.Scanner;

public class ArrayCode1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter the count of students:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the marks of student number" +(i+1));
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("The marks of student number" +(i+1)+  " is: "  +arr[i]);
		}
	}

}
