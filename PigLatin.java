import java.util.*;
public class PigLatin{
  public static void main(String[]args){
    System.out.println(pigLatin("stop snooping >:("));
  }

  public static String pigLatinSimple(String s){
    s = s.toLowerCase();
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    for (char i: vowels){
      if (s.charAt(0) == i){
        return s + "hay";
      }
    }
    return s.substring(1) + s.substring(0, 1) + "ay";
  }

  public static String pigLatin(String s){
    s = s.toLowerCase();
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    String[] consonants = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr",
    "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl",
    "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    for (char i: vowels){
      if (s.charAt(0) == i){
        return s + "hay";
      }
    }
    for (String i: consonants){
      if (s.length() > 1 && s.substring(0, 2).equals(i)){
        return s.substring(2) + s.substring(0, 2) + "ay";
      }
    }
    return s.substring(1) + s.substring(0, 1) + "ay";
  }
}
