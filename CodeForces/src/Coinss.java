import java.util.Scanner;

public class Coinss {
	public static void main(String [] args ){
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		sc.close();
		System.out.print(x+" ");
		boolean flag = true ;
		while(flag){
			for (int i = 2 ; i <= x ; i ++){
				if(x%i == 0){
					x = x / i;
					System.out.print(x+" ");
					break ;}
			}
			if(x == 1)
				flag = false ;
		}		
	}
}
