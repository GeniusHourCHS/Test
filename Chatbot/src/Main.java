import java.io.*; import java.util.*; import static java.lang.System.*; 
public class Main { 
	public static void main(String[] args) { 
		Scanner big = new Scanner(System.in); 
		out.println("Hello, I am chatbot."); 
		out.println("I can: add numbers and tell jokes. What's your name?"); 
		String name = big.next(); 
		out.println("Great, " + name + ". Now ask me anything."); 
		big.nextLine();
		String question = big.nextLine(); 
		do { 
			
			Scanner line = new Scanner(question);
			String s = line.next().toLowerCase();
			
			
			if(s.equals("what")) {
				out.println("what?");
			} else if(s.equals("how")) {
				
			}
			
			question = big.nextLine(); 
			
		} 
		while (!question.equals("stop")); 
	} 
}