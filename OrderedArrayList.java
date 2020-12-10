import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public boolean add(T value){
    if (value == null) throw new IllegalArgumentException();
    else{
      super.add(newIndex(value), value);
      return true;
    }
  }

  public T set(int index, T value){
    if (value == null) throw new IllegalArgumentException();
    else{
      T c = get(index);
      remove(index);
      add(value);
      return c;
    }
  }

  private int newIndex(T value){
    int c = 0;
    for (int i = 0; i < size(); i ++){
      if (get(i).compareTo(value) <= 0) c ++;
    }
    return c;
  }

  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int initialCapacity){
    super(initialCapacity);
  }

}
