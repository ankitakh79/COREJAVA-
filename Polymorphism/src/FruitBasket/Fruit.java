package FruitBasket;

public class Fruit {
	private String fname;
private String fcolor;
private double fweight;

Fruit(String fname,String fcolor,double fweight){
	this.fname=fname;
	this.fcolor=fcolor;
	this.fweight=fweight;
}
public String toString() {
	return "Fruit name = "+ fname +"Fruit Color = " + fcolor + " fruit weight = " + fweight;
}
public String taste() {
	return "no specific taste"; 
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getFcolor() {
	return fcolor;
}
public void setFcolor(String fcolor) {
	this.fcolor = fcolor;
}
public double getFweight() {
	return fweight;
}
public void setFweight(double fweight) {
	this.fweight = fweight;
}
}
