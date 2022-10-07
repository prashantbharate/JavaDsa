//int[] nums={1,2,4,5,6}

class Solution {
    public int missingNumber(int[] nums) {
        int k=nums.length;
        int sum=(k*(k+1))/2;
        for(int i=0;i<nums.length; i++)
        {
            sum=sum-nums[i];
        }
        return sum;
    }
}