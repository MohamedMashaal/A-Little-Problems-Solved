import java.util.Scanner;

public class LeastCommonMultiple {
	public static void main(String [] args ){
		long NumofTests;
		Scanner sc = new Scanner(System.in);
		NumofTests = sc.nextLong();
		int [][] xtests = new int  [(int)NumofTests][4];
		for(int i = 0 ; i < xtests.length ; i ++){
			xtests[i][0] = sc.nextInt();
			xtests[i][1] = sc.nextInt();
			xtests[i][2] = sc.nextInt();
			xtests[i][3] = sc.nextInt();
		}
		sc.close();
		for(int i = 0 ; i < xtests.length ; i ++){
			float temp = ((float)xtests[i][0]/xtests[i][1])/(float)((float)xtests[i][2]/xtests[i][3]);
		}
	}
}
