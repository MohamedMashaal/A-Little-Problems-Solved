import java.util.Scanner;

public class JeffandPeriods {
	public static void main(String [] args ){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int [] seq = new int [x];
		boolean [] visited = new boolean [x];
		for(int i = 0 ; i < x ; i ++)
			visited[i] = false ;
		int currentindex = 0 ;
		for(int i = 0 ; i < x ; i ++)
			for(int j = 0 ; j < x ; j++)
				if(visited[i] == true)
					continue ;
	}
}
