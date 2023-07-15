package Overriding;

import java.util.Scanner;

public class Ecommerce {
void product(int qty,double price) {
	double total = qty + price;
	System.out.println("Total amount :" + total);
}
}
 class Amazon extends Ecommerce{
	void product(int qty,double price) {
		double total = qty + price;
		double finalAmt = total + total * 0.05;
		System.out.println("Final amount :" + finalAmt);
	}	
}
 class Flipkart extends Ecommerce{
		void product(int qty,double price) {
			double total = qty + price;
			double finalAmt = total + total * 0.1;
			System.out.println("Final amount :" + finalAmt);
		}	
	}
 