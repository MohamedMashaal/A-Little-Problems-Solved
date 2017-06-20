import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class MonkStone {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedList<Integer> x  = new LinkedList<Integer>();
		for(int i = 0 ; i < n ; i ++)
			x.add(sc.nextInt());
		int l = sc.nextInt();
		int k = sc.nextInt();
		Stack<Integer> z = new Stack<Integer>();
		String temp ;
		int Currentmonkworth = 0 ;
		boolean flag = false ;
		for(int i = 0 ; i < l ; i++) {
			temp = sc.next();
			if(temp.equals("Harry")) {
				Currentmonkworth += x.get(0).intValue();
				z.push(x.get(0));
				x.remove(0);
				}
			if(temp.equals("Remove")) {
				Currentmonkworth -= z.pop().intValue();}
			if(Currentmonkworth == k) {
				flag = true ;
				break;}
		}
		if(flag) {
			System.out.println(z.size());
		}
		else {
			System.out.println(-1);
		}
	}
}
