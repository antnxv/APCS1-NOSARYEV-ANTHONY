public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public SuperArray(int initialCapacity){
    if (initialCapacity >= 0) data = new String[initialCapacity];
    else throw new IllegalArgumentException("Initial Capacity ("
    +initialCapacity+") Cannot be Negative");
    size = 0;
  }

  public boolean equals(SuperArray other){
    if (this.size == other.size){
      for (int i = 0; i < size; i ++){
        if (data[i] != other.data[i]) return false;
      }
      return true;
    }
    else return false;
  }

  public int size(){
    return size;
  }

  private void resize(){
    String[] newData = new String[1 + data.length * 2];
    for (int i = 0; i < data.length; i ++){
      newData[i] = data[i];
    }
    data = newData;
  }

  public boolean add(String element){
    if (size == data.length) resize();
    data[size] = element;
    size ++;
    return data[size - 1].equals(element);
  }

  public void add(int index, String element){
    if (index < 0) throw new IndexOutOfBoundsException("Index ("+index+") cannot be < 0");
    else if (index > size) throw new IndexOutOfBoundsException("Index ("
    +index+") cannot be > size ("+size+")");
    if (size == data.length) resize();
    size ++;
    for (int i = size - 1; i > index; i --){
      data[i] = data[i - 1];
    }
    data[index] = element;
  }

  public String remove(int index){
    if (index < 0) throw new IndexOutOfBoundsException("Index ("+index+") cannot be < 0");
    else if (index >= size) throw new IndexOutOfBoundsException("Index ("
    +index+") cannot be >= size ("+size+")");
    String c = data[index];
    for (int i = index; i < size - 1; i ++){
      data[i] = data[i + 1];
    }
    size --;
    data[size] = null;
    return c;
  }

  public void clear(){
    data = new String[data.length];
    size = 0;
  }

  public boolean isEmpty(){
    return size == 0;
  }

  public boolean contains(String s){
    for (int i = 0; i < size; i ++){
      if (data[i].equals(s)) return true;
    }
    return false;
  }

  public int indexOf(String s){
    for (int i = 0; i < size; i ++){
      if (data[i].equals(s)) return i;
    }
    return -1;
  }

  public int lastIndexOf(String s){
    int lindex = -1;
    for (int i = 0; i < size; i ++){
      if (data[i].equals(s)) lindex = i;
    }
    return lindex;
  }

  public String get(int index){
    if (index < 0) throw new IndexOutOfBoundsException("Index ("+index+") cannot be < 0");
    else if (index >= size) throw new IndexOutOfBoundsException("Index ("
    +index+") cannot be >= size ("+size+")");
    else return data[index];
  }

  public String set(int index, String element){
    if (index < 0) throw new IndexOutOfBoundsException("Index ("+index+") cannot be < 0");
    else if (index >= size) throw new IndexOutOfBoundsException("Index ("
    +index+") cannot be >= size ("+size+")");
    String old = data[index];
    data[index] = element;
    return old;
  }

  public String toString(){
    String str = "[";
    for (int i = 0; i < size; i ++){
      str += data[i] + ", ";
    }
    if (str.length() == 1) return "[]";
    else return str.substring(0, str.length() - 2) + "]";
  }

  public String[] toArray(){
    String[] arr = new String[size];
    for (int i = 0; i < size; i ++){
      arr[i] = data[i];
    }
    return arr;
  }
}
