package com.keerthana.selenium;

public class Preandpost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 20;
//		int b = 25;
//      post increment
//      System.out.println(a++);
//      System.out.println(a);
//      pre increment
//      System.out.println(++a);
//      System.out.println(a);
//      System.out.println(a--);
//        System.out.println(--a);
//        System.out.println(a--);
//        System.out.println(a--);
//        System.out.println(--a);
//        System.out.println(a>b);
//        System.out.println(a<b);
//        System.out.println(a<=b);
//        System.out.println(a>=b);
//        System.out.println(a==b);
//		System.out.println(a != b);
		int option = 2;
		int a = 20;
		int b = 10;
		switch (option) {
		case 1:
			System.out.println("Add" + (a + b));
		break;
		case 2:
			System.out.println("sub" + (a - b));
			break;
		case 3:
			System.out.println("multiple" + (a * b));
		break;
		case 4:
			System.out.println("divi" + (a / b));
		break;
		default:
			System.out.println("enter option 1 to 4");
		}
//		int a=10;  
//		int b=-10;  
		boolean c=true;  
		boolean d=false;  
		System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
		System.out.println(~b);//9 (positive of total minus, positive starts from 0)  
		System.out.println(!c);//false (opposite of boolean value)  
		System.out.println(!d);//true 
	}
}
