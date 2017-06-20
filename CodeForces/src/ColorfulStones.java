import java.util.Scanner;


public class ColorfulStones {
		public static void main (String [] args){
			Scanner sc = new Scanner(System.in);
			String Sequence = sc.next();
			String Moves = sc.next();
			sc.close();
			int Position = 0 ;
			for(int i = 0 ; i < Moves.length() ; i ++)
				if(Sequence.charAt(Position) == Moves.charAt(i))
					Position ++ ;
			
			System.out.println(Position+1);
			
		}
}
