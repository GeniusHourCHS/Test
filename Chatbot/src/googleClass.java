import java.io.IOException;
import java.net.URLEncoder;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class googleClass {

	public static void main(String args[]) throws IOException {
		String input = "";
		do {
			Scanner s = new Scanner(System.in);
			System.out.print("enter a search phrase: ");
			input = s.nextLine();
			System.out.println(googleRetrieveAnswer(input));
		} while(!input.equals("stop"));

	}
	public static String googleRetrieveAnswer(String input)
	{		
		String encoding = "UTF-8";
		
		try {
			Document google = Jsoup.connect("https://www.google.com/search?q=" + URLEncoder.encode(input, encoding)).userAgent("Mozilla/5.0").get();
			String title = google.title();
			System.out.println(title);
			String answer = google.select("div div div div div div div").get(0).text();
			
			return answer;
	        
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
