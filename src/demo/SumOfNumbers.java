package demo;

public class SumOfNumbers {
	public static void main(String[]args) {
		int num = 123456789;
		int i=0,j=0,a=num;
		while(a>0) {
			i=a%10;
			j=j+i;
			a=a/10;
		}
		System.out.println(j);
	}

}
