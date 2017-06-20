import java.util.Scanner;

public class FindMarble {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		int t = sc.nextInt();
		int counter = 0;
		boolean flag = true ;
		for(int i = 0 ; i < n ; i++)
			sc.nextInt();
		if(s < t)
			System.out.println(-1);
		if(s == t)
			System.out.println(0);
		if(s > t) {
			while(flag) {
				counter ++ ;
				s ++ ;
				if(s > n)
					s %= n ;
				if(s == t)
					flag = false ;
			}
			System.out.println(counter);}
	}
}	