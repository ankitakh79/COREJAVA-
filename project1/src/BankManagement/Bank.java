package BankManagement;

import java.util.Scanner;

public class Bank {
Account a;
public void createAccount(Account a) {
	if(this.a==null) {
		this.a = a;
		System.out.println("Account created successfully");
	}else {
		System.out.println("First create the account");
	}
}
public void removeAccount(){
	if(this.a == null) {
		System.out.println("First create the Account");
	}else {
		this.a = null;
		System.out.println("Account removed successfully");
	}
}

public void updateCity() {
	if(this.a==null) {
		System.out.println("First create the Account");
	}else {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pin:");
		int pasw = sc.nextInt();
		if(pasw == a.getPin()) {
			System.out.println("Enter the city:");
			String city = sc.next();
			a.setCity(city);
			System.out.println("City updated successfully");
		}else {
			System.out.println("Invalid pin");
		}
	}
}
public void displayDetails() {
	if(this.a == null) {
		System.out.println("First create the account");
	}else {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pin:");
		int pasw = sc.nextInt();
		if(pasw ==a.getPin()) {
		System.out.println("Account name :"+a.getName());
		System.out.println("Account number :" + a.getAccno());
		System.out.println("contact numer :" + a.getContno());
		System.out.println("city :" +a.getCity());
		}else {
			System.out.println("Invalid password");
		}
	
	}
}
public void displayBalance() {
	if(this.a == null) {
		System.out.println("First create the account");
	}else {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pin:");
		int pasw = sc.nextInt();
		if(pasw ==a.getPin()) {
		System.out.println("Account Balance :"+a.getBalance());
		
		}else {
			System.out.println("Invalid password");
		}
	
	}
}
public void changePin() {
	if(this.a == null) {
		System.out.println("First create the Account");
	}else {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the old pin:");
		int pasw = sc.nextInt();
		if(pasw == a.getPin()) {
			System.out.println("Enter the new pin:");
			int npasw = sc.nextInt();
			a.setPin(pasw);
			System.out.println("Pin updated successfully");
		}else {
			System.out.println("Invalid pin ");
		}
	}
}
public void withdrawal() {
	if(this.a == null) {
		System.out.println("First create the Account");
	}else {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pin:");
		int pasw = sc.nextInt();
		if(pasw == a.getPin()) {
			System.out.println("Enter the ammout you want to withdraw");
			double withD = sc.nextDouble();
			double res = a.getBalance() - withD;
			if(a.getBalance() >= withD) {
			
			System.out.println("Account balance is" + res);
			}else {
				System.out.println("Insufficient Amount");
			}
			
	}else {
		System.out.println("Invalid pin ");
	}
	}
}
public void Deposit() {
	if(this.a == null) {
		System.out.println("First create the Account");
	}else {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pin:");
		int pasw = sc.nextInt();
		if(pasw == a.getPin()) {
			System.out.println("Enter the ammout you want to Deposite");
			double depo = sc.nextDouble();
			double res = a.getBalance() + depo;
//			if(a.getBalance() >= depo) {
			
			System.out.println("Account balance is" + res);
//			}else {
//				System.out.println("Insufficient Amount");
//			}
			
	}else {
		System.out.println("Invalid pin ");
	}
	}
}
}
