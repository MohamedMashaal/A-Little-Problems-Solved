import java.util.Scanner;

public class Isyourhorseshoeontheotherhoof {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		int Shoes [] = new int[4];
		int ShoesChecked [] = {0,0,0,0};
		for(int i = 0 ; i < 4 ; i ++)
			Shoes[i]=sc.nextInt();
		sc.close();
		int Owned = 0 ;
		for(int i = 0 ; i < 4 ; i ++){
				if (ShoesChecked[i] == 1)
					continue ;
				ShoesChecked[i] = 1 ;
			for(int j = i ; j < 4 ; j ++){
					if(Shoes[i]==Shoes[j])
						ShoesChecked[j] = 1 ;}
			Owned ++ ;
		}	
		System.out.println(4-Owned);
	}
}
