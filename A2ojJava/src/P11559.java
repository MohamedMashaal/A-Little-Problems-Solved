import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class P11559 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> x = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1.intValue() > o2.intValue())
					return 1;
				else if(o1.intValue() < o2.intValue())
					return -1 ;
				return 0 ;
			}
		});
		while(sc.hasNext()) {
			int NumOfPeople , Budget , NumofH , NumofW , p , beds , min;
			NumOfPeople = sc.nextInt();
			Budget = sc.nextInt();
			NumofH = sc.nextInt();
			NumofW = sc.nextInt();
			for(int i = 0 ; i < NumofH ; i ++) {
				p = sc.nextInt();
				for(int j = 0 ; j < NumofW ; j++) {
					beds =sc.nextInt();
					if(beds >= NumOfPeople) {
						x.add(NumOfPeople * p);}
				}
			}
			if(x.isEmpty()) {
				System.out.println("stay home");}
			else {
				min = x.poll();
				if(min <= Budget) {
					System.out.println(min);}
				else {
					System.out.println("stay home");}
			}
			x.clear();
			}
		}
	}
