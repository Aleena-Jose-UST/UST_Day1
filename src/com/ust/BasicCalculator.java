package com.ust;
import java.util.Scanner;

public class BasicCalculator {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two number:");
		int op1 = sc.nextInt();
		int op2 = sc.nextInt();
		
		System.out.println("Enter opertor:");
		char op = sc.next().charAt(0); //to read  char, read a string and pick nth index value
		
		if(op =='+')
			System.out.println(op1+op2);
		else if(op =='-')
			System.out.println(op1-op2);
		else if(op =='*')
			System.out.println(op1*op2);
		else if(op =='/')
			System.out.println((float)op1/op2);
		else if(op =='%')
			System.out.println(op1%op2);
		else
			System.out.println("invalid operator");
		sc.close();
	}
}
