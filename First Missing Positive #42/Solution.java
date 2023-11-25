class Solution {

    public static void main(String[] args) {
        int [] nums={3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] nums) {
        int i=0;
        int n=nums.length;
        while(i<n)
        {
            int correctIndex=nums[i]-1;
            if( (correctIndex<n && correctIndex>-1) && nums[i]!=nums[correctIndex])
            {
                int temp=nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex]=temp;
            }
            else
            i++;
        }
    
    for(i=0;i<n;i++)
    {
        if(nums[i]!=(i+1))
        {
            return i+1;
        }
    }
   return n+1;
}}