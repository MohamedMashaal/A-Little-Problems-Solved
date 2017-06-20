import java.util.Scanner;

public class Codefor1 {
	public static void main(String [] args ){
		Scanner sc = new Scanner(System.in);
		long y = sc.nextLong();
		Long x = y ;
		StringBuffer z = new StringBuffer();
		z.append(x.toBinaryString(y));
		if(y%2 == 0)
			z.append(0);
		else
			z.append(1);
		z.append(x.toBinaryString(y));
		System.out.println(z);
	}
}
