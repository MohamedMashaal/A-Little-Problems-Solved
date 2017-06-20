import java.util.Scanner;

public class VoltageKeepsake {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int devices =sc.nextInt();
		int Pre = sc.nextInt() ;
		int [][] x = new int [devices][2] ;
		for(int i = 0 ; i < x.length ; i ++){
			x[i][0] = sc.nextInt();
			x[i][1] = sc.nextInt();}
		sc.close();
	}
}
