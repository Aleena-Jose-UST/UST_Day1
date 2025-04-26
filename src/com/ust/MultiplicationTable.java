package com.ust;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("enter a number:");
		num = sc.nextInt();
		System.out.println("multiplication table of "+num);
		for(int i=1;i<=10;i++) {
			int multiply = i*num;
			System.out.println(i+" * "+num+" = "+multiply);
		}
		
		sc.close();
		

	}

}
