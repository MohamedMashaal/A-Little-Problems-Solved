import java.util.Scanner;

public class Team {
	public static void main(String [] args ){
		int number ;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		int T ;
		long T_counter = 0 ;
		for(int i = 0 ; i < number ; i++){
			 T = 0 ;
			for(int j = 0 ; j < 3 ; j++)
				T += sc.nextInt();
			if(T >= 2 )
				T_counter ++ ;}
			System.out.println(T_counter);
		
	}
}
