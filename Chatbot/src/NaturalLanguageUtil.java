import java.util.regex.Pattern;

public class NaturalLanguageUtil {
	
	public static String process(String question) {
		//math
		if(question.replaceAll(" ", "").matches("^(\\d+[+-/*\\^]\\d+)")) {
			return Calculator.simplify(question.replaceAll(" ", ""));
		}
		
		Pattern removedThings = Pattern.compile("\\w");
		
		String output = replaceArticles(question.toLowerCase());
		output = apostropheProcess(output);
		return output;
	}
	private static String replaceArticles(String question) {
		String output = question.replaceAll("the |an |a ", "");
		return output;
	}
	
	/*
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
	private static String where(String question) {
		return question;
	}
	
}
