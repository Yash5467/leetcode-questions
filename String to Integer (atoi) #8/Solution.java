class Solution {

  public static void main(String[] args) {
    String s = "4193 with words";
    System.out.println(myAtoi(s));
  }

  public static int myAtoi(String s) {
    boolean isNegative = false;
    long result = 0;
    s = s.trim();
    if (s.length() == 0) return 0;

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);

      if (i == 0 && ch == '-') {
        isNegative = true;
        continue;
      } else if (i == 0 && ch == '+') {
        isNegative = false;
        continue;
      }
      if (ch >= '0' && ch <= '9') {
        int digit = ch - '0';
        result = result * 10 + digit;
        if (isNegative) {
          long check = -result;
          if (check < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        } else {
          if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        }
      } else break;
    }

    if (isNegative) {
      result = -result;
    }

    return (int) result;
  }
}
