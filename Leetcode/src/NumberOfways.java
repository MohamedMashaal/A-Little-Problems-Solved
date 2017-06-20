import java.math.BigInteger;

public class NumberOfways {
	public int uniquePaths(int m, int n) {
        m = m - 1 ;
        n = n -1 ;
        BigInteger top = BigInteger.valueOf(1);
        for(int i = 1 ; i <= m+n ; i ++)
            top = top.multiply(BigInteger.valueOf(i));
        BigInteger down1 = BigInteger.valueOf(1);
        for(int i = 1 ; i <= m ; i ++)
           down1 =  down1.multiply(BigInteger.valueOf(i));
        BigInteger down2 = BigInteger.valueOf(1);
        for(int i = 1 ; i <= n ; i ++)
             down2 = down2.multiply(BigInteger.valueOf(i));
        top = top.divide(down1.multiply(down2));
        return top.intValue();
    }
}
