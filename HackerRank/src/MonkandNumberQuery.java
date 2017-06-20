import java.util.Hashtable;
import java.util.Scanner;

public class MonkandNumberQuery {
	
	public class Node {
		Node next ;
		Node prev ;
		int data ;
		public Node(int data){
			this.data = data ;
		}
		
	}
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		Hashtable<Node, Integer> x = new Hashtable<Node,Integer>();
		
	}
}
