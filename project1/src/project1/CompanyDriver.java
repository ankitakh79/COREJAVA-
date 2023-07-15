package project1;

import java.util.Scanner;

public class CompanyDriver {

	public static void main(String[] args) {
		Company c1 = new Company("Bighit");
		
		Scanner s2 = new Scanner(System.in);
		boolean b1 = true;
		while(b1) {
		System.out.println("1.AddEmployee\n 2.RemoveEmployee \n 3.UpdateEmployee\n 4.Display Details of employee");
		System.out.println("Enter the choice:");
		int choice= s2.nextInt(); 
		switch (choice) {
		case 1: {
		System.out.println("Enter name");
		String name = s2.next();	
		System.out.println("Enter city");
		String city = s2.next();
		System.out.println("Enter the id");
		int id = s2.nextInt();
		System.out.println("Enter the contact number");
		int numb = s2.nextInt();
		System.out.println("Enter the department number");
		int dept = s2.nextInt();
		System.out.println("Enter the Salary");
		int sal = s2.nextInt();
		c1.addEmployee(new Employee(name,id,numb,city,dept,sal));	
		}
		break;
		case 2: {
			c1.removeEmployee();
			
		}
		break;
		case 3: {
			c1.updateEmployee();
			
		}
		break;
		case 4: {
		c1.displayDetails();	
			
		}
		break;
		case 5:{
			b1= false;
		}
		break;
		default:{
			System.out.println("Enter correct choice");
		}
		
		}
		}
	}

}
