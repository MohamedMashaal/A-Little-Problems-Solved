import java.util.Scanner;

public class TheWorldisaTheatre {
	public static long getComb(long x ,long y) {
		long result = 1 ;
		for(int i = 1 ; i <= y ; i++) {
			result *= (x-i+1) ;
			result /= i ;
		}
		return result ;
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long m = sc.nextInt() ;
		long t = sc.nextInt() ;
		long result = 0 ;
		for(int i = 0 ; i <= t ; i ++) {
			if(t-i >= 4 && i >=1)
			result += ( getComb(n, t-i) * getComb(m, i));}
		System.out.println(result);
	}
	
}
