import java.util.Scanner;

public class BeautifulMatrix {
	public static void main(String [] args){
		long Number , x = 0 , y = 0;
		Scanner sc = new Scanner(System.in);
		int flag = 0 ;
		for(int i = 1 ; i <= 5 ; i ++){
			for(int j = 1 ; j <= 5 ;  j ++)
				if(sc.nextInt() == 1){
					x = i ;
					y = j ;
					flag = 1 ;
					break ;}
			if(flag == 1)
				break ;}
		Number = abs(3 - x) + abs(3 - y) ;
		System.out.println(Number);
	}

	private static long abs(long l) {
		if (l < 0 )
			l = -l ;
		return l;
	}
}