package arrayList;
import java.util.ArrayList;

import java.util.Scanner;
public class InstituteDriver {

public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);

	Institute i1 = new Institute(1,"PDEA","HADPSAR",10,3);
	Institute i2 = new Institute(2,"JSPM","HANDEWADI",23,4);
	Institute i3 = new Institute(3,"BHARTI VIDYAPEETH","KATRAJ",30,5);
	Institute i4 = new Institute(4,"AISSM","SHIVAJINAGR",25,4);
	
	ArrayList<Institute> inst = new ArrayList<Institute>();
	inst.add(i1);
	inst.add(i2);
	inst.add(i3);
	inst.add(i4);
	
	for(Institute i : inst) {
		System.out.println(i);
	}
	System.out.println("Enter the name");
	String searchName = sc.next();
	boolean found = false;
	for(Institute i : inst) {
		
		if(i.name.equalsIgnoreCase(searchName)) {
			System.out.println("Institute info:");
			System.out.println(i.getName()+i.city);
			found = true;
		}}
		if(!found){
			System.out.println("institute does not exist");
		}
	
	

}

}
