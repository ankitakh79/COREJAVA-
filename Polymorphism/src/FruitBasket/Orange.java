package FruitBasket;

public class Orange extends Fruit{
	
	
	Orange(String fname,String fcolor,double fweight ){
		super(fname,fcolor,fweight);
		
	}
	public String toString() {
		return super.toString();
	}
	@Override
	public String taste() {
		return "Sour ";
	}
	public void jam() {
		System.out.println(getFname()+"jam can be extracted ");
	}
}
