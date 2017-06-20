import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P11779 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> x = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1.intValue() > o2.intValue())
					return -1;
				else if(o1.intValue() < o2.intValue())
					return 1 ;
				return 0 ;
			}
		});
		int t = sc.nextInt();
		for(int i = 1 ; i <= t ; i ++) {
			int j = sc.nextInt();
			for(int k = 0 ; k < j ; k++) {
				x.add(sc.nextInt());
			}
			System.out.println("Case "+ i +": " + x.poll());
			x.clear();
		}
		}
	}
