//import java.util.Random;

public class Phrases {
	    
	private String jokeA;
	private String answer;
	
	public Phrases(String first, String second) {
	        jokeA = first;
	        answer = second;
	    }

	 public String getFirst() {
	        return jokeA;
	    }

	public String getSecond() {
	        return answer;
	    }
	    
	    
	    	    
	
		public static Phrases getJoke(int joke)
		{
			String jokeString = null;
			String jokeAnswer = null;
		
			switch(joke) 
		{
		case 1: jokeString = "Why did the goat walk into the apple store";
		jokeAnswer = "To eat an apple";
		break;
		case 2: jokeString = "How many South Americans does it take to change a lightbulb";
		jokeAnswer = "A Brazilian";
		break;
		case 3: jokeString = "What kind of bagel can fly";
		jokeAnswer = "A plain bagel";
		break;	
		case 4: jokeString = " Where do animals go when their tails fall off";
		jokeAnswer = "The retail store";
		break;	
		case 5: jokeString = "Why can't you hear a pterodactyl going to the bathroom";
		jokeAnswer = "Because the P is silent";
		break;	
		case 6: jokeString = "How does a train eat";
		jokeAnswer = "It goes chew chew";
		break;	
		case 7: jokeString = "What do you call a cow with no legs";
		jokeAnswer = "Ground Beef";
		break;	
		case 8: jokeString = " How is imitation like a plateau";
		jokeAnswer = "They are both the highest forms of flattery";
		break;	
		case 9: jokeString = "A magician was driving down the street";
		jokeAnswer = "Then he turned into a driveway";
		break;	
		case 10: jokeString = "What's the best thing about living in Switzerland";
		jokeAnswer = "I don't know but the flag is a big plus";
		break;	
		case 11: jokeString = "What does Batman get in his drinks";
		jokeAnswer = "Just Ice";
		break;	
		case 12: jokeString = "What does a nosy pepper do";
		jokeAnswer = "Gets jalapeno business";
		break;	
		case 13: jokeString = "What did the buffalo say to his son when he left for college";
		jokeAnswer = "Bison";
		break;	
		case 14: jokeString = "I tried to take a photograph of some fog";
		jokeAnswer = "I Mist";
		break;	
		case 15: jokeString = "What do you call fake spaghetti";
		jokeAnswer = "An im-pasta";
		break;	
		case 16: jokeString = "Why did the mushroom go to the party";
		jokeAnswer = "Because he was a fungi";
		break;	
		case 17: jokeString = "Why did the farmer win an award";
		jokeAnswer = "Because he was out-standing in his field";
		break;	
		case 18: jokeString = "What do you call birds that stick together";
		jokeAnswer = "Vel-crows";
		break;	
		case 19: jokeString = "What do sea monsters eat";
		jokeAnswer = "Fish and ships";
		break;	
		case 20: jokeString = "What did the tomato say to the other tomato during a race";
		jokeAnswer = "Ketchup";
		break;	
		case 21: jokeString = "Why does a chicken coop only have two doors";
		jokeAnswer = "Because if it had 4, it'd be a sedan";
		break;	
		case 22: jokeString = "What do you call a sleeping dinosaur";
		jokeAnswer = "A dino-snore";
		break;	
		case 23: jokeString = "What do you get when you drop a piano down a mine shaft";
		jokeAnswer = "A flat-minor";
		break;	
		case 24: jokeString = "What did one hat say to the other hat";
		jokeAnswer = "You stay here... I'm gonna go an a-head";
		break;	
		case 25: jokeString = " What do you call a singing computer";
		jokeAnswer = "A-dele";
		break;	

		}
		
		return new Phrases(jokeString, jokeAnswer);
		
		}
		
		/*shows its working
		Random rand = new Random();
		int joke = rand.nextInt(26);
		Phrases Phrases = getJoke(joke);
		System.out.println(Phrases.joke() + Phrases.answer());
		*/
		
		//one liners method, similar to getJoke method but only returns one string as implied in the name
		
		public static String getOneLiner(int joke)
		{
			String oneLiner = null;
		
			switch(joke) 
		{
			case 1:
				oneLiner = "Worry is the interest paid in advance on a debt you may never owe";
				break;
			case 2:
				oneLiner = "They tried to bury us, but they didn't know we were seeds";
				break;
			case 3:
				oneLiner = "If you don't sacrifice for what you want, what you want will be the sacrifice";
				break;
			case 4:
				oneLiner = "Be as you wish to seem";
				break;
			case 5:
				oneLiner = "In  order to love who you are, you cannot hate the experiences that shaped you";
				break;
			case 6:
				oneLiner = "When you're curious, you find lots of interesting things to do";
				break;
			case 7:
				oneLiner = "Challenges are what make life interesting and overcoming them is what makes life meaningful";
				break;
			case 8:
				oneLiner = "Raise your words not your voice as it is rain that grows flowers, not thunder";
				break;
			case 9:
				oneLiner = "There can be no positive results through a negative attitude, think positive, live positive";
				break;
			case 10:
				oneLiner = "The cost of not following your heart is spending the rest of your life wishing you had";
				break;
			case 11:
				oneLiner = "The biggest communication problem is we don't listen to understand, we listen to reply";
				break;
			case 12:
				oneLiner = "Be not afraid of going slowly, be afraid only of standing still";
				break;
			case 13:
				oneLiner = "When you take an L, don't lose the lesson";
				break;
			case 14:
				oneLiner = "Learn the rules so you know how to break them properly";
				break;
			case 15:
				oneLiner = "Sometimes the people who don't talk to you are the ones that really want to";
				break;
		}	
			return oneLiner;
		}
}



