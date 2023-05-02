package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		int range= 8, firstNum =0, secondNum =1;
			System.out.println(firstNum);
		 for(int i=1; i<=range; i++)
		 {
		 int sum = firstNum + secondNum;
		  firstNum = secondNum;
		  secondNum = sum;
		 System.out.println(sum);
		 }
	}

}
