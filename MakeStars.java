import java.util.*;
public class MakeStars{
  public static void main(String[]args){
      String stars = "";
      Scanner m = new Scanner( System.in );
      while (m.hasNextLine()){
        Scanner n = new Scanner(m.nextLine());
        while (n.hasNext()){
          String c = n.next();
          for (int i = 0; i < c.length(); i ++){
            stars += "*";
          }
          stars += " ";
        }
        if (stars.length() > 0 && stars.charAt(stars.length()-1) == ' '){
          stars = stars.substring(0, stars.length()-1);
        }
        stars += "\n";
      }
      if (stars.length() > 0 && stars.charAt(stars.length()-1) == '\n'){
        stars = stars.substring(0, stars.length()-1);
      }
      System.out.println(stars);
  }
}
