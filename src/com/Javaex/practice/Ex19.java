package com.Javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
		
			int num = 1;
			int monin;
			int monout;
			for (int i = num; i <=4; i++) {
				System.out.println("------------------------------------");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("------------------------------------");
				System.out.print("선택>");
				num = sc.nextInt();
				if (num==1) {
					System.out.print("예금액>");
					monin = sc.nextInt();
				} else if (num==2) {
					System.out.println("출금액>");
					monout = sc.nextInt();
				} else if (num==3) {
					System.out.println("잔고액>");
					//int monleast = monin - monout;
				} else if (num==4) {
					System.out.println("프로그램 종료");
					break;
				} else {
					System.out.println("다시 입력해주세요");
				}
			}
		
	sc.close();
	}
	
}
