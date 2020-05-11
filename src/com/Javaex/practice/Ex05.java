package com.Javaex.practice;

public class Ex05 {

	public static void main(String[] args) {
		
		int i=1;
		boolean flag = true;
		
		while(flag) {
				if (i>=5) {		// 0 <= i <= 4
					flag = false;
				}
				System.out.println(i);
				i=i+1;
		}
	}

}
