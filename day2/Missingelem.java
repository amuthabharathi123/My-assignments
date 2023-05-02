package week1.day2;
import java.util.Arrays;
public class Missingelem {
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,6,7,8,10};
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++ ) {
			if(i!=arr[i]) {
				System.out.println(i);
				break;
			}
		}
		
		
		
	}
	
	

}
