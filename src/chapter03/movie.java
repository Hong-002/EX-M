package chapter03;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class movie {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Document a=Jsoup.connect("https://www.douban.com/").get();
		Elements elements=a.getElementsByClass("list1 movie-charts");
		Elements movie=elements.select("a[href]");
		for(Element name:movie) {
			System.out.println(name.text());

	}
	}
}
