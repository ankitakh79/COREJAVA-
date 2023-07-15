package arrayList1;


import java.util.HashSet;

public class Student {
    private String name;
    private int id;
    private int std;

    public Student(String name, int id, int std) {
        this.name = name;
        this.id = id;
        this.std = std;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getStd() {
        return std;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return id == student.id && std == student.std && name.equals(student.name);
    }

    public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setStd(int std) {
		this.std = std;
	}

	@Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + id;
        result = 31 * result + std;
        return result;
    }
}

public class StudentSearch {
    public static void main(String[] args) {
        HashSet<Student> studentSet = new HashSet<>();

        // Add students to the HashSet
        studentSet.add(new Student("Smith ", 101, 10));
        studentSet.add(new Student("Aniket ", 102, 9));
        studentSet.add(new Student("Rohan", 103, 12));
        studentSet.add(new Student("Sakshi", 104, 11));

        // Search for a student by name
        String searchName = "John Doe";
        boolean found = false;
        for (Student student : studentSet) {
            if (student.getName().equals(searchName)) {
                found = true;
                break;
            }
        }

        // Print the result
        if (found) {
            System.out.println(searchName + " exists.");
        } else {
            System.out.println(searchName + " does not exist.");
        }
    }
}

