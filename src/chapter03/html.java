package chapter03;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class html {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Document allcity=Jsoup.connect("https://hotels.ctrip.com/domestic-city-hotel.html/").get();
		Elements city_elements=allcity.getElementsByClass("pinyin_filter_detail layoutfix" );
		//System.out.println(city_elments);
		Elements hotelcitys=city_elements.first().getElementsByTag("dd");
		//System.out.println(hotelcity);
		//第二步，获取<dd></dd>标签下所有的a标签
		//for (int i=0;i<hotelcitys.size();i++) {
			//当前dd
			//Element	head_hotelcity=hotelcitys.get(i);
			// 当前dd下的所有孩子也就是a标签
			//Elements links=head_hotelcity.children();
		    //System.out.println(links.attr("href"));
			//System.out.println(links.text());

	}
	}

