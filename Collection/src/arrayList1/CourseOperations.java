package arrayList1;
import java.util.ArrayList;
import java.util.Iterator;
public class CourseOperations {

	ArrayList<Course> courses = new ArrayList<>();
	
	public void addCourse(String cname,int batchCode) {
		Course c1 = new Course(cname,batchCode);
		courses.add(c1);
		System.out.println("Course added successfully");
		
	}

	public void displayCourse() {
//		System.out.println("Course \n Batch Code");
		System.out.println("----------------");
		for(Course c : courses) {
			System.out.println(c);
		}
	}
	public void deleteCourse(String name) {
		Iterator<Course> itr = courses.iterator();
		
		while(itr.hasNext()) {
			Course c =itr.next();boolean found = false;
			if(c.cname.equals(name)) {
				itr.remove();
				System.out.println("course removed successfully");
				found = true;
			}else {
				System.out.println("course not found");
			}
			
		}
	}
}
