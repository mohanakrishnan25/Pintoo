package demo;

import java.util.HashMap;
import java.util.Map;

public class OccurancesOfWord {
	public static void main(String[]args) {
		String word = "Java is simple and Java is easy";
		String[] sp = word.split(" ");
		Map<String,Integer> words = new HashMap<>();
		for(String c : sp) {
			if(words.containsKey(c)) {
				Integer count = words.get(c);
				words.put(c, count+1);
			}
			else {
				words.put(c, 1);
			}
		}
	System.out.println(words);
	}
	

}
