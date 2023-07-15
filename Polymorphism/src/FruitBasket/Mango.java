package FruitBasket;

public class Mango extends Fruit{
	
	
	Mango(String fname,String fcolor,double fweight ){
		super(fname,fcolor,fweight);
		
	}
	public String toString() {
		return super.toString();
	}
	@Override
	public String taste() {
		return "Sweet ";
	}
	public void pulp() {
		System.out.println(getFname()+"pulp can be extracted");
	}
}
