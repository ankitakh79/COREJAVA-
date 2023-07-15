package BankManagement;

public class Account {
private String name;
private long accno;
private long contno;
public Account(String name, long accno, long contno, String city, int pin, double balance) {
	
	this.name = name;
	this.accno = accno;
	this.contno = contno;
	this.city = city;
	this.pin = pin;
	this.balance = balance;
}
private String city;
private int pin;
private double balance;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getAccno() {
	return accno;
}
public void setAccno(long accno) {
	this.accno = accno;
}
public long getContno() {
	return contno;
}
public void setContno(long contno) {
	this.contno = contno;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
}
