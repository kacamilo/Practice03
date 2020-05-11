package com.Javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("숫자를 입력하세요: ");
		
		int num = 1;
		int i = 1;
		int sum = 0;
		num = sc.nextInt();
		
		while  ( i <= num) {
			if(i == num) {					// 마지막 숫자(num) = i 
				System.out.print(i); 
			}
			else {
				System.out.print(i+"+");		// 마지막 숫자를 제외한 숫자들엔 "+"를 붙여준다
			}
			sum = sum +i;				//sum은 sum +i (1부터 입력숫자num 까지 더해준다)
			i++;								// num 까지 반복해준다
			
		}System.out.println();
		System.out.println("합계: " + sum);
		
		sc.close();
	}	

}
