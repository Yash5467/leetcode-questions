import java.util.*;

class Solution {

  public static void main(String[] args) {
 String [] words={"cat","bt","hat","tree"};
 String chars="atach";
 System.out.println(countCharacters(words, chars));

  }

  public static int countCharacters(String[] words, String chars) {
    int counter = 0;
    int result = 0;
    for (int i = 0; i < words.length; i++) {
      ArrayList<Character> arr = new ArrayList<>();
      for (int j = 0; j < chars.length(); j++) {
        arr.add(chars.charAt(j));
      }
      counter = 0;
      for (int k = 0; k < words[i].length(); k++) {
        if (arr.contains(words[i].charAt(k))) {
          arr.remove(Character.valueOf(words[i].charAt(k)));
          counter++;
        }
      }

      if (counter == words[i].length()) {
        result += counter;
      }
    }

    return result;
  }
}
