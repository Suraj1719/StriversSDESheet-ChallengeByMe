method - 1:

simply sort  : time -O(nlogn)   space-O(1)
  
  
method - 2 :time O(n)  space -O(n)
    
      class Solution {
    public void sortColors(int[] nums) {
        int ans[]=new int[nums.length];
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                ans[index++]=0;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                ans[index++]=1;
            }
        }
        for(int i=index;i<nums.length;i++){
            ans[i]=2;
        }
        for(int i=0;i<ans.length;i++){
            nums[i]=ans[i];
        }
    }
}

method - 3(most optimised)  time :O(n)  space :O(1)   three pointer

import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] nums)
    {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        int temp;
        while(mid<=high){
            switch(nums[mid]){
                case 0:
                    {
                    temp=nums[mid];
                    nums[mid]=nums[low];
                    nums[low]=temp;
                    low++;mid++;
                    break;
                    }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp=nums[mid];
                    nums[mid]=nums[high];
                    nums[high]=temp;
                    high--;
                    break;
                }
            }
            
        }
    }
}
