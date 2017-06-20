
public class RotateArray {
	public static void rotate(int[] nums , int k ) {
		int length = nums.length;
		k %= length;
		int temp ;
		for(int i = 0 ; i < length / 2 ; i ++) {
			temp = nums[i] ;
			nums[i] = nums[length-i-1];
			nums[length-i-1] = temp ;
		}
		for(int i = 0 ; i < k /2 ; i ++) {
			temp = nums[i] ;
			nums[i] = nums[k-1-i];
			nums[k-1-i] = temp;
		}
		for(int i = 0 ; i <((length- k)/2) ; i ++) {
			temp = nums[k+i];
			nums[k+i] = nums[length-i-1];
			nums[length-i-1] = temp;
		}
	}	
	public static void main(String [] args) {
		int x [] = {1,2,3,4,5,6,7};
		rotate(x,3);
		for(int j = 0 ; j < x.length ; j ++)
			System.out.println(x[j]);
	}
}
