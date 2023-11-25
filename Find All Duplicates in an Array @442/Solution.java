import java.util.*;

class Solution {

    public static void main(String[] args) {
          int [] nums={1,1,2};
          System.out.println(Arrays.toString(findDuplicates(nums).toArray()));
    }
    public static List<Integer> findDuplicates(int[] nums) {
         List<Integer> list=new ArrayList<>();
         int i=0;
         int n=nums.length;
         while(i<n)
         { int correctIndex=nums[i]-1;
             
             if(nums[i]!=nums[correctIndex])
             {
                 int temp=nums[i];
                 nums[i]=nums[correctIndex];
                 nums[correctIndex]=temp;
                 
             }
             else
             {
                 i++;
             }


         }

         for( i=0;i<n;i++)
         {
             if(nums[i]!=(i+1))
             list.add(nums[i]);
         }

         return list;
    }
}