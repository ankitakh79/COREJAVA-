package studentRecord;

public class Student {
	int id;
	String name;
	double grade;
	
	public Student(int id, String name, double grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}

}
