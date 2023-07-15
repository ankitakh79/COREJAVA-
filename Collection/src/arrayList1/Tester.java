package arrayList1;

import java.util.Scanner;

public class Tester {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	CourseOperations oper = new CourseOperations();
	boolean status = true;
	while(status) {
		System.out.println("1.Add course \n 2.DIsplay Course \n 3.Remove the course \n 4.Exit");
		int ch = sc.nextInt();
		if(ch == 1) {
			System.out.println("enter the course name :" );
			String name = sc.next();
			System.out.println("Enter the course batch code");
			int code = sc.nextInt();
			oper.addCourse(name, code);
		}else if(ch==2) {
			oper.displayCourse();
		}else if(ch==3) {
			System.out.println("Enter the course name");
			String name= sc.next();
			oper.deleteCourse(name);
		}else {
			status =false;
		}
	}
}
}
