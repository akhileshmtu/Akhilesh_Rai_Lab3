package com.gl.driver;


import com.gl.services.BalancingBrackets;

public class Driver {

	public static void main(String[] args) {
		

		String expr = "([[{}]])";
		//String expr = "([[{}]]))";

		if (BalancingBrackets.balanceBracket(expr))
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");

	}
		

}
