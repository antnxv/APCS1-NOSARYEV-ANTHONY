public class Radix{
  public static int nth(int n, int col){
    return Math.abs((n / (int) Math.pow(10, col)) % 10);
  }

  public static int length(int n){
    if (n == 0) return 0;
    return (int) Math.log10(Math.abs(n)) + 1;
  }

  public static void merge(MyLinkedList original, MyLinkedList[] buckets){
    for (MyLinkedList i: buckets){
      original.extend(i);
    }
  }
}
