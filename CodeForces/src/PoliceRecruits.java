import java.util.Scanner;

public class PoliceRecruits {
	public static void main(String [] args){
		int Number , CounterPolice = 0 , CounterCrimes = 0  , Temp = 0;
		Scanner sc = new Scanner(System.in);
		Number = sc.nextInt();
		for(int i = 0 ; i < Number ; i ++){
			Temp = sc.nextInt();
			if(Temp > 0 )
				CounterPolice += Temp ;
			if(Temp < 0 ){
				if(CounterPolice == 0 )
					CounterCrimes ++ ;
				else
					CounterPolice += Temp ;}}
		System.out.println(CounterCrimes);
	}
}