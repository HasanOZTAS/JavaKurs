package week05;

public class FrequencyOfWord {

	public static void main(String[] args) {
		
		String sentence = "javajavajavajava";
		String word = "java";
		
		
		
		int count = 0;
		while(sentence.contains(word)) {
			sentence = sentence.replaceFirst(word, "");
			count++;
		}
		
		System.out.println(count);
		System.out.println();
		
		String str = "cat cat cat cat cat cat cat dog dog dog dog cat cat dog dog ";
		int numberOfCats = frequency(str, "cat");
		int numberOfDogs = frequency(str, "dog");
		
		System.out.println(numberOfCats);
		System.out.println(numberOfDogs);

	}
	
	public static int frequency(String sentence, String word) {
		sentence = sentence.toLowerCase();
		word = word.toLowerCase();
		int count = 0;
		while (sentence.contains(word)) {
			sentence = sentence.replaceFirst(word, "");
			count++;
		}
		return count;
		
	}

}
