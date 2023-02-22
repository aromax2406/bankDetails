package org.bank;
import org.bank.BankInfo;
public  class BankInfo extends AxisBank{
public void saving() {
	System.out.println("he saved 4000");
}
public static void main(String[] args) {
	BankInfo b =new BankInfo();
	b.saving();
	b.deposit();
	
	
}
}


