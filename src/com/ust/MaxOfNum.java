package com.ust;
import java.util.Scanner;

public class MaxOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter num1:");
		a = sc.nextInt();
		System.out.println("Enter num2:");
		b = sc.nextInt();
		int max = a>b?a:b;
		System.out.println("maximum of  num1 and num2 is:"+max);
		
		int c;
		
		System.out.println("Enter num3");
		c = sc.nextInt();
		max = a>b&&a>c?a:b>c?b:c;
		System.out.println("maximum of num1, num2 and num3 is:"+max);
		
		//check is number is odd or even
		
		int number;
		
		System.out.println("enter a number:");
		number = sc.nextInt();
		
		String check = number%2==0?"odd":"even";
		System.out.println("number is "+check);
		System.err.println("ERROR MESSAGE!!!");
		sc.close();
	

	}

}
