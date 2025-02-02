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
      if (right == data.length - 1) break;
    }
  }

  public static void selectionSort(int[] data){
    int temp;
    int mindex;
    for (int i = 0; i < data.length - 1; i ++){
      mindex = i;
      for (int j = i + 1; j < data.length; j ++){
        if (data[j] < data[mindex]) mindex = j;
      }
      temp = data[i];
      data[i] = data[mindex];
      data[mindex] = temp;
    }
  }

  public static void insertionSort(int[] data){
    int temp;
    for (int i = 1; i < data.length; i ++){
      temp = data[i];
      for (int j = i-1; j >= 0; j --){
        if (temp < data[j]){
          data[j+1] = data[j];
          if (j == 0) data[j] = temp;
        }else{
          data[j+1] = temp;
          break;
        }
      }
    }
  }
}
