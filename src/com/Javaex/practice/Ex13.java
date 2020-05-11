package com.Javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num = 1;
		int sum = 0;
		int i = 0;
		System.out.println("숫자를 입력하세요");
		num = sc.nextInt();
		
		while (i<=num) {
			sum = sum+i;
			i++;
		}
		System.out.println("합계: " + sum);
		
	}

}
