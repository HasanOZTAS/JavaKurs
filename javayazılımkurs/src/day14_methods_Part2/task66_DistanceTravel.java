package day14_methods_Part2;

public class task66_DistanceTravel {

	public static void main(String[] args) {
		
		double D =distance(52.2,11);
		
		System.out.println(D);
		
		// as an addition
		
		if(D>500) {
			System.out.println("Spent too much fuel");
		}else {
			System.out.println("Spent fuel is ok");
		}


	}
	public static double distance(double Speed, int Time) {
		
		double distanceTraveled=Speed*Time;		// return speed*Time  enough
		
		return distanceTraveled;
		
	}
	

}
