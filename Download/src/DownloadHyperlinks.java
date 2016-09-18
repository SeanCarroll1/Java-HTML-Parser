
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class DownloadHyperlinks {

  public static void main(String[] args) {

	Document doc;
	try {

		// need http protocol
		doc = Jsoup.connect("http://google.com")
				.userAgent("Mozilla")
				.get();

		// get page title
		System.out.println("title : " + doc.title());

		// get all links
		Elements links = doc.select("a[href]");
		for (Element link : links) {

			// get the value from href attribute
			System.out.println("\nlink : " + link.attr("href"));
			System.out.println("text : " + link.text());

		}

	} catch (IOException e) {
		e.printStackTrace();
	}

  }

}
