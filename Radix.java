public class Radix{
  public static int nth(int n, int col){
    return Math.abs((n / (int) Math.pow(10, col)) % 10);
  }

  public static int length(int n){
    return (int) Math.log10(Math.abs(n)) + 1;
  }

  public static void merge(MyLinkedList original, MyLinkedList[] buckets){
    for (MyLinkedList i: buckets){
      original.extend(i);
    }
  }

  public static void main(String[] args){
    int n = -295192;
    System.out.println(nth(n, 5));
    System.out.println(nth(n, 4));
    System.out.println(nth(n, 3));
    System.out.println(nth(n, 2));
    System.out.println(nth(n, 1));
    System.out.println(nth(n, 0));
    System.out.println("\n Length of "+n+": "+length(n));
  }
}
