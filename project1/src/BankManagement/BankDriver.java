package BankManagement;
import java.util.Scanner;
public class BankDriver {

public static void main(String[] args) {
	Bank b = new Bank();
	boolean b1 = true;
	while(b1) {
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter the choice: \n 1.CreateAccount \n 2.RemoveAccount \n 3.UpdateCity \n 4.Display Details \n 5.Display balance \n 6.Update Pin \n 7.Withdrawal\n 8.Deposit\n 9.Exit");
	int choice = s1.nextInt();
	switch (choice) {
	case 1 : {
		System.out.println("Enter name of Accountant:");
		String name =s1.next();
		System.out.println("Enter the Account Number");
		long accno = s1.nextLong();
		System.out.println("Enter Pin");
		int pin = s1.nextInt();
		System.out.println("Enter City:");
		String city = s1.next();
		System.out.println("Enter contant number:");
		long numb = s1.nextLong();
		System.out.println("Enter the balance");
		double balance = s1.nextDouble();
		b.createAccount(new Account(name,accno,numb,city, pin,balance));
		
	}
	break;
	case 2: {
	b.removeAccount();;	
		
	}
	break;
	case 3: {
	b.updateCity();
	
	}
	break;
	case 4: {
	b.displayDetails();
	
	}
	break;
	case 5: {
		b.displayBalance();
		
	}
	break;
	case 6: {
		b.changePin();
		
	}
	break;
	case 7: {
		b.withdrawal();
		
	}
	break;
	case 8:{
	b.Deposit();
	}
	break;
	case 9:{
		b1=false;
		}
		break;
	default:
		System.out.println("Enter the correct choice");
	}
	
		
	}
}
}

