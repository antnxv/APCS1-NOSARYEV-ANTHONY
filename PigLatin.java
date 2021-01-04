import java.util.*;
public class PigLatin{
  public static void main(String[]args){
    System.out.println(pigLatinSimple("insert testing word"));
  }

  public static String pigLatinSimple(String s){
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    for (char i: vowels){
      if (s.charAt(0) == i){
        return s + "hay";
      }
    }
    return s.substring(1) + s.substring(0, 1) + "ay";
  }
}
