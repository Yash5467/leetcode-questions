class MissingNumber {

  public static void main(String args[]) {
    int[] arr = { 3, 0, 1 };

    System.out.println(missingNumber(arr));
  }

  public static int missingNumber(int[] nums) {
    int i = 0;
    while (i < nums.length) {
      int correctIndex = nums[i];
      if (nums[i] >= nums.length) {
        i++;
        correctIndex = 0;
      } else if (nums[i] != i) {
        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
      } else {
        i++;
      }
    }

    for (i = 0; i < nums.length; i++) {
      if (nums[i] != i) return i;
    }

    return nums.length;
  }
}
