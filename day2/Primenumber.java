package week1.day2;

public class Primenumber {
public static void main(String[] args) {
	int num =7;
	boolean flag = false;
	for(int i=2; i<=num/2; i++) {
		if(num%i == 0) {
			flag = true;
			System.out.println("not a prime number");
			break;
		}
		else
		{
			System.out.println("this is prime number");
	}
}
}}
