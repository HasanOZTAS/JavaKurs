package Exercises;

public class Time {

	public static void main(String[] args) throws InterruptedException {
		
		for (int i=00; i<24; i++) {
			for(int j=00; j<60; j++){
				for(int s=00; s<60; s++) {
					
					System.out.print(i + ":" + j + ":" );
					Thread.sleep(1000);
					if (s<10) {
						System.out.print(0 + "" + s);					
					}else {
						System.out.print(s);
					}
					System.out.println();
				}
			}
		}

	}

}
