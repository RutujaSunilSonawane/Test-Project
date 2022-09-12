package com.Stack;

import java.util.Stack;

public class palindromStack {
	

	    public static void main(String[] args) {

	        String input = "ABCDCAB";
	        Stack<Character> stack = new Stack<>();

	        for (int i = 0; i < input.length(); i++) {
	            stack.push(input.charAt(i));
	        }

	        String reverseInput = "";

	        while (!stack.isEmpty()) {
	            reverseInput += stack.pop();
	        }

	        if (input.equals(reverseInput))
	            System.out.println("It is the palindrom");
	        else
	            System.out.println("It is Not palindrom");

	    }
	}


