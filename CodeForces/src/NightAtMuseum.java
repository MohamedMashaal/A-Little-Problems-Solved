import java.util.Scanner;

public class NightAtMuseum {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		String Word = sc.nextLine();
		sc.close();
		long MoveCounter = 0 ;
		if(Math.abs(Word.charAt(0) - 'a') > 13 )
			MoveCounter += 26 - (Math.abs(Word.charAt(0)-'a'));
		else
			MoveCounter += Math.abs(Word.charAt(0) -'a');
		for(int i = 0 ; i < Word.length()-1 ; i ++){
			if(Math.abs(Word.charAt(i+1) - Word.charAt(i)) > 13 )
				MoveCounter += 26 - (Math.abs(Word.charAt(i+1)-Word.charAt(i)));
			else
				MoveCounter += Math.abs(Word.charAt(i+1) -Word.charAt(i));}
		
		System.out.println(MoveCounter);
	}
}
