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
    int sum = sum(matrix[0]);
    for (int i = 1; i < matrix.length; i ++){
      if (sum(matrix[i]) != sum) return false;
    }
    return true;
  }
  public static boolean isColMagic(int[][] matrix){
    int[] s = sumCols(matrix);
    int sum = s[0];
    for (int i = 1; i < s.length; i ++){
      if (s[1] != sum) return false;
    }
    return true;
  }
  public static boolean isLocationMagic(int[][] matrix, int row, int col){
    if (sumRows(matrix)[row] == sumCols(matrix)[col]) return true;
    else return false;
  }
}
