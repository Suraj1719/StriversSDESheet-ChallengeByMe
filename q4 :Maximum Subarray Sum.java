Most popular algorithm : Kadane's Algorithm


import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		
		long ans=0;
		long cur_sum=0;
		for(int i=0;i<n;i++){
			cur_sum+=arr[i];
			ans=Math.max(ans,cur_sum);
			if(cur_sum<0)cur_sum=0;
		}
	return ans;
	}

}
