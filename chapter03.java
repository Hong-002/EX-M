import java.util.Random;
import java.util.Scanner;
public class chapter03 {

    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran=new Random();
		int rnum=ran.nextInt(99) + 1;
		System.out.println("请输入一个1-100的整数，看看是否中奖");
		Scanner scanner=new Scanner(System.in);
		int i=0;
		for(;;) {
			int num=scanner.nextInt();
			if(num>rnum) {
				System.out.println("大了，继续猜");
				i+=1;
			}else if(num<rnum){
				System.out.println("小了，继续猜");
				i+=1;
			}else {
				System.out.println("恭喜你，猜对了");
				break;
			}
		}
		if (6<=i&&i<=10) {
			System.out.println("智商正常");
		}else if(i<6) {
			System.out.println("运气爆棚");
		}else {
			System.out.println("智商需要提升");
		}
			
		}
	}

