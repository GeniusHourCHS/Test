import java.util.ArrayList;

class Calculator {

		
		
		private static double calc(double one, double two, String operator){
			double answer = 0.0;
			double fail = 0.0;
			if(operator.equals("+")) {
			answer = one + two;
			}
			else if(operator.equals("-")){
			answer = one - two;
			}
			else if(operator.equals("/")){
			answer = one/two;		
			}
			else if(operator.equals("*")){
			answer = one * two;
			}
			else if(operator.equals("^")){
				answer = Math.pow(one,  two);
			}
			else{
			fail = 1;
	
			}
			if(fail == 1) {
				return fail;
			}
			else{
				return answer;		
			}
		}

	/*
	 * @param line is an expression in form "# sign # sign #"
	 * @return a formatted string with the answer
	 */
	public static String simplify(ArrayList<String> line) {
		if(line.toString().equals("[2, +, 2, -, 1]")) {
			return "TWO PLUS TWO MINUS ONE THAT'S THREE QUICK MATHS!\n--BIG SHAQ, 2017";
		}

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

		String output = ""+line.get(0);
		//formatting the output
		while(output.charAt(output.length()-1) == '0') {
			output = output.substring(0, output.length()-1);
		}
		if(output.charAt(output.length()-1) == '.') {
			output = output.substring(0, output.length()-1);
		}
		return output;
	}

		
}
