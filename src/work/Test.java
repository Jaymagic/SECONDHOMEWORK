package work;
import java.util.*;


/**
 * <p>title Test
 * @author yuanjie
 * @DATE 2017��9��23������10:41:21


 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int n;
     System.out.println("������һ����С��0��������");
     Scanner t=new Scanner(System.in);
     n=t.nextInt();
     System.out.println("������Ϊ��");
     CAL(n);
     
	}
	public static void CAL(int i) {
		System.out.println(i);
		if(i<=5000) {
			CAL(2*i );
		}
		System.out.println(i);
			
		
	}

}
