import java.io.*; import java.util.*; import static java.lang.System.*; 
public class Main { 
	public static void main(String[] args) { 
		Scanner big = new Scanner(System.in); 
		String[] nums = {"0","1","2","3","4","5","6","7","8","9"};
		final List<String> numbers = Arrays.asList(nums);
		
		/*
		 * Introduction and greeting
		 */
		out.println("Hello, I am chatbot."); 
		out.println("I can: add numbers and tell jokes. What's your name?"); 
		String name = big.next(); 
		out.println("Great, " + name + ". Now ask me anything."); 
		big.nextLine();
		
		/*
		 * processing the question
		 */
		
		String question = big.nextLine(); 
		do { 
			
			//setting up arraylist of question
			String[] q = question.split(" ");	
			List<String> line = Arrays.asList(q);
			String s = line.get(0).toLowerCase(); //the first word
			
			//Simplifying expression
			if(numbers.contains(s.substring(0,1))) {
				if(line.size() > 1) {
					int x = Integer.parseInt(line.get(0));
					int y = Integer.parseInt(line.get(2));
					//Calculator.calculate(x,y,line.get(1));				
				}	
			}
			
			if(s.equals("what")) {
				out.println("what?");
			} else if(s.equals("how")) {
				
			}
			
			question = big.nextLine(); 
			
		} 
		while (!question.equals("bye")); 
		out.println("okay, bye :'(");
	} 
}