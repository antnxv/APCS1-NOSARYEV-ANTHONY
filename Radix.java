public class Radix{
  public static int nth(int n, int col){
    return Math.abs((n / (int) Math.pow(10, col)) % 10);
  }

  public static int length(int n){
    String str = Integer.toString(Math.abs(n));
    return str.length();
  }

  public static void merge(MyLinkedList original, MyLinkedList[] buckets){
    for (MyLinkedList i: buckets){
      original.extend(i);
    }
  }

  public static void main(String[] args){
    System.out.println(nth(-295192, 5));
    System.out.println(nth(-295192, 4));
    System.out.println(nth(-295192, 3));
    System.out.println(nth(-295192, 2));
    System.out.println(nth(-295192, 1));
    System.out.println(nth(-295192, 0));
  }
}
