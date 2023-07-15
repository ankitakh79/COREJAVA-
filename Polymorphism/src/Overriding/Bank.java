package Overriding;

public class Bank {
float getRateOfInterest() {
	return 0;
}
}
class SBI extends Bank{
	float getRateOfInterest() {
		return (float) 8.4;
	}
}
class ICIC extends Bank{
	float getRateOfInterest() {
		return (float) 9.7;
	}
}
class AXIS extends Bank{
	float getRateOfInterest() {
		return (float) 9.7;
	}
}
