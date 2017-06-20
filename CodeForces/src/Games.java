import java.util.Scanner;

public class Games {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		int NumberOfTeams = sc.nextInt();
		int TeamClothes[][]= new int[NumberOfTeams][2];
		for(int i = 0 ; i < NumberOfTeams ; i ++)
			for ( int j = 0 ; j < 2 ; j++)
				TeamClothes[i][j] = sc.nextInt();
		sc.close();
		int MatchCounter = 0 ;
		for (int i = 0 ; i < NumberOfTeams ; i ++)
			for(int j = 0 ; j < NumberOfTeams ; j++)
				if(TeamClothes[i][0] == TeamClothes[j][1])
					MatchCounter ++ ;
		System.out.println(MatchCounter);
	}
}
