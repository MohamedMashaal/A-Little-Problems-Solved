import java.util.Scanner;
public class LoansomeCarBuyer {
	public static void main(String [] args) {
		int maxMonth , numK ;
		double monthly , loanTotal ;
		Scanner sc = new Scanner(System.in);
		double [][] theK ;
		double currentCar ;
		while(sc.hasNext()) {
			maxMonth = sc.nextInt();
			if(maxMonth < 0)
				break ;
			monthly = sc.nextDouble();
			loanTotal = sc.nextDouble();
			numK = sc.nextInt();
			theK = new double[numK][2];
			currentCar = loanTotal + monthly ;
			for(int i = 0 ; i < numK ; i ++) {
				theK[i][0] = sc.nextInt();
				theK[i][1] = sc.nextDouble();
			}
			int j = 0 ;
			int l = 0 ;
			for(l =  0; l < maxMonth ; l ++) {
				if(j+1 < numK) {
				if(theK[j+1][0] == l ) {
					j++ ;}}
				currentCar -= (currentCar*theK[j][1]);
				if(currentCar > (loanTotal-(loanTotal/maxMonth *l))) {
					break ;}
			}
			if(l == 1)
				System.out.println(l + " month");
			else 
				System.out.println(l + " months");
		}
		
	}
}
