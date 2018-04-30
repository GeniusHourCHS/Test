import java.io.IOException;
import java.net.URLEncoder;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.List;

import java.util.Random;

public class Test {
	
	public static void main(String[] args) throws IOException  { 
		
		String encoding = "UTF-8";
		
			String searchText = "who is the president of Argentina";
			Document google = Jsoup.connect("https://www.google.com/search?q="+ URLEncoder.encode(searchText, encoding)).userAgent("Mozilla/5.0").get();
			String title = google.title();
			System.out.println(title);
			
			//Elements test = google.getElementsByClass("CLASS");
			
			//System.out.println(test);
			
			//Element temp = google.getElementById("top_nav");
	 		String temp = google.select("div div div div div div div").get(0).text();
			System.out.println(temp);
	        
	         
			//title1 = google.select("div[class=Z0LcW]").text();
	
		
		// private static void log(String msg, String... vals) {
		        //System.out.println(String.format(msg, vals));
	}
}


	

	



