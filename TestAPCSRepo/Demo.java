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
  public static String arrToString(int[] arr){
    String a = "{";
    for(int i = 0; i < arr.length; i++){
      if (i < arr.length - 1) a += arr[i] + ", ";
      else a += arr[i];
    }
    return a + "}";
  }
  public static String arrayDeepToString(int[][] arr){
    String a = "{";
    for(int i = 0; i < arr.length; i ++){
      if (i < arr.length - 1) a += arrToString(arr[i]) + ", ";
      else a += arrToString(arr[i]) + "}";
    }
    return a;
  }
  public static int[][] create2DArray(int rows, int cols, int maxValue){
    int[][] arr = new int[rows][cols];
    for (int i = 0; i < rows; i ++){
      for (int j = 0; j < cols; j ++){
        arr[i][j] = (int) ((1 + maxValue) * Math.random());
      }
    }
    return arr;
  }
  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
    int[][] arr = new int[rows][];
    for (int i = 0; i < rows; i ++){
      arr[i] = new int[(int) ((1 + cols) * Math.random())];
      for (int j = 0; j < arr[i].length; j ++){
        arr[i][j] = (int) ((1 + maxValue) * Math.random());
      }
    }
    return arr;
  }
}
