import java.io.IOException;
import java.net.URLEncoder;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.Random;

public class Test {
	
	public static void main(String[] args) throws IOException  { 

		String encoding = "UTF-8";
		
			String searchText = "who is the president";
			Document google = Jsoup.connect("https://www.google.com/search?rlz="+ URLEncoder.encode(searchText, encoding)).userAgent("Mozilla/5.0").get();
			String title = google.title();
			System.out.println(title);
			
			Element link = google.select("div class answer").first();     
			System.out.println("Text: " + link.text());
			
			//title1 = google.select("div[class=Z0LcW]").text();
	
		
		// private static void log(String msg, String... vals) {
		        //System.out.println(String.format(msg, vals));
	}
}
	

	



