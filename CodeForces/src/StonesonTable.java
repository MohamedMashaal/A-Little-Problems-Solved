import java.util.Scanner;

public class StonesonTable {
	public static void main(String [] args){
		int Number , Counter = 0 ;
		Scanner sc = new Scanner(System.in);
		Number = sc.nextInt();
		String Colors = sc.next();
		for(int i = 0 ; i < Colors.length() - 1 ; i ++)
			if(Colors.charAt(i) == Colors.charAt(i+1))
				Counter ++ ;
		System.out.println(Counter);
	}
}