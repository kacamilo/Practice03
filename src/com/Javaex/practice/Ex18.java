package com.Javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			int num;
			System.out.print("숫자를 입력하세요: ");
			num = sc.nextInt();
			
			for (int a = 1; a<=num; a++) {
				for (int b = a; b<=num; b++) {
					System.out.print("*");
				}System.out.println("");
			}
			for (int a = 1; a<=num-1; a++) {
				for (int b = 1; b <=a+1; b++) {
					System.out.print("*");
				}System.out.println("");
			}
			sc.close();
	}

}
