
public class App {
//	In deze opdracht programmeer je een Binaire boom.
//	Dit moet je doen door zelf de link-structuur te 
//	implementeren. In de boom worden studenten opgeslagen.
//	De knopen in de boom hebben als key het studentnummer 
//	van de studenten.
	
	
	/**
	 * De main wordt gebruikt om de tree te testen.
	 * @param args
	 */
	public static void main(String[] args) {
//		Programmeer een paar cases waarbij 
//		je laat zien dat de boom werkt
		Tree tree = new Tree();
		Student student = new Student(1 , "Kees");
		Student student1 = new Student(2 , "Jan");

		tree.insert(student);
		tree.insert(student1);

		Student findStudent = tree.find(2);

		System.out.print(findStudent.toString());



//		voeg studenten met studentnummers �0802063� tot en met �0824836� toe
		
//		Verwijder de root
		
//		print de studenten op volgorde van studentnummer
	}

}
