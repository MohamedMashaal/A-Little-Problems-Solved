import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;

public class TopKFrequentElements {
	public static void main(String[] args) {
		Map<Integer, Integer> x = new HashMap<Integer, Integer>();
		int z [] = {1,1,1,2,2,3};
		for(int i = 0 ; i <z.length ; i ++) {
			if(!x.containsKey(z[i])){
				x.put(z[i],1);
			}
			else {
				x.replace(z[i], x.get(z[i])+1);
			}}
		
		LinkedList<Integer> Result = new LinkedList<Integer>();
		int k = 2 ;
		int max = -100 ;
		int maxKey = 0 ;
		for(int i = 0 ; i < k ; i ++) {
			for(int j = 0 ; j < z.length ; j ++) {
				if(x.containsKey(z[j])) {
				if(x.get(z[j]) > max) {
					max = x.get(z[j]);
					maxKey = z[j];
				}
			}}
		max= -100 ;
		Result.add(maxKey);
		x.remove(maxKey);
		}
		for(int i = 0 ; i < Result.size() ; i ++)
			System.out.println(Result.get(i));
	}
}
