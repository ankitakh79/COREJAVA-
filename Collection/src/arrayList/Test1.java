package arrayList;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class Test1 {

	public static void main(String[] args) {
		List<String> arr = new ArrayList <> ();
		arr.add("Hello");
		arr.add("Bye");
		arr.add("Hello1");
		arr.add("Bye1");
		
		for(int i = 0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("--------------");
		for(String s : arr) {
			System.out.println(s);
		}
		System.out.println("--------------");
		Iterator i = arr.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
