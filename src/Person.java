public class Person {

	// Attributs
	public String lastName;
	public String firstName;
	public int age;
	public String address;
	public City birthCity;

	// Constructeurs
	public Person(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = 0;
		this.address = "unknown";
	}

	public Person(String lastName, String firstName, int age) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.address = "unknown";
	}

	public Person(String lastName, String firstName, int age, String address) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.address = address;
	}
	
	public Person(String lastName, String firstName, int age, String address, City city) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.address = address;
		this.birthCity = city;
	}

	// Méthode
	public String toString() {
		return "Person [lastName=" + getLastName() + ", " +
			   "firstName=" + getFirstName() + ", " +
			   "age=" + getAge() + ", " +
			   "address=" + getAddress() +
			   " BornCity [" + birthCity +
			   "]";
	}

	// Accesseurs
	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}