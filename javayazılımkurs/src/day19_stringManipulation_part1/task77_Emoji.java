package day19_stringManipulation_part1;

import java.util.Scanner;

public class task77_Emoji {

	public static void main(String[] args) {
		
		Scanner emoji = new Scanner(System.in);
		
		System.out.println("Put an emoji: ");
		
		String emojiChar = emoji.next();
		
		if (emojiChar.length()==2) {			
			if (emojiChar.charAt(0) == ':' || emojiChar.charAt(0) == ';'){
			System.out.println("Okey");
			}else {
				System.out.println("Invalid Emoji");
			}
		}else {
			System.out.println("InValid");
		}
		
		
		
		
		

	}

}
