package day20_stringManipulation_part2;

public class task81_TimeStamp {

	public static void main(String[] args) {
		
		String date = "16/04/2021 14:49:00";
		
		//timeStamp(date);
		System.out.println(timeStamp(date));
		

	}

	public static String timeStamp(String date) {
		return date.replace("/", "").replace(" ", "").replace(":", "");
				
	}

}
