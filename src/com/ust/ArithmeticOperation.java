package com.ust;

public class ArithmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1= 89, num2 = 56;
		System.out.println("sum is:"+(num1+num2));
		System.out.println("subtract is:"+(num1-num2));
		System.out.println("multiplication is:"+(num1*num2));
		System.out.println("division is:"+((float)num1/num2)); //type conversion
		System.out.println("modules is is:"+(num1%num2));
		
		short s = 12;
		int i = s; //widening
		
		float f = 1; //widening
		
		float f1 =  89.678f;
		i= (int)f1; // narrowing (data loss may occur)
		

	}

}
