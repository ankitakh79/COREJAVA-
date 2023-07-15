package FruitBasket;

import java.util.Scanner;

public class FruitBasket {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no of fruits you wanted");
	Fruit[] fruit = new Fruit[sc.nextInt()];
	boolean exit = true;
	int count=0;
	System.out.println("1.Apple \n 2.Mango \n 3.orange \n 4.display details \n 5.Exit");
		
	while(exit) {
		System.out.println("Enter the choice");
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1:
			if(count < fruit.length) {
				System.out.println("Enter the Color and weigth");
				fruit[count]=new Apple(sc.next(),sc.next(),sc.nextDouble());
				count++;
			}else {
				System.out.println("Invalid.....");
			}
			
			
			
			break;
		case 2:
			if(count < fruit.length) {
				System.out.println("Enter the weight and color");
				fruit[count++]=new Mango(sc.next(),sc.next(),sc.nextDouble());
			}
			else {
				System.out.println("Invalid.....");
			}
			break;
		case 3:
			if(count < fruit.length) {
				System.out.println("Enter the weight and color");
				fruit[count++]=new Orange(sc.next(),sc.next(),sc.nextDouble());
			}
			else {
				System.out.println("Basket is full!!!!!.....");
			}
			break;
		case 4:
			for(Fruit f:fruit) {
				if(f != null) {
					System.out.println(f);//toString method calling name,color,weight
				System.out.println(f.taste());	//run time poly --overriding method 
				if(f instanceof Mango) {
				((Mango) f).pulp();	//down casting
				}else if(f instanceof Apple) {
					((Apple) f).juice();//down casting
				}else {
					((Orange) f).jam();//down casting
					
				}
				
				}
				
			}
			break;
			
		case 5:
			
			break;
		case 6 :
			exit=false;
			break;
		}
	}
	
	
	
	
	
	
	
	
	
	sc.close();
}
}
