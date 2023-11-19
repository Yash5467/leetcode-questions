import java.math.*;
import java.util.*;

class PlusOne {

  public static void main(String args[]) {
    int[] digits = { 1, 2, 3 };
    System.out.println(Arrays.toString(plusOne(digits)));
  }

  public static int[] plusOne(int[] digits) {
    String numString = "";
    for (int i : digits) {
      numString += i;
    }

    BigInteger n1 = new BigInteger(numString);
    BigInteger n2 = new BigInteger("1");
    BigInteger n = n1.add(n2);
    String resultString = n.toString();
    int[] arr = new int[resultString.length()];
    for (int i = 0; i < resultString.length(); i++) {
      arr[i] = Integer.parseInt("" + resultString.charAt(i));
    }

    return arr;
  }
}
