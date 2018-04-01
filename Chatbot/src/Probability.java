import java.util.Random;

public class Probability {
	
	//method flips coin and returns a string with which side the coin landed on
	public static String flipCoin()
	{
		Random rand = new Random();
		int val = rand.nextInt(2);
		String value = "";
		
		if(val == 0) 
		{
			value = "Heads";
		}
		else
		{
			value = "Tails";
		}
		
		return value;
	}

	//method picks a random card from a standard deck of cards, returns what type of card was chosen
	public static String pickCard()
	{
		String card = "";
		String cardNumFinal = "";
		
		Random rand = new Random();
		int cardNum = rand.nextInt(13) + 1;
		
		Random rand2 = new Random();
		int faceNum = rand2.nextInt(4) + 1;
		
		switch(cardNum)
		{
		case 1:
			cardNumFinal = "Jack";
			break;
		case 2:
			cardNumFinal = "2";
			break;
		case 3:
			cardNumFinal = "3";
			break;
		case 4:
			cardNumFinal = "4";
			break;
		case 5:
			cardNumFinal = "5";
			break;
		case 6:
			cardNumFinal = "6";
			break;
		case 7:
			cardNumFinal = "7";
			break;
		case 8:
			cardNumFinal = "8";
			break;
		case 9:
			cardNumFinal = "9";
			break;
		case 10:
			cardNumFinal = "10";
			break;
		case 11:
			cardNumFinal = "King";
			break;
		case 12:
			cardNumFinal = "Queen";
			break;
		case 13:
			cardNumFinal = "Ace";
			break;	
		}
		
		switch(faceNum)
		{
		case 1:
			card = cardNumFinal + " of Hearts";
			break;
		case 2:
			card = cardNumFinal + " of Spades";
			break;
		case 3:
			card = cardNumFinal + " of Cloves";
			break;
		case 4:
			card = cardNumFinal + " of Aces";
			break;
		}
		
		return card;
	}
	
	//method that returns a random number in a range
	public static int pickRandomNumber(int start, int end) 
	{	
	//int range = start - end; 
	
	Random rand3 = new Random();
	int randomNumber = rand3.nextInt(end);
	
	if(randomNumber < start)
	{
		randomNumber = randomNumber + start;
	}
	
	return randomNumber;
	}
	
	
}
