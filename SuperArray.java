public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public SuperArray(int initialCapacity){
    data = new String[initialCapacity];
    size = 0;
  }

  public int size(){
    return size;
  }

  public boolean add(String element){
    if (size == data.length) resize();
    data[size] = element;
    size ++;
    return data[size - 1].equals(element);
  }

  public String get(int index){
    return data[index];
  }

  public String set(int index, String element){
    String old = data[index];
    data[index] = element;
    return old;
  }

  private void resize(){
    String[] newData = new String[1 + data.length * 2];
    for (int i = 0; i < data.length; i ++){
      newData[i] = data[i];
    }
    data = newData;
  }

  public boolean isEmpty(){
    return size == 0;
  }

  public void clear(){
    data = new String[data.length];
    size = 0;
  }

  public String toString(){
    String str = "[";
    for (int i = 0; i < size; i ++){
      str += data[i] + ", ";
    }
    if (str.length() == 1) return "[]";
    else return str.substring(0, str.length() - 2) + "]";
  }

  public boolean contains(String s){
    for (int i = 0; i < size; i ++){
      if (data[i] == s) return true;
    }
    return false;
  }
}
