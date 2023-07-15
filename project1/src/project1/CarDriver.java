package project1;

import java.util.Scanner;

public class CarDriver {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the car name");
	String name = sc.next();
	
	
	Car c1 = new Car(name ,1500000,"Black",new Engine("HEV",3421));
	System.out.println("Car comapay :"+ name);
	System.out.println("Car price :"+ c1.price);
	System.out.println("Car color :" + c1.color);
	System.out.println("Engine number :" + c1.e.eno);
	System.out.println("Engine company :" + c1.e.cname);
}
}
