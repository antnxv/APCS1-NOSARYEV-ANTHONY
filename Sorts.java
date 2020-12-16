public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    int temp;
    int right;
    for (int i = 0; i < data.length; i ++){
      right = 0;
      for (int j = 0; j < data.length-1; j ++){
        if (data[j] > data[j+1]){
          temp = data[j+1];
          data[j+1] = data[j];
          data[j] = temp;
        }else right ++;
      }
      if (right == data.length) break;
    }
  }
}
