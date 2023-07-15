package project1;

import java.util.Scanner;

public class Company {
String cname;
Employee e;
Company(String cname){
	this.cname= cname;
}
public void addEmployee(Employee e) {
	if(this.e == null) {
		this.e =e;
		System.out.println(e.getCity()+ e.getDept());
		System.out.println("Employee successfully added");
	}else {
		System.out.println("Employee already added");
	}
}

public void removeEmployee() {
	if(this.e == null) {
		System.out.println("First add the employee");
	}else {
		this.e = null;
		System.out.println("Employee removed");
	}
}
public void updateEmployee() {
	if(this.e== null) {
		System.out.println("First add the employee");
	}else {
		Scanner s1 = new Scanner(System.in);
		System.err.println("Enter the city of empoyee" );
		String ucity = s1.next();
		System.out.println("Updated city of employee :" + e.getCity());
		e.setCity(ucity);
		System.out.println("Enter id of employee");
		int ueid = s1.nextInt();
		System.out.println("Updates id of employee:"+e.getEid());
		e.setEid(ueid);
		
		
	}
}
public void displayDetails() {
	if(this.e==null) {
		System.out.println("First add the employee");
	}else {
		System.out.println("Employee name:" + e.getEname());
		System.out.println("Employee id:" +e.getEid());
		System.out.println("EMployee eno:" + e.getEno());
		System.out.println("EMployee city:"+e.getCity());
		System.out.println("EMployee dept:" +e.getDept());
		System.out.println("EMployee sal:" + e.getSal());
	}
}

}
