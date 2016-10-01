import java.util.Scanner;

/**
 * �ļ����ƣ�����ָOffer���������Թپ������ͱ����(�����)��������31�����������������
 * ʱ�䣺2016-8-12 21:24
 * ˵����1����Ŀ������һ���������飬������������Ҳ�и�����������һ���������������
 * ���һ�������顣������������ĺ͵����ֵ��
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
