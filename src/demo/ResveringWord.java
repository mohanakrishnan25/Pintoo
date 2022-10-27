package demo;

public class ResveringWord {
	public static void main(String[]args) {
		String name = "JAVA IS SIMPLE AND ESAY LANGUAGE";
		StringBuffer sb = new StringBuffer();
		sb.append(name);
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse);
		
	}

}
