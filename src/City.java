public class City {
	
	// Attributs
	public String name;
	public String country;
	public int residents;
	public static int counter = 0;
	
	// Premier constructeur
	public City(String name, String country, int residents) {
		this.name = name;
		this.country = country;
		this.residents = residents;
		counter++;
	}
	
	// Deuxième constructeur
	public City(String name, int residents) {
		this.name = name;
		this.country = "unknown";
		this.residents = residents;
		counter++;
	}
	
	public City(String name, String country) {
		this.name = name;
		this.country = country;
	}

	// Accesseurs
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = "FRANCE";
	}
	
	public int getResidents() {
		return residents;
	}
	
	public void setResidents(int residents) {
		if (residents < 449800) {
			System.out.println("Erreur de saisie");
		}
		else {
			this.residents = residents;
		}
	}
	
	// Première méthode
	public void display() {
		System.out.println("La ville de " + this.name +
						   " est en " + this.country +
						   " et elle a " + this.residents +
						   " habitants");
	}
	
	// Deuxième méthode
	public String toString() {
		return "name=" + getName() + ", " +
			   "country=" + getCountry() + ", " +
			   "residents=" + getResidents();
	}
	
	// Troisième méthode
	public static void instances() {
		System.out.println("Il y a " + counter + " instances dans le programme");
	}
}