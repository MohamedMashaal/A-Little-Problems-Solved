import java.util.Scanner;

public class BuyAshovel {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		int Price = sc.nextInt();
		int TempPrice = Price ;
		int HisLittleChange = sc.nextInt();
		sc.close();
		int NumCount = 0 ;
		int flag = 0 ;
		while (flag != 1)
			if(((TempPrice - HisLittleChange)% 10 == 0 )||(TempPrice % 10 == 0)){
				NumCount ++ ;
				flag = 1 ;}
			else{
				NumCount ++ ;
				TempPrice += Price ;
			}
		System.out.println(NumCount);
	}
}
