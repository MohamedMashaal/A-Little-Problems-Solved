import java.util.Scanner;

public class VeryImportantPersons {
	public static void main(String [] args ){
		int NofTestCases ;
		Scanner sc = new Scanner(System.in);
		NofTestCases = sc.nextInt();
		int [][] testcases = new int [NofTestCases][2];
		int [][] Tempo ;
		for (int i = 0 ; i < NofTestCases ; i ++){
			testcases[i][0] = sc.nextInt();
			testcases[i][1] = sc.nextInt();}
		sc.close();
		for(int i = 0 ; i < testcases.length ; i ++){
			boolean flag = true ;
			Tempo = new int [testcases[i][0]][testcases[i][1]];
			int length = 0 ;
			int numbers = testcases[i][0] * testcases[i][1];
			//int TempoCounter = 0 ;
			while(flag){
				for(int j = 1 ; j <= testcases[i][0]; j++){
					for(int k = 1 ; k <= testcases[i][1];k++){
						if((j-1)+(k-1)== length){
							Tempo[j-1][k-1] = numbers ;
				//			TempoCounter ++ ;
							numbers -- ;}
						if((j-1)+(k-1) > length){
							break ;
						}
						if(j == testcases[i][0] && k == testcases[i][1] ){
							flag = false ;
						}
					
					
					}}
				length ++ ;
			}
			// int counter = 0 ;
			for(int j = 0 ; j < testcases[i][0]; j++){
				for(int k = 0 ; k < testcases[i][1];k++){
					System.out.print(Tempo[j][k]+ " ");}
				System.out.println();
				}
				}
				
			}
			
		
	}
