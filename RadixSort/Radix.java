public class Radix{
  public static int nth(int n, int col){
    return Math.abs((n / (int) Math.pow(10, col)) % 10);
  }

  public static int nthneg(int n, int col){
    return (n / (int) Math.pow(10, col)) % 10;
  }

  public static int length(int n){
    if (n == 0) return 0;
    return (int) Math.log10(Math.abs(n)) + 1;
  }

  public static void merge(SortableLinkedList original, SortableLinkedList[] buckets){
    for (int i = 0; i < buckets.length; i ++){
      original.extend(buckets[i]);
    }
  }

  public static void radixSortSimple(SortableLinkedList data){
    SortableLinkedList[] buckets = new SortableLinkedList[10];
    for(int i = 0; i < 10; i ++){
      buckets[i] = new SortableLinkedList();
    }
    int max = data.size();
    int col = 0;
    boolean go = true;
    while (go == true){
      while (data.size() > 0){
        int num = data.remove(0);
        buckets[nth(num,col)].add(num);
      }
      if (buckets[0].size() == max) go = false;
      merge(data, buckets);
      col ++;
    }
  }

  public static void radixSort(SortableLinkedList data){
    SortableLinkedList[] buckets = new SortableLinkedList[19];
    for(int i = 0; i < 19; i ++){
      buckets[i] = new SortableLinkedList();
    }
    int max = data.size();
    int col = 0;
    boolean go = true;
    while (go == true){
      while (data.size() > 0){
        int num = data.remove(0);
        buckets[nthneg(num,col)+9].add(num);
      }
      if (buckets[9].size() == max) go = false;
      merge(data, buckets);
      col ++;
    }
  }
}
