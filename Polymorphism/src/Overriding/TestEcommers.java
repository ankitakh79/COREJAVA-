package Overriding;

import java.util.Scanner;

public class TestEcommers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b1 = true;
		while (b1) {
		System.out.println("1.Amazon \n 2.Flipkart \n 3.Exit");
		System.out.println("Enter your choice:");
		int ch = sc.nextInt();
		
		if(ch==1) {
			Amazon a1 = new Amazon();
			System.out.println("Enter the qty");
			int qty = sc.nextInt();
			System.out.println("Enter the price");
			double price = sc.nextDouble();
			a1.product(qty, price);
		}else if(ch == 2){
			Flipkart f1 = new Flipkart();
			System.out.println("Enter the qty");
			int qty = sc.nextInt();
			System.out.println("Enter the price");
			double price = sc.nextDouble();
			f1.product(qty, price);
		}else if(ch==3) {
			b1= false;
		}
		else {
			System.out.println("Invalid choice");
		}
		}
	}
}
