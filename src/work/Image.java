package work;

/**
 * <p>title Image
 * @author yuanjie
 * @DATE 2017��9��22������9:42:44


 */
import java.util.*;
public class Image {  
	public static int N;
    int [][] result = new int[N][N];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�����������ɵķ���߳���");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		N = n;
		Image rm = new Image();  
        rm.generateRotate(1, 0, N);  
        rm.printResult();  
    }  
      
    //������ת����  
    public void generateRotate(int number, int begin, int size){  
    	
    	if(size == 1){  
            result[begin][begin] = number;  
            return;  
        }  
          
        if(size == 0){  
            return;  
        }  
        //��������A  
        int i = begin;  
        int j = begin;  
        for(int k = 0; k < size - 1; k++){  
            result[i][j] = number;  
            number++;  
            i++;  
        }  
          
        //��������B  
        for(int k = 0; k < size - 1; k++){  
            result[i][j] = number;  
            number++;  
            j++;  
        }  
          
        //��������C  
        for(int k = 0; k < size - 1; k++){  
            result[i][j] = number;  
            number++;  
            i--;  
        }  
          
        //��������D  
        for(int k = 0; k < size - 1; k++){  
            result[i][j] = number;  
            number++;  
            j--;  
        }  
          
        //�ݹ����  
        generateRotate(number, begin + 1, size - 2);  
    }  
      
    public void printResult(){  
        for(int i = 0; i < N; i++){  
            for(int j = 0; j < N; j++){  
                System.out.print(result[i][j] + "   ");  
                if(j == N - 1){  
                    System.out.println();  
                }  
            }  
        }  
    }  
}
