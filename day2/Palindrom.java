package week1.day2;

public class Palindrom {
public static void main(String[] args) {
	int input= 34343;
	int output=0;
	for(input=34343; input>0; input =input/10) {
		int rem=input%10;
		output = output*10+rem;
		
	}
	if(output==input)
	{
		System.out.println("this is palindrom" );
	}
	else {
		System.out.println("not polindrom");
	}
}
}
