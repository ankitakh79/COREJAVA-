package Overriding;

import java.util.Scanner;

public class TestBank {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	boolean b1= true;
	while (b1) {
	System.out.println("1.SBI \n 2.ICIC \n 3.AXIS \n 4.EXIT");
	System.out.println("Enter the choice");
	int ch = sc.nextInt();
		switch(ch) {
	
		case 1:{
			SBI s1 = new SBI();
			System.out.println("SBI Rate of Interest : " + s1.getRateOfInterest());
			
		}
		break;
		case 2: {
			ICIC i = new ICIC();
			System.out.println("ICIC Rate of Interest : " + i.getRateOfInterest());
			
		}break;
		case 3:{
			AXIS a1 = new AXIS();
			System.out.println("AXIS Rate of Interest : " + a1.getRateOfInterest());
			
		}break;
		case 4:{
			b1= false;
		}
		break;
		default:{
			System.out.println("Incorrect choice");
		}
	}}
}
}
