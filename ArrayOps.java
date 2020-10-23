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
}
