package demo;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfLetter {

	public static void main(String[]args) {
	String name= "MY NAME IS MOHANAKRISHNAN";
	Map<Character, Integer> map = new HashMap<>();
    for(int i=0;i<name.length(); i++){
    char c=name.charAt(i);
    if(map.containsKey(c)){
    Integer count = map.get(c);
    map.put(c, count+1);
    }
    else{
    map.put(c,1);
    }
    }
    System.out.print(map);
}
}
