package com.gl.services;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancingBrackets {
	
public static boolean balanceBracket(String expresion) {
		
		//Create Stack
		Deque<Character> stack = new ArrayDeque<Character>();

		//Traverse each character in bracket expression
		for (int i = 0; i < expresion.length(); i++)
		{
			
			char x = expresion.charAt(i);
			
			//check if character is open bracket
			if (x == '(' || x == '[' || x == '{')
			{
				stack.push(x);
				continue;
			}

			if (stack.isEmpty())
				return false;
			
			char check = stack.pop();
			switch (x) 
			{
				case ')':
					if (check == '{' || check == '[')
						return false;
					break;
					
				case '}':
					if (check == '(' || check == '[')
						return false;
					break;

				case ']':
					if (check == '(' || check == '{')
						return false;
					break;
			}
		}

		return (stack.isEmpty());
	}
}
