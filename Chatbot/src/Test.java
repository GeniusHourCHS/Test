import java.io.IOException;
import java.net.URLEncoder;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.Random;

public class Test {
	
	public static void main(String[] args) { 

		String encoding = "UTF-8";
		
		try {
			String searchText = "donald trump";
			Document google = Jsoup.connect("https://www.google.com/search?q=" + URLEncoder.encode(searchText, encoding)).userAgent("Mozilla/5.0").get();
			
			Elements webSitesLinks = google.getElementsByTag("cite");
			
			//Check if any results found
			if (webSitesLinks.isEmpty()) {
				System.out.println("No results found");
				return;
			}
			
			webSitesLinks.forEach(link->System.out.println(link.text()));
			
			//========If you want to get the first link ================
			//String firstWebSiteLink = webSitesLinks.get(0).text();
			
			//System.out.println(firstWebSiteLink);
			
			//Move to the next page code..
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
	



