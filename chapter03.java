import java.util.Random;
import java.util.Scanner;
public class chapter03 {

    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran=new Random();
		int rnum=ran.nextInt(99) + 1;
		System.out.println("������һ��1-100�������������Ƿ��н�");
		Scanner scanner=new Scanner(System.in);
		int i=0;
		for(;;) {
			int num=scanner.nextInt();
			if(num>rnum) {
				System.out.println("���ˣ�������");
				i+=1;
			}else if(num<rnum){
				System.out.println("С�ˣ�������");
				i+=1;
			}else {
				System.out.println("��ϲ�㣬�¶���");
				break;
			}
		}
		if (6<=i&&i<=10) {
			System.out.println("��������");
		}else if(i<6) {
			System.out.println("��������");
		}else {
			System.out.println("������Ҫ����");
		}
			
		}
	}

