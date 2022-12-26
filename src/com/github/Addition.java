package com.github;

import java.util.Scanner;

public class Addition {
	public int getAddtion(int a,int b) {
		int c=a+b;
		return c;
		
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int first=scanner.nextInt();
		System.out.println("Enter a first Number "+ first);
		
		int Second =scanner.nextInt();
		System.out.println("Enter a Second Number "+Second);
	
		Addition addition =new Addition();
		int x=addition.getAddtion(first, Second);
		System.out.println("Addition "+x);
		
	}

}
