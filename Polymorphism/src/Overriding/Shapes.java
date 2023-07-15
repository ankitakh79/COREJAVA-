package Overriding;

public class Shapes {
  
double Area(double x) {
	 return x;
 }
 
}
class Circle extends Shapes{
	

	double Area(double x) {
		double area = 3.14*x*x;
		System.out.println("Area of circle :" + area);
		 return area;
	 }
}
class Square extends Shapes {
	

	double Area(double x) {
		double area = x*x;
		System.out.println("Area of square :" + area);
		 return area;
	 }
}
