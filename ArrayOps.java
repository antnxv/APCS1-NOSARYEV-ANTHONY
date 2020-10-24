public class ArrayOps {
  public static int sum(int[] arr){
    int s = 0;
    for (int i = 0; i < arr.length; i ++){
      s += arr[i];
    }
    return s;
  }
  public static int largest(int[] arr){
    int l = arr[0];
    for (int i = 0; i < arr.length; i ++){
      if (arr[i] > l) l = arr[i];
    }
    return l;
  }
  public static int[] sumRows(int[][] matrix){
    int[] k = new int[matrix.length];
    for (int i = 0; i < matrix.length; i ++){
      k[i] = sum(matrix[i]);
    }
    return k;
  }
  public static int[] largestInRows(int[][] matrix){
    int[] k = new int[matrix.length];
    for (int i = 0; i < matrix.length; i ++){
      k[i] = largest(matrix[i]);
    }
    return k;
  }
  public static int sum(int[][] arr){
    return sum(sumRows(arr));
  }
  public static int[] sumCols(int[][] matrix){
    int[] k = new int[matrix[0].length];
    for (int i = 0; i < matrix.length; i ++){
      for (int j = 0; j < matrix[i].length; j ++){
        k[j] += matrix[i][j];
      }
    }
    return k;
  }
  public static boolean isRowMagic(int[][] matrix){
    int s = sum(matrix[0]);
    for(int i = 1; i < matrix.length; i ++){
      if (sum(matrix[i]) != s) return false;
    }
    return true;
  }
}
