public class MyLinkedList{
  private int size;
  private Node start,end;

  public MyLinkedList(){
    size = 0;
  }

  public int size(){
    return size;
  }

  public boolean add(String value){
    Node nde = new Node(value);
    if (size != 0){
      end.setNext(nde);
      nde.setPrev(end);
    }
    else start = nde;
    end = nde;
    size ++;
    if (end.equals(nde)) return true;
    else return false;
  }

  public void add(int index, String value){
    if (index == size) add(value);
    Node nde = new Node(value);
    if (index != 0){
      getNodeRight(index-1).setNext(nde);
      nde.setPrev(getNodeRight(index-1));
    }
    getNodeLeft(index).setPrev(nde);
    nde.setNext(getNodeLeft(index));
    size ++;
    if (index == 0) start = nde;
  }

  public String get(int index){ // Speeeeed
    if (index > size/2) return getNodeLeft(index).getData();
    else return getNodeRight(index).getData();
  }

  public String set(int index, String value){
    String oldvalue = get(index);
    if (index > size/2) getNodeLeft(index).setData(value);
    else getNodeRight(index).setData(value);
    return oldvalue;
  }

  public String toString(){
    if (size == 0) return "{}";
    String str = "{";
    for (int i = 0; i < size; i ++){
      str += get(i) + ", ";
    }
    return str.substring(0, str.length()-2) + "}";
  }

  // --- Helpers ------------------------------------------------------

  private Node getNodeRight(int index){
    Node currnde = start;
    for (int i = 0; i < index; i ++){
      currnde = currnde.getNext();
    }
    return currnde;
  }

  private Node getNodeLeft(int index){
    Node currnde = end;
    for (int i = size-1; i > index; i --){
      currnde = currnde.getPrev();
    }
    return currnde;
  }
}
