package project1;

import java.util.Scanner;

public class BookDriver {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Books b1 = new Books();
	b1.setBname("It ends with us");
	System.out.println(b1.getBname());
	int pag = sc.nextInt();
	b1.setPages(pag);
	System.out.println(b1.getPages());
	System.out.println("Enter the choice");
	System.out.println("1.printing \n"+ "2.modifying" );
	int choice = sc.nextInt();
	if (choice == 1) {
		System.out.println("Enter the data you want to print");
		System.out.println("1.bname \n" + "2.Pages \n" + "3.Type");
		int ch = sc.nextInt();
		if(ch==1) {
		System.out.println(b1.getBname());
		}else if(ch==2) {
		System.out.println(b1.getPages());
		}else if(ch==3) {
		System.out.println(b1.getType());
		}else {
			System.out.println("Enter the correct choice");
		}
	} else if(choice == 2) {
		System.out.println("Enter the data you want to modify");
		System.out.println("1.bname \n" + "2.Pages \n" + "3.Type");
		int ch = sc.nextInt();
		if(ch==1) {
			System.out.println("Enter the bname");
			String name = sc.next();
			b1.setBname(name);
			System.out.println(b1.getBname());
		}else if(ch==2) {
			System.out.println("Enter the pages that book have");
			int pages = sc.nextInt();
			b1.setPages(pages);
			System.out.println(b1.getPages());
		}else if(ch==3) {
			System.out.println("Enter the type of the book");
			String type = sc.next();
			b1.setType(type);
			System.out.println(b1.getType());
			return;
		}else {
		System.out.println("Enter the correct choice");
	}
	}

}}
