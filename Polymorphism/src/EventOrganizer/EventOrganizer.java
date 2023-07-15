package EventOrganizer;

import java.util.Scanner;

public class EventOrganizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the max no of participants");
		Person[] participants = new Person[sc.nextInt()];
		boolean exit =false;
		int counter =0;
		while(!exit) {
			System.out.println("1.Registr Student \n 2.Register Faculty \n 3.Display Details of all participant \n4.Display  \n 5.Invoke subclass specific functionality \n 6.Exit");
			int ch = sc.nextInt();
			switch(ch) {
			case 1://student reg
				if(counter < participants.length) {
					System.out.println("Enter Student details");
					//up casting					
					participants[counter]=new Student(sc.next(),sc.next(),sc.nextInt(),sc.next(),sc.nextDouble(),sc.nextInt());
					counter++;
				}else {
					System.out.println("Event Full!!!!");
				}
				break;
			case 2://faculty reg
				if(counter < participants.length) {
					System.out.println("Enter faculty details");
					participants[counter++]=new Faculty(sc.next(),sc.next(),sc.nextInt(),sc.next());
				}else {
					System.out.println("Event Full!!!!");
				}
				break;	
			case 3://display details
				for(Person p:participants)//p=participants[0]......p=participants[participants.ength-1]
					if(p != null)//null checking
					System.out.println(p);//type of ref : person, type of obj:student or faculty
				    //{f1,f2,s1,s2,.....}
				break;
			case 4:
				System.out.println("Enter the seat no");
				int index = sc.nextInt()-1;
				if(index >= 0 && index < counter ) {
					System.out.println(participants[index]);//Run time polymorphism 
				}else {
					System.out.println("Invalid seat no");
				}
				break;
			case 5:
				System.out.println("Enter the seat no : ");
				index = sc.nextInt()-1;
				if(index >= 0 && index < counter) {
					Person p = participants[index];
					//in order to avoid class cast exception we need to check instanceof operator
					if(p instanceof Student) {//checking it is Stud or faculty
					Student s = (Student)p;//Down casting
					s.study();
					}else {
					Faculty f = (Faculty) p;
					f.teach();	
					}
					

					//((Student)p).study();
				}else {
					System.out.println("Invalid seat no");
				}
				break;
			case 6:
				exit=true;
				break;
			}
		}
		sc.close();

	}

}
