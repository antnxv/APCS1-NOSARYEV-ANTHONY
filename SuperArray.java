public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public int size(){
    return size;
  }

  public boolean add(String element){
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
}
