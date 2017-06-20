import java.util.Scanner;

public class ThePlayboyChimp {
	static int [] Numbers ;
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Numbers = new int [N];
		int NumbersCounter = 0;
		int t ;
		for(int i = 0 ; i < N ; i++) {
			t = sc.nextInt();
			if(i == 0) {
			Numbers[NumbersCounter] = t ;
			NumbersCounter ++ ;
			}
			if(i > 0) {
				if(t == Numbers[NumbersCounter-1]) {
					continue;}
				else {
					Numbers[NumbersCounter] = t ;
					NumbersCounter ++ ;}}
			}
		int Q = sc.nextInt();
		for(int j = 0 ; j < Q ; j++) {
			int Num = sc.nextInt();
			int Index = BSthis(Num ,0 , NumbersCounter-1 );
			if(Numbers[Index] == Num) {
				if(Index-1 >= 0)
					System.out.print(Numbers[Index-1]+" ");
				else
					System.out.print("X ");
				if(Index+1 <= NumbersCounter-1)
					System.out.println(Numbers[Index+1]);
				else
					System.out.println("X");
			}
			else if(Numbers[Index] > Num) {
				if(Index-1 >= 0)
					System.out.print(Numbers[Index-1]+" ");
				else
					System.out.print("X ");
				System.out.println(Numbers[Index]);
			}
			else if(Numbers[Index] < Num) {
				System.out.print(Numbers[Index]+ " ");
				if(Index+1 <= NumbersCounter-1)
					System.out.println(Numbers[Index+1]);
				else
					System.out.println("X");
			}
		}
		}

	private static int BSthis(int Num, int i, int j) {
		if(i == j)
			return i;
		else {
			if(Num == Numbers[i+(j-i)/2])
				return i+(j-i)/2;
			else if(Num > Numbers[i+(j-i)/2])
				return BSthis( Num, 1+i+(j-i)/2, j);
			else if (Num < Numbers[i+(j-i)/2]) {
				return BSthis(Num, i , i+(j-i)/2);
			}
		}
		return 0;
	}
}
