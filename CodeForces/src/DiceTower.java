import java.util.Scanner;

public class DiceTower {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int n = sc.nextInt();
		int m = 7-n ;
		int temp ;
		boolean flag = false ;
		for(int i = 0 ; i < number ; i ++){
			for(int j = 0 ; j < 2 ; j ++) {
			temp = sc.nextInt();
			if(temp == n || temp == m) {
				flag = true ;
				break ;
			}}
		}
		if(flag) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
	}
}
