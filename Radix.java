public class Radix{
  public static int nth(int n, int col){
    return Math.abs((n / (int) Math.pow(10, col)) % 10);
  }

  public static int length(int n){
    if (n == 0) return 0;
    return (int) Math.log10(Math.abs(n)) + 1;
  }

  public static void merge(SortableLinkedList original, SortableLinkedList[] buckets){
    for (int i = 0; i < 10; i ++){
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
        System.out.println(nth(num, col));
        buckets[nth(num,col)].add(num);
      }
      if (buckets[0].size() == max) go = false;
      merge(data, buckets);
      System.out.println(data.toString());
      col ++;
    }
  }

  public static void main(String[] args) {
    SortableLinkedList storage = new SortableLinkedList();
    storage.add(0); storage.add(1); storage.add(2); storage.add(-3);
    storage.add(631589); storage.add(1346); storage.add(12845); storage.add(825);
    System.out.println(storage.toString());
    radixSortSimple(storage);
  }
}
