package arrayList1;

public class Course {

	String cname;
	int batchCode;
	
	public Course(String cname,int batchCode) {
		this.cname=cname;
		this.batchCode=batchCode;
	}
	
	public String toString() {
		return "Course name : " + cname+"Batch code : " + batchCode ;
	}

}
