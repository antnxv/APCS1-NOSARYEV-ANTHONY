import java.util.*;
public class PigLatin{
  public static void main(String[]args){
      String oink = "";
      Scanner m = new Scanner( System.in );
      while (m.hasNextLine()){
        Scanner n = new Scanner(m.nextLine());
        while (n.hasNext()){
          oink += pigLatinBest(n.next());
          oink += " ";
        }
        if (oink.length() > 0 && oink.charAt(oink.length()-1) == ' '){
          oink = oink.substring(0, oink.length()-1);
        }
        oink += "\n";
      }
      if (oink.length() > 0 && oink.charAt(oink.length()-1) == '\n'){
        oink = oink.substring(0, oink.length()-1);
      }
      System.out.println(oink);
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
    String[] consonants = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr",
    "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl",
    "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    for (String i: consonants){
      if (s.length() > 1 && s.substring(0, 2).equals(i)){
        return s.substring(2) + s.substring(0, 2) + "ay";
      }
    }
    return pigLatinSimple(s);
  }

  public static String pigLatinBest(String s){
    s = s.toLowerCase();
    String d = "";
    if (s.substring(0, 1).toUpperCase().equals(s.substring(0, 1))) return s;
    if (s.substring(s.length()-1).toUpperCase().equals(s.substring(s.length()-1))){
      d = s.substring(s.length()-1);
      s = s.substring(0, s.length()-1);
    }
    return pigLatin(s) + d;
  }
}
