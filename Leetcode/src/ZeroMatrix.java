
public class ZeroMatrix {
	public void setZeroes(int[][] matrix) {
        int m = matrix.length ;
        int n = matrix[0].length ;
        boolean zeroUp [] = new boolean [m];
        boolean zeroLeft [] = new boolean [n];
        for(int z = 0 ; z < m ; z++)
                zeroUp[z] = false ;
        for(int z = 0 ; z < n ; z++)
                zeroLeft[z] = false ;
        for(int i = 0 ; i < m ; i ++)
            for(int j = 0 ; j < n ; j ++)
                if(matrix[i][j] == 0){
                    zeroUp[i] = true ;
                    zeroLeft[j] = true ;}
        for(int i = 0 ; i < m ; i ++)
            if(zeroUp[i])
                for(int j = 0 ; j < n ;j++)
                    matrix[i][j] = 0 ;
        for(int i = 0 ; i < n ; i ++)
            if(zeroLeft[i])
                for(int j = 0 ; j < m ;j++)
                    matrix[j][i] = 0 ;        
    }
}
