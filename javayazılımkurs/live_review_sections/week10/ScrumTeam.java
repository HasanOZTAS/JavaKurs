package week10;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
	
	public String PO, BA, SM;
	public ArrayList<Tester> testers = new ArrayList<>();
	public ArrayList<Developer> developers = new ArrayList<>();
	
	
	public ScrumTeam(String pO, String bA, String sM) {
		
		PO = pO;
		BA = bA;
		SM = sM;
	}
	
	public void addTester(Tester tester) {  //  adds one tester into the testers arrayList
		
		testers.add(tester);
	}
	
	public void addTester(Tester[] testers) {  //  adds each tester from given array to the arrayList testers
		
		this.testers.addAll(Arrays.asList(testers));
	}
	
	public void addDeveloper(Developer developer) {
		
		developers.add(developer);
	}
	
	public void addDeveloper(Developer[] developers) {
		
		this.developers.addAll(Arrays.asList(developers));
	}
	
	public void removeTester(int id) {
		
		testers.removeIf(p -> p.employeeID == id);
	}

	
	public String toString() {
		return "ScrumTeam [PO=" + PO + ", BA=" + BA + ", SM=" + SM + ", Testers=" + testers.size() + ", Developers="
				+ developers.size() + "]";
	}
	
	
	
	

}
