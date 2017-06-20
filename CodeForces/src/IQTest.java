import java.util.Scanner;

public class IQTest {
	public static void main(String [] args) {
		char [][] iq = new char [4][4];
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < 4 ; i ++) {
			String temp = sc.next();
			for(int j = 0 ; j < 4 ; j++) {
				iq[i][j] = temp.charAt(j);
			}}
		boolean flag = true ;
	outer:	for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 4 ; j++) {
				if(j<3) {
				if(iq[i][j] == iq [i][j+1]) {
					if(iq[i][j] == iq [i+1][j] ||iq[i][j+1] == iq [i+1][j+1]) {
						System.out.println("YES");
						flag = false ;
						break outer ;}}}
				if(iq[i][j] == iq [i+1][j]) {
					if(j<3) {
					if(iq[i][j] == iq [i][j+1] ||iq[i+1][j] == iq [i+1][j+1]) {
						System.out.println("YES");
						flag = false ;
						break outer ;}}
					if(j > 0) {
						if(iq[i+1][j] == iq [i+1][j-1]) {
							System.out.println("YES");
							flag = false ;
							break outer ;}}
				}
			}}
		if(flag) {
			System.out.println("NO");
		}
		
	}
}
