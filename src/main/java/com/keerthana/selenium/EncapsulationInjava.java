package com.keerthana.selenium;

public class EncapsulationInjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();
		acc.setaccc_no(789654321L);
		acc.setname("keerthana");
		acc.setemail("g.kkerthana436@gmail.com");
		acc.setaccount(50000f);
		System.out.println(acc.getacc_no()+" "+acc.getname()+" "+acc.getemail()+" "+acc.getaccount()+" ");
	}

}
