import java.util.Scanner;

public class Coins {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		String Temp ;
		int [] x = new int [3] ;
		int t = 0 ;
		for (int i = 0 ; i < 3 ; i ++)
			x[i] = 0 ;
		char temp = 0 ;
		for (int i = 0 ; i < 3 ; i ++){
			Temp = sc.next();
			if(Temp.charAt(1) == '>'){
				temp = Temp.charAt(0);}
			else{
				temp = Temp.charAt(2);}
			if(temp == 'A')
				x[0] ++;
			if(temp == 'B')
				x[1] ++ ;
			if(temp == 'C')
				x[2] ++ ;
		}
		if(x[0] == x[1]&& x[1] == x[2])
			System.out.println("Impossible");
		else
			for(int j = 0 ; j < 3 ; j ++){
				for(int i = 0 ; i < 3 ; i ++){
					if(x[i] == t){
						if(i == 0)
							System.out.print('A');
						if(i == 1)
							System.out.print('B');
						if(i == 2)
							System.out.print('C');}}
				t ++ ;}
	}
}
