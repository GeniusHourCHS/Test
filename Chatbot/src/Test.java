import java.util.Arrays;
import java.util.Random;

public class Test {
	
	public static void main(String[] args) { 
		String str = "123 456 789";
		String[] numbers = str.split(" ");
		int[] ints = new int[numbers.length];
		for(int c = 0; c < numbers.length; c++) {
			ints[c] = Integer.parseInt(numbers[c]);
		}
		System.out.println(Arrays.toString(numbers));
	}
	
}


