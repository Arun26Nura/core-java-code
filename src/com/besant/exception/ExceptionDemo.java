package com.besant.exception;

import java.util.Objects;
//Example for exception handling using throws
public class ExceptionDemo {

	public static void main(String[] args) {
		try{
			add();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static void add()throws Exception {
		remove();
	}

	private static void remove() throws Exception{
		String name="";
		int roll=12345;
		if(Objects.nonNull(name) && !name.isEmpty() && roll >=0) {
			System.out.println(name +":"+roll);
		}else {
			throw new CustomCompileTimeException("Name or Roll is not valid");
		}
		
	}

}
