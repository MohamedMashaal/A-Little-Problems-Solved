import java.util.Scanner;

public class SelectionofPersonnel {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long tempresult = 1 ;
		long finalresult = 0 ;
		for(int i = 1 ; i <= 7 ; i++) {
			tempresult *= (n-i+1) ;
			tempresult /= i ;
		}
		finalresult += tempresult ;
		tempresult = 1;
		for(int i = 1 ; i <= 6 ; i++) {
			tempresult *= (n-i+1) ;
			tempresult /= i ;
		}
		finalresult += tempresult ;
		tempresult = 1;
		for(int i = 1 ; i <= 5 ; i++) {
			tempresult *= (n-i+1) ;
			tempresult /= i ;
		}
		finalresult += tempresult ;
		System.out.println(finalresult);
	}
}
