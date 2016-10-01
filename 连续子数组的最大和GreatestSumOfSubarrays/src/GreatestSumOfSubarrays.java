import java.util.Scanner;

/**
 * 文件名称：《剑指Offer：名企面试官精讲典型编程题(纪念版)》面试题31：连续子数组的最大和
 * 时间：2016-8-12 21:24
 * 说明：1、题目：输入一个整型数组，数组里有正数也有负数。数组中一个或连续多个整数
 * 组成一个子数组。求所有子数组的和的最大值。
 * */

public class GreatestSumOfSubarrays {
	
	public static int FindGreatestSumOfSubarrays(int[]array) {
		if((array==null)||(array.length<=0)){
			return 0;
		}
		int length=array.length;
		int i=0;
		int []dp=new int[length];
		dp[0]=array[0];
		int max=-32768;
		for(i=1;i<length;i++){

			dp[i]=dp[i-1]<=0?array[i]:dp[i-1]+array[i];
			if(dp[i]>max){
				max=dp[i];
			}
		}
		return max;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int N=in.nextInt();
			int[]array=new int[N];
			for(int i=0;i<N;i++){
				array[i]=in.nextInt();
			}
			System.out.println(FindGreatestSumOfSubarrays(array));
		}
	}

}
