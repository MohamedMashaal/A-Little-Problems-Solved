import java.util.Scanner;

public class NearlyLuckyNumber {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		int Counter = 0 ;
		for(int i = 0 ; i < x.length() ; i ++) {
			if(x.charAt(i) == '4' || x.charAt(i) == '7')
				Counter ++ ;
		}
		String z = Integer.toString(Counter);
		boolean flag = false ;
		for(int i = 0 ; i < z.length() ; i ++)
			if(!(z.charAt(i) == '4' || z.charAt(i) == '7')) {
				flag = true ;
				break ;
			}
		if(flag)
			System.out.println("NO");
		else
			System.out.println("YES");
	}
}
