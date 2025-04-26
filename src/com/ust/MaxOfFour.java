package com.ust;

import java.util.Scanner;

public class MaxOfFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3,num4,num5;
		;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter num1:");
		num1 = sc.nextInt();
		System.out.println("Enter num2:");
		num2 = sc.nextInt();
		System.out.println("Enter num2:");
		num3 = sc.nextInt();
		System.out.println("Enter num2:");
		num4 = sc.nextInt();
		System.out.println("Enter num5");
		num5 = sc.nextInt();
		
		int max = num1>num2&&num1>num3&&num1>num4?num1:(num2>num3&&num2>num4)?num2:(num3>num4)?num3:num4;
		System.out.println("maximum of 4 numbers is:"+max);
		
		max = num1>num2&&num1>num3&&num1>num4&&num1>num5?num1:(num2>num3&&num2>num4&&num2>num5)?num2:(num3>num4&&num3>num5)?num3:(num4>num5)?num4:num5;
		System.out.println("maximum of 5 number is:"+max);

		sc.close();
	}

}
