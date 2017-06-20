import java.util.Scanner;

public class ViciousKeyboard {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String Test = sc.next();
		sc.close();
		boolean [] x = new boolean [Test.length()] ;
		for(int i = 0 ; i < Test.length() ; i ++)
			x[i] = false ;
		int Counter = 0 ;
		boolean Possible1 = false ;
		for(int i = 0 ; i < Test.length()-1 ; i ++){
			if(Test.charAt(i) == 'V' && Test.charAt(i+1) =='K'){
				Counter ++ ;
				x[i]= true;
				x[i+1]= true;}
			}
		for(int i = 0 ; i < Test.length()-1 ; i ++){
			if(Test.charAt(i) == 'V' && Test.charAt(i+1) =='V' && x[i+1] != true){
				Possible1 = true;}
			if(Test.charAt(i) == 'K' && Test.charAt(i+1) =='K' && x[i] != true)	{
				Possible1 = true ;}}
		if(Possible1)
			Counter ++ ;
		System.out.println(Counter);
		}				
}