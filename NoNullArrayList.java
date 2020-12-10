import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T>{

  public boolean add(T value){
    if (value == null) throw new IllegalArgumentException();
    else return super.add(value);
  }

  public void add(int index, T value){
    if (value == null) throw new IllegalArgumentException();
    else super.add(index, value);
  }

  public T set(int index, T value){
    if (value == null) throw new IllegalArgumentException();
    else return super.set(index, value);
  }
}
