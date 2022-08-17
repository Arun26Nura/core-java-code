package com.besant.exception;

import java.util.Scanner;
// Example for exception handling using try-catch-finally
public class ExceptionClass {

	public static void main(String[] args) {
		add();
		System.out.println("Add Method ended");
	}
	
	public static Integer add() {
		Scanner scan=null;
		try {
			String names=null;
			names.length();
			scan= new Scanner(System.in);
		System.out.println("Enter int");
			int a= scan.nextInt();
			System.out.println("Enter name");

		String name=scan.next();
		int b=name.length();
		scan.close();
		return a/b;
		}catch(NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.err.println("Null Pointer happened in dividing");
			return 0;
		}finally {
			if(scan!=null)
				scan.close();
			
		}
	}

}
