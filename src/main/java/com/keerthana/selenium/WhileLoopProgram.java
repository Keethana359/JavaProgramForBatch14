package com.keerthana.selenium;

public class WhileLoopProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       int i=1;
//       while(i<=20) {
//    	   System.out.println(i+"*2="+i*2);
//    	   i++;
//       }
//    	int j=2;  
//    	while(j<=10) {
//    		System.out.println(j+"*3="+j*3);
//    		j++;
//    	}
		int i = 5;
		while (i>=1){
			if(i==5){
				System.out.print(i+"="+i+"*");
			}
			else if(i>=2) {
				System.out.print(i+"*");
			}
			else {
				System.out.println(i);
			}
			i--;
		}
		
	}
	

}
