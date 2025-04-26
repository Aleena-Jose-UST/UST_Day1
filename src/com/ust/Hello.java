package com.ust;

public class Hello {

	String name; //instance variable or non static variables
	
	static String companyName; //static variables or class variables
	//single line command
	
	/*multi line command
	 *first java program
	 */
	public static void main(String [] args) {
		System.out.println("Hello UST");
		
		int id = 123; //local variables
		System.out.println("my id:"+ id);
		
		int num1, num2;
		num1 = 56;
		num2 = 78;
		int res = num1+num2;
		System.out.println("sum is:"+res);
	}

}
