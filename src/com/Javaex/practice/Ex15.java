package com.Javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		int num = 1;
		int i = 1;
		Scanner sc = new Scanner (System.in);
		System.out.print("숫자를 입력하세요: ");
		num = sc.nextInt();
		
		while (i <= num) {					
			if ( num % i== 0) {			
			
				System.out.println(i);	
			}
			i++;
		}
			
	}

}
