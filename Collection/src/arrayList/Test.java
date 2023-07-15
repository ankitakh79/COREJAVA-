package arrayList;
import java.util.ArrayList;
public class Test {

	public static void main(String[] args) {
		Student s1 = new Student("Ank",34);
		Student s2 = new Student("sam",56);
		Student s3 = new Student("Rajnish",45);
		
		ArrayList<Student> arr = new ArrayList<Student> ();
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		System.out.println(arr);
		System.out.println(arr.get(0).name);
		System.out.println(arr.get(0).id);
		System.out.println(arr.get(1).name);
		System.out.println(arr.get(1).id);
		System.out.println(arr.get(2).name);
		System.out.println(arr.get(2).id);
		System.out.println();
	}

}
