import java.io.*; import java.util.*;

import static java.lang.System.*; 

public class Main { 
	
	public static void main(String[] args) { 
		run();
	}
	
	public static void run() {
		Scanner big = new Scanner(System.in); 
		String[] nums = {"0","1","2","3","4","5","6","7","8","9"};
		final List<String> numbers = Arrays.asList(nums);
		String[] greet = {"hello", "hi", "hey"};
		final List<String> greetings = Arrays.asList(greet);
		/*
		 * Introduction and greeting
		 */
		Phrases p = Phrases.getJoke(1);
		out.println("Hello, I am chatbot."); 
		out.println( "What's your name?"); 
		User user = new User(big.next(), "null", 0);
		out.println("Great, " + user.getName() + ". Now ask me  things like: \"How are you?\", or \"Make my name fancy\"");
		big.nextLine();
		boolean isJoke = false;
		/*
		 * processing the question
		 */
		
		String question = big.nextLine(); 
		//doesn't do anything yet
		question = NaturalLanguageUtil.process(question);
		do { 
			String output = "";
			//setting up arraylist of question
			
			String[] q = question.split(" ");	
			List<String> ln = Arrays.asList(q);
			ArrayList<String> line = new ArrayList<>(ln);

			String s = line.get(0).toLowerCase(); //the first word
			
			//Simplifying expression
			output += question;
			//respond to greetings
			if(greetings.contains(s)) {
				//Conversation.greeting(s);
				out.println(s + " how r u  tododay, I am Gucci thanks for asking");
			}

			if(s.equals("what")) {
				out.println("what?");
			} else if(s.equals("no")) {
				out.println("Why not?");
			}
			
			//testing probability
			if(question.equals("flip a coin")) {
				String coin = Probability.flipCoin();
				out.println(coin);
			}
			if(question.equals("pick a card")) {
				String card = Probability.pickCard();
				out.println(card);
			}	
				
			//testing Phrases.java
			if(question.equals("tell me a joke")) {
				p = Phrases.getJoke((int)(Math.random()*25)+1);
				out.println(p.getFirst());
				isJoke = true;
			}
			if(isJoke) {
				out.println(p.getSecond());
				isJoke = false;
			}
			
			
			out.println(output);
			question = NaturalLanguageUtil.process(big.nextLine()); 
			
		} 
		while (!question.equals("bye")); 
		out.println("okay, bye :'(");
	}
}
