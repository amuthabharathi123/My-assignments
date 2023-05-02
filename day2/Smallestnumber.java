package week1.day2;
import java.util.Arrays;

public class Smallestnumber {
	public static void main(String[] args) {
		int[] num = {23,45,67,32,89,22};
		int length = num.length;
		System.out.println(length);
		Arrays.sort(num);
		System.out.println("second smallest number " + num[1]);
	}
}
