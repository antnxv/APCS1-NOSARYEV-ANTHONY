import java.util.*;
public class PigLatin{
  public static void main( String[]args ){
      String oink = "";
      Scanner m = new Scanner( System.in );
      while (m.hasNextLine()){
        Scanner n = new Scanner(m.nextLine());
        while (n.hasNext()){
          String c = n.next();
          oink += c + " ";
        }
        if (oink.charAt(oink.length()-1) == ' '){
          oink = oink.substring(0, oink.length()-1);
        }
        oink += "\n";
      }
      if (oink.charAt(oink.length()-1) == '\n'){
        oink = oink.substring(0, oink.length()-1);
      }
      System.out.println(oink);
  }
}
