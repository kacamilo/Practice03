package com.Javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
			System.out.println("=====================");
			System.out.println("\t" + "[숫자맞추기게임 시작]" + "\t");
			System.out.println("=====================");
		
			Scanner sc = new Scanner (System.in);
			int answer = (int) (Math.random() * 100);
			int input;
			//int count = 0;
				
			
			while (true) {
			System.out.print(">>");
			input = sc.nextInt();
				if (input == answer) {
						System.out.println("맞았습니다");
						System.out.println("=====================");
						System.out.println("\t" + "[숫자맞추기게임 종료]" + "\t");
						System.out.println("=====================");
						
				break;
				}else if (input>answer) {
					System.out.println("더 낮게");
				}else if (input < answer) {
					System.out.println("더 높게");
				
				}
			}
			//sc.close();
	}
}

