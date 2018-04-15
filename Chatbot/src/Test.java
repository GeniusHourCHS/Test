import java.io.IOException;
import java.net.URLEncoder;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.Random;

public class Test {
	
	public static void main(String[] args) { 

		//String encoding = "UTF-8";
		
		try {
			//String searchText = "Duck";
			Document google = Jsoup.connect("https://www.facebook.com"/* + URLEncoder.encode(searchText, encoding)).userAgent("Mozilla/5.0"*/).get();
			String title = google.title();
			System.out.println(title);
		
			/*Elements webSitesLinks = google.getElementsByTag("cite");
			
			//Check if any results found
			if (webSitesLinks.isEmpty()) {
				System.out.println("No results found");
				return;
			}
			
			webSitesLinks.forEach(link->System.out.println(link.text()));
		*/
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
		
	}
	
}
	



