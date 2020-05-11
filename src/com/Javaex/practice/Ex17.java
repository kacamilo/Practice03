package com.Javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
			int num;
			Scanner sc = new Scanner (System.in)	;
			System.out.print("숫자를 입력하세요: ");
			num= sc.nextInt();
			
			for (int i = 1; i <=num;i++) {
				for (int j = i; j<=num;j++) {
					System.out.print("*");
				}System.out.println("");
			}sc.close();
	}
}
