package com.Javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("숫자를 입력하세요: ");
		
		int num = sc.nextInt();		// 입력값
		int count=0;					// 개수
		int sum = 0;					// 합
		
		for (int a = 1; a<=num; a++) {
			if (a%5==0) {				// a를 나눈 값 5
				count++;				
				sum+=a;				// sum은 0+a
			} 
		
		}	System.out.println("5의 배수의 개수"+"\t"+": " +count);
			System.out.println("5의 배수의 합" +"\t"+ ": " + sum);
	}	
}
