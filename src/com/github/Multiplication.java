package com.github;

import java.util.Scanner;

public class Multiplication {
	
	public static void  getMultiplication(int no) {
		for (int i=1;i<=10;i++) {
			int c=no*1;
			System.out.println(no+"*"+i+"="+c);
			}
	
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		Multiplication.getMultiplication(a);
	}	
	

}
