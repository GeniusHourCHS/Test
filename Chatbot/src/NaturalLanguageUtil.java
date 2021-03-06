import java.util.regex.Pattern;

public class NaturalLanguageUtil {
	
	public static String process(String question) {
		//math
		if(question.replaceAll(" ", "").matches("^(\\d+[+-/*\\^]\\d+).*$")) {
			return Calculator.simplify(question.replaceAll(" ", ""));
		}
		
		Pattern removedThings = Pattern.compile("\\w");
		
		String output = replaceArticles(question.toLowerCase());
		output = apostropheProcess(output);
		
		
		
		
		if(output.length() > 4 && output.substring(0,  4).equals("when")) {
			output = when(output);			
		} else if(output.length()  > 3 && output.substring(0 ,3).equals("how")) {
			output = how(output);
		}

		return output;

	}
	private static String replaceArticles(String question) {
		String output = question.replaceAll("the |an |a ", "");
		return output;
	}

	/**
	 * processes phrases with apostrophes to a proper format
	* @param question is the question inputted by the user.
	* @return is the question with apostrophes converted to "is"
	* e.g. "What's" -> "What is "
	 */
	private static String apostropheProcess(String question) {
		String output = question;
		int apostrophe = question.indexOf("'");
		while(apostrophe != -1) {
			if(output.substring(apostrophe).length() < 3) {
				return output.substring(0,apostrophe) + " is";
			} else if(output.charAt(apostrophe+1) == 's') {
				output = output.substring(0,apostrophe) + " is " + output.substring(apostrophe+3);
			
			}
			apostrophe = output.indexOf("'");
		}
		return output;
	}

	/**
	 * any Question method responds to a question with a question word.
	 * If the program doesn't know how to respond, it searches the web
	 * @param question is the question asked by the user,
	 *                 in format "[question word] [verb] [rest of question]?"
	 *                 e.g. "who are you?" "what can you do?"
	 * @return is the computer-generated response
	 */
	private static String who(String question) {
		return question;
	}

	private static String what(String question) {
		if(question.equals("what can you do?")) {
			return "I can tell jokes, do math or flip a coin.";
		}
		String[] q = question.split(" ");
		String questionWord = q[1];
		if(questionWord.equals("is")) {
			
		}
		 return ("I don't know, what " + questionWord + question.substring(6+questionWord.length()) + "?");
	}

	private static String when(String question) {
		String[] q = question.split(" ");
		String questionWord = q[1];
		if(questionWord.equals("was")) {
			return "A long, long time ago.";
		} else if (questionWord.equals("does")) {
			
		}
		
		return ("I don't know, when " + questionWord + " " + question.substring(6+questionWord.length()) + "?");
	}

	private static String where(String question) {
		return question;
	}
	private static String why(String question) {
		return question;
	}
	private static String how(String question) {
		if(question.equals("how are you?")) {
			return "I am pleased to meet you!";
		}
		return question;
	}


	
}
