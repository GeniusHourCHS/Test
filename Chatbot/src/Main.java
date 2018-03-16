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
		out.println("Ask me things like: \"How are you?\", or \"Make my name fancy\". What's your name?"); 
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
			List<String> ln = Arrays.asList(q);
			ArrayList<String> line = new ArrayList<>();
			line.addAll(ln);
			String s = line.get(0).toLowerCase(); //the first word
			
			//Simplifying expression
			if(numbers.contains(s.substring(0,1))) {
				simplify(line);
			}
			
			if(s.equals("what")) {
				out.println("what?");
			} else if(s.equals("no")) {
				out.println("Why not?");
			}
			
			question = big.nextLine(); 
			
		} 
		while (!question.equals("bye")); 
		out.println("okay, bye :'(");
	}
	/*
	 * @param line is an expression in form "# sign # sign #"
	 * method outputs to the console the answer formatted to the thousandths place, if necessary
	 */
	public static void simplify(ArrayList<String> line) {
		if(line.toString().equals("[2, +, 2, -, 1]")) {
			out.println("TWO PLUS TWO MINUS ONE THAT'S THREE QUICK MATHS!\n--BIG SHAQ, 2017");
		} else {

		//exponent
		while(line.contains("^")) {
			int index = line.indexOf("^");
			double x = Double.parseDouble(line.get(index-1));
			double y = Double.parseDouble(line.get(index+1));
			double answer = Calculator.calc(x,y,line.get(index));
			line.remove(index-1);
			line.remove(index-1);
			line.remove(index-1);
			line.add(index-1, Double.toString(answer));
		}
		
		//multiplication & division
		while(line.contains("*") || line.contains("/")) {
			int m = line.indexOf("*");
			int d = line.indexOf("/");
			int index;
			if(m == -1 && d == -1) {
				break;
			}
			if(m == -1) {
				index = d;					
			}
			else if(d == -1)
				index = m;
			else if(d > m)
				index = m;
			else
				index = d;
			
			
			
			
			double x = Double.parseDouble(line.get(index-1));
			double y = Double.parseDouble(line.get(index+1));
			double answer = Calculator.calc(x,y,line.get(index));
			line.remove(index-1);
			line.remove(index-1);
			line.remove(index-1);
			line.add(index-1, Double.toString(answer));
		}
		//addition & subtraction
		while(line.contains("+") || line.contains("-")) {
			int m = line.indexOf("+");
			int d = line.indexOf("-");
			int index;
			if(m == -1 && d == -1) {
				break;
			}
			if(m == -1) {
				index = d;					
			}
			else if(d == -1)
				index = m;
			else if(d > m)
				index = m;
			else
				index = d;
			
			
			
			
			double x = Double.parseDouble(line.get(index-1));
			double y = Double.parseDouble(line.get(index+1));
			double answer = Calculator.calc(x,y,line.get(index));
			line.remove(index-1);
			line.remove(index-1);
			line.remove(index-1);
			line.add(index-1, Double.toString(answer));
			
		}
		out.printf("%.3f\n", Double.parseDouble(line.get(0)));
	}
	}
}
