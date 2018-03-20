import java.util.Random;

public class phrases {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int joke = 1;//rand.nextInt(50);
		String jokeString = "1"; 
		String jokeAnswer = "2";
		switch(joke) 
		{
		case 1: jokeString = "Why did the goat walk into the apple store";
				jokeAnswer = "To eat an apple";
		break;
		case 2: jokeString = "How many South Americans does it take to change a lightbulb";
				jokeAnswer = "A Brazilian";
		break;	
		}
		System.out.println(jokeString);
		System.out.println(jokeAnswer);
		
	}

}
