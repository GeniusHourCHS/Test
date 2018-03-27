import java.util.regex.Pattern;

public class NaturalLanguageUtil {
	
	public static String process(String question) {
		//math
		if(question.replaceAll(" ", "").substring(0,3).matches("\\d[+-/*\\^]\\d")) {
			return Calculator.simplify(question.replaceAll(" ", ""));
		}
		Pattern removedThings = Pattern.compile("\\w");
		String output = question.toLowerCase().replaceAll("the ", "");
		return output;
	}
	
}
