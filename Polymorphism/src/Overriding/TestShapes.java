package Overriding;

import java.util.Scanner;

public class TestShapes {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
//	Shapes s1,s2;
//	s1= new Circle();
//	s2=new Square();
//	System.out.println("Enter the radius");
//	double r = sc.nextDouble();
//	s1.Area(r);
//	System.out.println("Enter the side");
//	double s = sc.nextDouble();
//	s2.Area(s);

	
	boolean b1= true;
	while(b1) {
		System.out.println("1.Circle \n 2.Square \n 3.Exit");
		int ch = sc.nextInt();
		if(ch==1) {
			
			Circle c1 = new Circle();
			System.out.println("Enter the radius");
			double r1 = sc.nextDouble();
			c1.Area(r1);
	
			
		}else if(ch==2) {
			System.out.println("Enter the side");
			double si = sc.nextDouble();
			Square s3 = new Square();
			s3.Area(si);
			
		}else if(ch==3){
			b1= false;
		}else {
			System.out.println("Incorrect Choice");
		}
	}
}
}
