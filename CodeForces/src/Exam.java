import java.util.Scanner;

public class Exam {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] seq = new int [n] ;
		int seqCounter = 0 ;
		boolean Flagtriggered = false ;
		int movingCounter = 1 ;
		seq[0] = n;
		if(n == 4) {
			seq[seqCounter] = 3 ;
			movingCounter = 0 ;
		}
		for(int i = 1 ; i < n ; i ++) {
			if(i%2 == 1) {
			if(Math.abs(seq[seqCounter] - (1+movingCounter)) > 1 || Math.abs(seq[seqCounter] - (1+movingCounter)) < 0) {
				seqCounter ++ ;
				seq[seqCounter] = 1+movingCounter;
			}
			else {
				if(Math.abs(seq[seqCounter] - (1)) > 1 || Math.abs(seq[seqCounter] - (1)) < 0) {
					seqCounter ++ ;
					seq[seqCounter] = 1 ;
					Flagtriggered = true ;
				}
				if(Flagtriggered) {
					if(Math.abs(seq[seqCounter] - (1+movingCounter)) > 1 || Math.abs(seq[seqCounter] - (1+movingCounter)) < 0) {
						seqCounter ++;
						seq[seqCounter] =  1+movingCounter ;
						break ;
					}}
						
			}
			
			}
			if(i%2 == 0) {
				
				if(Math.abs(seq[seqCounter] - (n-movingCounter)) > 1 || Math.abs(seq[seqCounter] - (n-movingCounter)) < 0) {
					seqCounter ++ ;
					seq[seqCounter] = n-movingCounter;
				}
				movingCounter ++ ;
		}}
		System.out.println(seqCounter+1);
		for(int i = 0 ; i < seqCounter+1 ; i++)
			System.out.print(seq[i]+" ");
	}
}
