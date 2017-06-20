import java.util.Scanner;

public class BlackSquare {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		long Factors[] = new long [4];
		for(int i = 0 ; i < 4 ; i ++)
			Factors[i] = sc.nextLong();
		String Numbers ;
		Numbers = sc.next();
		long CalCounter = 0 ;
		for (int i = 0 ; i < Numbers.length() ; i ++){
			CalCounter += Factors[(int)Numbers.charAt(i)-49] ;}
		System.out.println(CalCounter);
	}
}