package chapter04;

import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;
import java.util.List;
import com.kennycason.kumo.CollisionMode;
import com.kennycason.kumo.WordCloud;
import com.kennycason.kumo.WordFrequency;
import com.kennycason.kumo.bg.PixelBoundryBackground;
import com.kennycason.kumo.nlp.FrequencyAnalyzer;
import com.kennycason.kumo.palette.ColorPalette;

public class ciyun {
		public static void main(String[]args) throws IOException{
			//1创建一个词频分析器，设置词频
			FrequencyAnalyzer fr1 = new FrequencyAnalyzer();
			fr1.setWordFrequenciesToReturn(200);
			//2加载本地的一个文本文件，作为词频集合。
			List<WordFrequency> wl1 = fr1.load(".\\data\\wordcloud.txt");
		    //3设置分辨率
			Dimension d1 = new Dimension(512,312);				
		    //4创建词云对象	(CollisionMode.PIXEL_PERFECT——冲撞模式，按像素填充）
			WordCloud wc1 = new WordCloud(d1,CollisionMode.PIXEL_PERFECT);
			//背景颜色为黄色，背景图片为images/whale_small.png
			wc1.setBackgroundColor(Color.WHITE);
			wc1.setBackground(new PixelBoundryBackground(".\\img\\whale_small.png"));
			//设置中文字体格式:字体为宋体粗斜体24磅；
			
			//单词边界为2；
			
			//词云词频单词颜色依次为蓝、红、绿；（，词频最靠前的采用红色，中的用蓝色，较底的用绿色。）
			wc1.setColorPalette(new ColorPalette(Color.red,Color.BLUE,Color.green));

			//根据词频高低由中心往外散发，且单词横向摆置

			//5生成一个词云并保存到一个指定的"E:/大数据应用开发/show/lx?.png"图片中。
			wc1.build(wl1);
			wc1.writeToFile("E:/大数据应用开发/show/lx3.png");

		}
}
