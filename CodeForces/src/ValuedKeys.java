import java.util.Scanner;

public class ValuedKeys {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String Test1 = sc.next();
		String Test2 = sc.next();
		StringBuffer x = new StringBuffer();
		sc.close();
		int flag = 0 ;
		for(int i = 0 ; i < Test1.length() ; i ++){
			if(Test2.charAt(i) > Test1.charAt(i)){
				flag = 1 ;
				break ;}
			if(Test2.charAt(i) == Test1.charAt(i))
				x.append('z');
			if(Test2.charAt(i) < Test1.charAt(i))
				x.append(Test2.charAt(i));
		}
		if(flag == 1 ){
			System.out.println(-1);}
		else{
			System.out.println(x.toString());}
}}
