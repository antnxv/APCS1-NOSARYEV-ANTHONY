public class Demo{
  public static void main(String[] args) {
    if (args.length > 0){
      int n = Integer.parseInt(args[0]);
      System.out.println(printLoop(n));
    }
    else System.out.println(printLoop(5));
  }
  public static String printLoop(int n){
    String str = "";
    for (int i = 1; i <= n; i++){
      for (int j = n - i; j >= 0; j --){
        str += "" + i;
      }
      str += "\n";
    }
    return str;
  }
}
