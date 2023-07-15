package EventOrganizer;

public class BasicPolymorphism {
public static void main(String[] args) {
	//create stud class instance
	//super class : person ,sub class: Student,Faculty
	Student stud1 = new Student("Asmu","Khand",2022,"Web-tech",3000,70);//direct ref
	System.out.println(stud1);
	Person p;
	p = stud1;//up casting and indirect ref  
	System.out.println(p);
	p = new Faculty("Ank","Seth",10,"java");//up casting and indirect ref
	System.out.println(p);
	
	Object o;
	o = new Student("Asmita","Khandalkar",2020,"SQL",1500,90);
	System.out.println(o);
	o = new Faculty("Ankita","thakre",23,"React Js");//up casting : faculty -> Person -> Object 
										//and toString method override
	System.out.println(o);
}
}
