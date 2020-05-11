package com.Javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int fac = 1;
		
		for (int i = num; i >0; i--) {
			fac = fac *i;
			
		}
		System.out.println("결과값: " + fac);
	}

}
