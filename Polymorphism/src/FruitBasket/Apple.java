package FruitBasket;

public class Apple extends Fruit {
	
	
	Apple(String fname,String fcolor,double fweight ){
		super(fname,fcolor,fweight);
		
	}
	public String toString() {
		return super.toString();
	}
	@Override
	public String taste() {
		return "Sweet and sour";
	}
	public void juice() {
		System.out.println(getFname()+"Juice can be extracted");
	}

}
