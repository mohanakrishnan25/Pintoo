package demo;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceOfWord {
	public static void main(String[]args) {
	String word ="JAVA IS SIMPLE AND JAVA IS EASY";
	String[] sp =word.split(" ");
	Map<String,Integer> map= new LinkedHashMap<>();
	for(String s: sp) {
	 if (map.containsKey(s)) {
		int count = map.get(s);
		map.put(s, count+1);
	 }else {
		 map.put(s,1);
	 }
	}
System.out.println(map);
}
}