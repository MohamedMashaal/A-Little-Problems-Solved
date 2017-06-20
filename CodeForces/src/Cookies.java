import java.util.Scanner;
public class Cookies {
	
			public static void main (String [] args){
				Scanner sc = new Scanner(System.in);
				int NumOfBags = sc.nextInt();
				int CookieBags [] = new int [NumOfBags];
				for(int i = 0 ; i < NumOfBags ; i ++)
					CookieBags[i] = sc.nextInt();
				sc.close();
				int SumOfCookies = 0 ;
				int Ways = 0 ;
				for(int i = 0 ; i < NumOfBags ; i ++){
					for(int j = 0 ; j < NumOfBags ; j ++){
						SumOfCookies += CookieBags[j];}
					if((SumOfCookies - CookieBags[i]) % 2 == 0)
						Ways ++ ;
						SumOfCookies = 0;}

				
				System.out.println(Ways);
				
			}
}
