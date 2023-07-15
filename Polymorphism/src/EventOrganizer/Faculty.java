package EventOrganizer;

public class Faculty extends Person {
	private int yrsOfExperience;
	private String sme;
	public Faculty(String fname, String lname, int yrsOfExperience, String sme) {
		super(fname, lname);
		this.yrsOfExperience = yrsOfExperience;
		this.sme = sme;
	}
	//add new functionality
	public void teach() {
		System.out.println("Fname" + super.getFname()+ "Expertise = " + sme);
	}
	public int getYrsOfExperience() {
		return yrsOfExperience;
	}
	public void setYrsOfExperience(int yrsOfExperience) {
		this.yrsOfExperience = yrsOfExperience;
	}
	public String getSme() {
		return sme;
	}
	public void setSme(String sme) {
		this.sme = sme;
	}
	@Override
	public String toString() {
		return "Faculty " +"[ FName = "+super.getFname() + " LName = "+super.getLname()+ " yrsOfExperience = "+ yrsOfExperience+" " + "sme = " + sme+"]";
	}
	
}
