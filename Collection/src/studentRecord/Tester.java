package studentRecord;
import java.util.*;
public class Tester {

	public static void main(String[] args) {
		List<Student> studentRecords = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Inserting student records
        studentRecords.add(new Student(1, "John", 85.5));
        studentRecords.add(new Student(2, "Alice", 92.0));
        studentRecords.add(new Student(3, "Bob", 76.8));
        studentRecords.add(new Student(4, "Sarah", 88.2));

        // Displaying student records
        System.out.println("Student Records:");
        for (Student student : studentRecords) {
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Grade: " + student.getGrade());
            System.out.println();
        }

        // Updating a student's grade
        System.out.print("Enter the ID of the student to update: ");
        int updateId = scanner.nextInt();
        System.out.print("Enter the new grade: ");
        double newGrade = scanner.nextDouble();
        boolean updated = false;
        for (Student student : studentRecords) {
            if (student.getId() == updateId) {
                student.setGrade(newGrade);
                updated = true;
                break;
            }
        }
        if (updated) {
            System.out.println("Grade updated successfully!");
        } else {
            System.out.println("Student not found.");
        }

        // Removing a student record
        System.out.print("Enter the ID of the student to remove: ");
        int removeId = scanner.nextInt();
        boolean removed = false;
        for (Student student : studentRecords) {
            if (student.getId() == removeId) {
                studentRecords.remove(student);
                removed = true;
                break;
            }
        }
        if (removed) {
            System.out.println("Student record removed successfully!");
        } else {
            System.out.println("Student not found.");
        }

        // Searching for a student record
        System.out.print("Enter the name of the student to search: ");
        scanner.nextLine(); // Consume the newline character
        String searchName = scanner.nextLine();
        boolean found = false;
        for (Student student : studentRecords) {
            if (student.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Student Record Found:");
                System.out.println("ID: " + student.getId());
                System.out.println("Name: " + student.getName());
                System.out.println("Grade: " + student.getGrade());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
	}

}
