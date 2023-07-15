package arrayList;

public class Institute {

	int id;
	String name;
	String city;
	int no_of_std;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getNo_of_std() {
		return no_of_std;
	}
	public void setNo_of_std(int no_of_std) {
		this.no_of_std = no_of_std;
	}
	public int getNo_of_course() {
		return no_of_course;
	}
	public void setNo_of_course(int no_of_course) {
		this.no_of_course = no_of_course;
	}
	int no_of_course;
	public Institute(int id, String name, String city, int no_of_std, int no_of_course) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.no_of_std = no_of_std;
		this.no_of_course = no_of_course;
	}
@Override
	public String toString() {
		return "Institute [id=" + id + ", name=" + name + ", city=" + city + ", no_of_std=" + no_of_std
				+ ", no_of_course=" + no_of_course + "]";
	}
}
