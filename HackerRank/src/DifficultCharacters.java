import java.util.Hashtable;
import java.util.Scanner;

public class DifficultCharacters {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String temp ;
		Hashtable<Character, Integer> x ;
		char tempo ;
		int tem ;
		for(int i = 0 ; i < t ; i ++) {
			temp = sc.next();
			x = new Hashtable<Character,Integer>();
			for(int j = 0 ; j < temp.length() ; j ++) {
				tempo = temp.charAt(j);
				if(!(x.containsKey(tempo)))
						x.put(tempo, 1);
				else {
					x.replace(tempo, x.get(tempo)+1);
				}
			}
			for(int j = 0 ; j < 28 ; j++)
				
		}
			
	}
}
