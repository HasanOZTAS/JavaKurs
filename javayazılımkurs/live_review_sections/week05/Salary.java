package week05;

public class Salary {
	
	/*
		Salary:
            attributes
                rate, weeklyHour, taxRate
            actions:
                setInfo(), salary(), totalTax(), salaryAfterTax(), toString()
         */	
	
	public double rate;
	public int weeklyHour;
	public double taxRate;	
	
	public void setInfo (double hourlyRate, int numberOfHours, double tax) {
		
		rate = hourlyRate;
		weeklyHour = numberOfHours;
		taxRate = tax;
		
	}
	
	public double salary () {	//  salary before tax
		
		return rate * weeklyHour * 52;  //  annual salary		
	}
	
	public double totalTax () {
		return salary() * taxRate;   //  total tax		
	}
	
	public double salaryAfter () {	//  returns the salary after tax
		return salary () - totalTax ();
	}

	
	public String toString() {
		return "Salary [rate=" + rate + ", weeklyHour=" + weeklyHour +
				", taxRate=" + taxRate + ", salary=$" + salary() + 
				", Total Tax= " + totalTax() + ", salary after tax=$" + salaryAfter() + "]";
	}
	
	

	
		
		
		
		
		
		
		

	

}
