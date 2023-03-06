public class TestCity {

	public static void main(String[] args) {

		City toulouse = new City("Toulouse", "France", 450000);
		City paris = new City("Paris", "France", 2160000);
		City lyon = new City("Lyon", "France", 513000);
		City marseille = new City("Marseille", "France", 860000);
		City nice = new City("Nice", "France", 342000);
		
		// Affichage de l'ensemble des objets
		System.out.println();
		System.out.println(toulouse.name + " " + toulouse.country + " " + toulouse.residents);
		System.out.println(paris.name + " " + paris.country + " " + paris.residents);
		System.out.println(lyon.name + " " + lyon.country + " " + lyon.residents);
		System.out.println(marseille.name + " " + marseille.country + " " + marseille.residents);
		System.out.println(nice.name + " " + nice.country + " " + nice.residents);
		
		// Affichage des nouveaux objets et des exercices
		toulouse.setResidents(toulouse.getResidents() - 150);
		toulouse.setCountry(toulouse.getCountry());
		System.out.println();
		toulouse.display();
		System.out.println();
		System.out.println(toulouse);
		System.out.println();
		City.instances();
	}
}