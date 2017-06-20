import java.util.Scanner;

public class Capitalization {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder Word = new StringBuilder(sc.nextLine());
		sc.close();
		if (Word.charAt(0) >='a')
			Word.setCharAt(0,(char) ((int)Word.charAt(0)-('a'-'A')));
		
		System.out.println(Word);
		
	}
}
