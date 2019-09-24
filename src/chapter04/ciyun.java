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
			//1����һ����Ƶ�����������ô�Ƶ
			FrequencyAnalyzer fr1 = new FrequencyAnalyzer();
			fr1.setWordFrequenciesToReturn(200);
			//2���ر��ص�һ���ı��ļ�����Ϊ��Ƶ���ϡ�
			List<WordFrequency> wl1 = fr1.load(".\\data\\wordcloud.txt");
		    //3���÷ֱ���
			Dimension d1 = new Dimension(512,312);				
		    //4�������ƶ���	(CollisionMode.PIXEL_PERFECT������ײģʽ����������䣩
			WordCloud wc1 = new WordCloud(d1,CollisionMode.PIXEL_PERFECT);
			//������ɫΪ��ɫ������ͼƬΪimages/whale_small.png
			wc1.setBackgroundColor(Color.WHITE);
			wc1.setBackground(new PixelBoundryBackground(".\\img\\whale_small.png"));
			//�������������ʽ:����Ϊ�����б��24����
			
			//���ʱ߽�Ϊ2��
			
			//���ƴ�Ƶ������ɫ����Ϊ�����졢�̣�������Ƶ�ǰ�Ĳ��ú�ɫ���е�����ɫ���ϵ׵�����ɫ����
			wc1.setColorPalette(new ColorPalette(Color.red,Color.BLUE,Color.green));

			//���ݴ�Ƶ�ߵ�����������ɢ�����ҵ��ʺ������

			//5����һ�����Ʋ����浽һ��ָ����"E:/������Ӧ�ÿ���/show/lx?.png"ͼƬ�С�
			wc1.build(wl1);
			wc1.writeToFile("E:/������Ӧ�ÿ���/show/lx3.png");

		}
}
