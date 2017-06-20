import java.util.Scanner;

public class Flag {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		int n , m ;
		n = sc.nextInt() ;
		m = sc.nextInt();
		String Tempo ;
		char temp = 0 , temp2 = 0;
		boolean condition = true ;
		outer:
		for(int i = 0 ; i < n ; i ++){
			Tempo = sc.next() ;
			for(int j = 0 ; j < m ; j++){
				if(j == 0){
					if(i == 0 && j == 0){
						temp = Tempo.charAt(j);
						continue ;}
					else{
						if(temp == Tempo.charAt(j)){
							condition = false ;
							break outer ;}
						temp = Tempo.charAt(j) ;
						}}
				if(temp != Tempo.charAt(j)){
					condition = false ;
					break outer ;
					}
			}}
		if(condition == true)
		System.out.println("YES");
		else
		System.out.println("NO");
	}
}
