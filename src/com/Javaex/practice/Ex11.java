package com.Javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("숫자를 입력하세요");
		int n = 0;
		int even = 0;
		int odd = 0;
		n = sc.nextInt();
		for (int i=1; i<=n; i++ ) {
			if (i % 2 == 0) {
				even +=i;		
				
			} else {
				odd +=i;
			}
		}
		if(n % 2 == 0) {
			System.out.print("결과값: "+ even);
		}
		else {
			System.out.print("결과값: "+ odd);
		}
		
		sc.close();
	}
	
}
