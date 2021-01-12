public class Radix{
  public static int nth(int n, int col){
    String str = Integer.toString(Math.abs(n));
    int index = str.length()-col-1;
    return Integer.parseInt(str.substring(index, index+1));
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

}
