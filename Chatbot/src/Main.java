import java.io.*; import java.util.*; import static java.lang.System.*; 
public class Main { 
	public static void main(String[] args) { 
		Scanner big = new Scanner(System.in); 
		out.println("Hello, I am chatbot."); 
		out.println("I can: add numbers and tell jokes. What's your name?"); 
		String name = big.next(); 
		out.println("Great, " + name + ". Now ask me anything."); 
		String question = big.nextLine(); 
		do { 
			Scanner line = new Scanner(question); 
			out.println(question + " "); 
			question = big.nextLine(); } 
		while (!question.equals("stop")); 
	} 
}