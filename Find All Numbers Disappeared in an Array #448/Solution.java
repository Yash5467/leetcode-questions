import java.util.*;

public class Solution {

  public static void main(String[] args) {

    int []arr={4,3,2,7,8,2,3,1};
    System.out.println(Arrays.toString(findDisappearedNumbers(arr).toArray()));
  }

  public static List<Integer> findDisappearedNumbers(int[] nums) {
    ArrayList<Integer> arr = new ArrayList<>();
    int i = 0;
    while (i < nums.length) {
      int correctIndex = nums[i] - 1;

      if (nums[i] != nums[correctIndex]) {
        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
      } else {
        i++;
      }
    }
    for (int j = 0; j < nums.length; j++) {
      if (nums[j] != (j + 1)) arr.add(j + 1);
    }

    return arr;
  }
}
