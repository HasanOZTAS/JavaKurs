package week10;

public class Microsoft {

	public static void main(String[] args) {
		
		Tester tester1 = new Tester("Hasan", "Male", "SDET", 123, 100000);
		Tester tester2 = new Tester("Veli", "Male", "SDET", 145, 10000);		
		Tester tester3 = new Tester("Elif", "Female", "SDET", 129, 110000);
		
		Tester[] testers = {tester2, tester3};
		
		
		Developer developer1 = new Developer("Ali", "Male", "Java Developer", 521, 120000);
		Developer developer2 = new Developer("Veli", "Male", "C++ Developer", 145, 170000);
		Developer developer3 = new Developer("Erhan", "Male", "Java Developer", 155, 195000);
		Developer developer4 = new Developer("Barýþ", "Male", "Phyton Developer", 245, 14000);
		
		Developer[] developers = {developer2, developer3, developer4};
		
		System.out.println(tester1);		
		System.out.println(developer1);
		
		tester1.creatingTicket();
		developer1.fixingBug();
		
		ScrumTeam scrum1 = new ScrumTeam("Hasan", "Erhan", "Veli");
		System.out.println("Total Number of Testers " + scrum1.testers.size());
		
		scrum1.addTester(tester1);
		scrum1.addTester(testers);
		System.out.println("Total Number of Testers " + scrum1.testers.size());
		
		scrum1.addDeveloper(developer1);
		scrum1.addDeveloper(developers);
		System.out.println("Total Number of Developers " + scrum1.developers.size());
		
		System.out.println(scrum1.toString());
		
		

	}

}
