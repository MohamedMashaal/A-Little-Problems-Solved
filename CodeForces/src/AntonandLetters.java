import java.util.Hashtable;
import java.util.Scanner;

public class AntonandLetters {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		Hashtable<Character, Integer> z = new Hashtable<>();
		for(int i = 0 ; i < x.length() ; i++)
			if(x.charAt(i) != ',' && x.charAt(i) != ' ' && x.charAt(i) != '{' && x.charAt(i) != '}') { 
				if(!z.contains(x.charAt(i))) {
					z.put(x.charAt(i), 1);}}
		System.out.println(z.size());
	}
}
