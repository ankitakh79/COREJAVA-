package EventOrganizer;

public class Student extends Person{
	private int gradYear;
	private String course;
	private double fees;
	private int marks;
	@Override
	public String toString() {
		return "Student" + super.toString()+"[ gradYear=" + gradYear + ", course=" + course + ", fees=" + fees + ", marks=" + marks + "]";
	}
	public Student(String fname, String lname, int gradYear, String course, double fees, int marks) {
		super(fname, lname);
		this.gradYear = gradYear;
		this.course = course;
		this.fees = fees;
		this.marks = marks;
	}
	// add new behavior : study
	public void study() {
		//display stud Fname studying in course name
		System.out.println("Fname = "+ super.getFname() + " Studying in = "+ course );
		
	}
	public int getGradYear() {
		return gradYear;
	}
	public void setGradYear(int gradYear) {
		this.gradYear = gradYear;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}
