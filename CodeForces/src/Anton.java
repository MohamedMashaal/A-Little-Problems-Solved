import java.util.Scanner;

public class Anton {
	public static void main(String [] args ){
		long number ;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		String Games = sc.next();
		sc.close();
		long A_counter = 0 , D_counter = 0 ;
		for(int i = 0 ; i < Games.length() ; i++){
			if(Games.charAt(i) == 'A')
				A_counter ++ ;
			if(Games.charAt(i) == 'D')
				D_counter ++ ;}
		if(A_counter > D_counter)
			System.out.println("Anton");
		else if (A_counter < D_counter)
			System.out.println("Danik");
		else
			System.out.println("Friendship");
		
	}
}
