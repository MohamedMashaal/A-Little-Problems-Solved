import java.util.Scanner;

public class Vanya {
	public static void main(String [] args ){
		int number , height ;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		height = sc.nextInt();
		int TheNumbers [] = new int[number];
		for(int i = 0 ; i < number ; i++)
			TheNumbers[i]=sc.nextInt();
		int counter = 0 ;
		sc.close();
		for(int i = 0 ; i < TheNumbers.length ; i ++)
			if(TheNumbers[i] > height)
				counter += 2 ;
			else
				counter ++ ;
		System.out.println(counter);
		
	}
}
