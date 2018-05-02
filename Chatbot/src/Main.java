import java.io.*; import java.util.*;
import java.time.LocalTime;
import java.applet.Applet;

import static java.lang.System.*; 

public class Main extends Applet {
	
	public static void main(String[] args) { 
		run();
	}
	
	private static void run() {
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
		User user = new User(big.nextLine());
		out.println("Great, " + user.getName() + ". Now ask me things like: \"How are you?\", or \"Make my name fancy\"");
		boolean isJoke = false;
		/*
		 * processing the question
		 */
		String question = NaturalLanguageUtil.process(big.nextLine());
		do {

			//out.println(question);
			String output = "";
			//setting up arraylist of question
			
			String[] q = question.split(" ");	
			List<String> ln = Arrays.asList(q);
			ArrayList<String> line = new ArrayList<>(ln);

			String s = line.get(0).toLowerCase(); //the first word
			
			//Simplifying expression
			if(question.matches("\\d+$"))
				output += question;
			//respond to greetings
			
			
			
			if(greetings.contains(s)) {
				//Conversation.greeting(s);
				output = s + ", " + user.getName() + ", you look beautiful today.";
			}

			if(s.equals("what")) {
				output = "what?";
			} else if(s.equals("no")) {
				output = "Why not?";
			}
			
			
		              /*THESE FUNCTIONS SHOULD BE MOVED TO THE PROBABILITY CLASS OR THE NATURAL LANGUAGE CLASS
			//create variables
			boolean pickNumRandEval;
			
			
			
			//testing probability
			if(question.equals("flipcoin")) {
				output = Probability.flipCoin();

			}
			if(question.equals("pickcard")) {
				output = Probability.pickCard();
			}	
			
			if(question.equals("picknumber") || question.equals("pickrandom number")) {
				pickNumRandEval = true;
				out.println("what is the range in this form, Starting Number Ending Number");
			}	
			
			//testing random number function
			if(pickNumRandEval=true) {
				String str = big.nextLine();
				String[] randNumbers = str.split(" ");
				int randNumRange1 = Integer.parseInt(randNumbers[0]);
				int randNumRange2 = Integer.parseInt(randNumbers[1]);
				int start = randNumRange1;
				int end = randNumRange2;
				int probNum = Probability.pickRandomNumber(start, end);
				output = "The number is " +probNum;
				}
			*/
			//testing Phrases.java
			if(question.equals("tell me joke")) {
				p = Phrases.getJoke((int)(Math.random()*25)+1);
				output = p.getFirst();
				isJoke = true;
			} else if(isJoke) {
				output = p.getSecond();
				isJoke = false;
			}
			if(question.equals("tell me inspirational quote")) {
				output = Phrases.getOneLiner((int)(Math.random()*15+1));
			}
			if(output.equals("")) output = question;

			
			
			out.println(output);
			question = NaturalLanguageUtil.process(big.nextLine()); 
			
			
			
			
			
			
			//Testing google program accessing
			String[] q1 = question.split(" ");
			String questionWord = q1[1];
		if (questionWord.equals("what is")) {
			
			String googleClassA = googleClass.googleReteiveAnswer(question);
			System.out.println(googleClassA);	
		} 
		else if (questionWord.equals("who")) {
			
			String googleClassA = googleClass.googleReteiveAnswer(question);
			System.out.println(googleClassA);
		}
		
		
		
		} 
		while (!question.equals("bye")); 
		out.println("okay, bye :'(");
	}
}
