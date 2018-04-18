import java.io.IOException;
import java.net.URLEncoder;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class googleClass {

	public static String googleThing(String input)
	{
		String answer;
		
		String encoding = "UTF-8";
		
		try {
			Document google = Jsoup.connect("https://www.google.com/search?q=" + URLEncoder.encode(input, encoding)).userAgent("Mozilla/5.0").get();
			
			Elements Answer = google.getElementsByTag("answer");
			
			//Check if any results found
			if (webSitesLinks.isEmpty()) {
				answer = "No results found";
			}
		
		
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return answer;
	}
}
